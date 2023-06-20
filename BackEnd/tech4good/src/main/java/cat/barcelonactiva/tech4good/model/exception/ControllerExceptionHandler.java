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

    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ResponseEntity<Message> userNotFoundExceptionHandler(UserNotFoundException exception, WebRequest request) {

        return new ResponseEntity<>(new Message(HttpStatus.NOT_FOUND.value(), LocalDateTime.now(), exception.getMessage(), request.getDescription(false)), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(UserDuplicatedException.class)
    @ResponseStatus(value = HttpStatus.NOT_ACCEPTABLE)
    public ResponseEntity<Message> userDuplicatedExceptionHandler(UserDuplicatedException exception, WebRequest request) {

        return new ResponseEntity<>(new Message(HttpStatus.NOT_ACCEPTABLE.value(), LocalDateTime.now(), exception.getMessage(), request.getDescription(false)), HttpStatus.NOT_ACCEPTABLE);
    }

}
