package net.apmoller.crb.ohm.microservices.common.exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import net.apmoller.crb.ohm.microservices.application.model.Order;
import net.apmoller.crb.ohm.microservices.common.model.Alert;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@ToString
@Getter
@Setter(AccessLevel.PROTECTED)
@JsonIgnoreProperties({"mostSpecificCause"})
public abstract class BaseOrderException extends ResponseStatusException {

    private  static final long serialVersionUID = -20200405L;

    protected Throwable throwable;

    protected String errorCode;

    protected String errorMessage;

    protected HttpStatus httpStatus;

    protected List<Alert> alerts;

    protected Order order;

    public BaseOrderException(Throwable throwable, String errorMessage) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage, throwable);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.throwable = throwable;
        this.errorMessage = errorMessage;
    }

    public BaseOrderException(Throwable throwable,String errorCode, String errorMessage) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage, throwable);
        this.httpStatus = HttpStatus.INTERNAL_SERVER_ERROR;
        this.throwable = throwable;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BaseOrderException(HttpStatus httpStatus, String errorMessage) {
        super(httpStatus, errorMessage);
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
    }

    public BaseOrderException(Throwable throwable, HttpStatus httpStatus, String errorMessage) {
        super(httpStatus, errorMessage, throwable);
        this.httpStatus = httpStatus;
        this.throwable = throwable;
        this.errorMessage = errorMessage;
    }

    public BaseOrderException(Throwable throwable, HttpStatus httpStatus, String errorCode, String errorMessage) {
        super(httpStatus, errorMessage, throwable);
        this.httpStatus = httpStatus;
        this.throwable = throwable;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }

    public BaseOrderException(HttpStatus httpStatus, String errorCode, String errorMessage) {
        super(httpStatus, errorMessage);
        this.httpStatus = httpStatus;
        this.errorMessage = errorMessage;
        this.errorCode = errorCode;
    }
    public BaseOrderException(HttpStatus httpStatus,List<Alert> alerts) {
        super(httpStatus);
        this.httpStatus = httpStatus;
        this.alerts = alerts;
    }

    public BaseOrderException(HttpStatus httpStatus, List<Alert> alerts, Order order) {
        super(httpStatus);
        this.httpStatus = httpStatus;
        this.alerts = alerts;
        this.order = order;
    }
}
