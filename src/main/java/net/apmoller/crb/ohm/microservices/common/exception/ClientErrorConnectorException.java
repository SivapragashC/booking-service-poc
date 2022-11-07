package net.apmoller.crb.ohm.microservices.common.exception;

import net.apmoller.crb.ohm.microservices.common.model.Alert;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ClientErrorConnectorException extends  ConnectorException{
    public ClientErrorConnectorException(Throwable throwable) {
        super(throwable);
    }

    public ClientErrorConnectorException(Throwable throwable, HttpStatus httpStatus) {
        super(throwable, httpStatus);
    }

    public ClientErrorConnectorException(Throwable throwable, HttpStatus httpStatus, String errCode, String errMessage) {
        super(throwable, httpStatus, errCode, errMessage);
    }

    public ClientErrorConnectorException(HttpStatus httpStatus, List<Alert> alerts) {
        super(httpStatus, alerts);
    }
}
