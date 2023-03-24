package hello.jdbc.repository.ex;

public class MyDuplicateKeyException extends MyDbException {                    // 이 예외는 데이터 중복의 경우에만 던진다.

    public MyDuplicateKeyException() {
    }

    public MyDuplicateKeyException(String message) {
        super(message);
    }

    public MyDuplicateKeyException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyDuplicateKeyException(Throwable cause) {
        super(cause);
    }
}
