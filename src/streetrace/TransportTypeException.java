package streetrace;

public class TransportTypeException extends RuntimeException {
    public TransportTypeException() {
    }

    public TransportTypeException(String message) {
        super(message);
    }

    public TransportTypeException(String message, Throwable cause) {
        super(message, cause);
    }

    public TransportTypeException(Throwable cause) {
        super(cause);
    }

    public TransportTypeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
