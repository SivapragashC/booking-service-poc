package net.apmoller.crb.ohm.microservices.infrastructure.exception;


import lombok.extern.slf4j.Slf4j;
import net.apmoller.crb.ohm.microservices.common.exception.ClientErrorConnectorException;
import net.apmoller.crb.ohm.microservices.common.exception.ConnectorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

@Component
@Slf4j
public class IntegrationExceptions {
    private static final List<HttpStatus> ERROR_CODES
            = Arrays.asList(HttpStatus.BAD_REQUEST, HttpStatus.UNAUTHORIZED,
            HttpStatus.NOT_FOUND, HttpStatus.FORBIDDEN, HttpStatus.CONFLICT);

    @Autowired
    private MessageSource messageSource;

    private ConnectorException createConnectorException(Throwable throwable, String errorCode) {
        if (throwable instanceof WebClientResponseException
                && ERROR_CODES.contains(((WebClientResponseException) throwable).getStatusCode()))
            return new ClientErrorConnectorException(throwable,
                    ((WebClientResponseException) throwable).getStatusCode(), errorCode
                    , messageSource.getMessage(errorCode, null, Locale.ENGLISH));

        return new ConnectorException(throwable, HttpStatus.INTERNAL_SERVER_ERROR, errorCode, messageSource.getMessage(errorCode, null, Locale.ENGLISH));
    }

    public Function<Throwable, ConnectorException> connectorExceptionMapper(String errorCode){
        return throwable -> {
            final Optional<Throwable> optionalThrowable = Optional.of(throwable);
            final boolean isWebClientResponseExp = optionalThrowable.filter(WebClientResponseException.class::isInstance).isPresent();
            if(isWebClientResponseExp){
                WebClientResponseException ex = (WebClientResponseException) throwable;
                log.error("Error from client status {}, body {}", ex.getRawStatusCode(), ex.getResponseBodyAsString());
            } else {
                log.error("Error from webclient {}, err{}", throwable.getMessage(), throwable);
            }
            return createConnectorException(throwable, errorCode);
        };
    }

}
