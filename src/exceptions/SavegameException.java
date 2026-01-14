package exceptions;

public class SavegameException extends Exception {

    public SavegameException(String message) {
        super(message);
    }

    public SavegameException(String message, Throwable cause) {
        super(message, cause);
    }
}
