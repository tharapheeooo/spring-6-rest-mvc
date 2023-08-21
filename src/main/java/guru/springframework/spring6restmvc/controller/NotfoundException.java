package guru.springframework.spring6restmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Value Not Found")
public class NotfoundException extends RuntimeException{
    public NotfoundException() {
    }

    public NotfoundException(String message) {
        super(message);
    }

    public NotfoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotfoundException(Throwable cause) {
        super(cause);
    }

    public NotfoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
