package hello.jdbc.repository.ex;

public class MyDbException extends RuntimeException {                               // RuntimeException 이기 때문에 이거는 Uncheck Exception

    public MyDbException() {
    }

    public MyDbException(String message) {
        super(message);
    }

    public MyDbException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDbException(Throwable cause) {
        super(cause);
    }
}
