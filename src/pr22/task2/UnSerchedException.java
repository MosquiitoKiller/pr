package pr22.task2;

public class UnSerchedException extends Throwable {
    private String message;

    public UnSerchedException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
