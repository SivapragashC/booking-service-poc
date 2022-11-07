package net.apmoller.crb.ohm.microservices.common.exception;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import net.apmoller.crb.ohm.microservices.common.constant.BookingOrderConstants;
import net.apmoller.crb.ohm.microservices.common.model.Alert;
import org.springframework.http.HttpStatus;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import java.net.ConnectException;
import java.util.List;

@Getter
@Setter(AccessLevel.PROTECTED)
public class ConnectorException extends BaseOrderException {
    private static final long serialVersionUID = 8765765767878552356L;

    protected WebClientResponseException webClientResponseException;

    protected ConnectException connectException;

    public ConnectorException(Throwable throwable) {
        super(throwable, BookingOrderConstants.CONNECTOR_EXCEPTION);
        this.initConnectorException(throwable);
    }

    public ConnectorException(Throwable throwable, HttpStatus httpStatus) {
        super(throwable, httpStatus, BookingOrderConstants.CONNECTOR_EXCEPTION);
    }

    public ConnectorException(Throwable throwable, HttpStatus httpStatus, String errCode, String errMessage) {
        super(throwable, httpStatus, errMessage);
    }

    public ConnectorException(HttpStatus httpStatus, List<Alert> alerts) {
        super(httpStatus, alerts);
        this.alerts = alerts;
        this.httpStatus = httpStatus;
    }

    protected void initConnectorException(Throwable throwable) {
        if (throwable instanceof WebClientResponseException) {
            webClientResponseException = (WebClientResponseException) throwable;
        } else if (throwable instanceof ConnectException) {
            connectException = (ConnectException) throwable;
        }
    }

    public ConnectException getConnectException() {
        return connectException;
    }

    public WebClientResponseException getWebClientResponseException() {
        return webClientResponseException;
    }

}
