package pr22.task1;

public class InnException extends Throwable {
    private String message;
    public InnException(String message) {
        this.message = message;
    }
    public String getMessage() {
        return message;
    }
}
