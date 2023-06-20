package cat.barcelonactiva.tech4good.model.exception;

public class UserDuplicatedException extends RuntimeException{

    public UserDuplicatedException(String message) {
        super(message);
    }
}
