package spring.mvc.tuto.core.services.exceptions;

/**
 * Created by Ghazi Naceur on 09/06/2017.
 */
public class BlogExistsException extends RuntimeException {
    public BlogExistsException() {
    }

    public BlogExistsException(String message) {
        super(message);
    }

    public BlogExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public BlogExistsException(Throwable cause) {
        super(cause);
    }
}
