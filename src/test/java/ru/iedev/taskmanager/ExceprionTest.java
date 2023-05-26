package ru.iedev.taskmanager;

public class ExceprionTest extends Exception{

    @Override
    public String getMessage() {
        return super.getMessage();
    }

    public ExceprionTest() {
        super();
    }

    public ExceprionTest(String message) {
        super(message);
    }

    public ExceprionTest(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceprionTest(Throwable cause) {
        super(cause);
    }

    protected ExceprionTest(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
