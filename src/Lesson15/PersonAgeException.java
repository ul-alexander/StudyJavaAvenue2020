package Lesson15;

public class PersonAgeException extends Exception {

    public PersonAgeException() {
    }

    public PersonAgeException(String message) {
        super(message);
    }

    public PersonAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonAgeException(Throwable cause) {
        super(cause);
    }

    public PersonAgeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
