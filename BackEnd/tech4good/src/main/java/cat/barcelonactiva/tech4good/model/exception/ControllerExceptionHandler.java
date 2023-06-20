package cat.barcelonactiva.tech4good.model.exception;

import cat.barcelonactiva.tech4good.model.dto.Message;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<Message> IllegalArgumentExceptionExceptionHandler(IllegalArgumentException exception, WebRequest request) {

        return new ResponseEntity<>(new Message(HttpStatus.NOT_FOUND.value(), LocalDateTime.now(), exception.getMessage(), request.getDescription(false)), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(Exception.class)
    @ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<Message> ExceptionHandler(Exception exception, WebRequest request) {

        return new ResponseEntity<>(new Message(HttpStatus.NOT_ACCEPTABLE.value(), LocalDateTime.now(), exception.getMessage(), request.getDescription(false)), HttpStatus.NOT_ACCEPTABLE);
    }

}
