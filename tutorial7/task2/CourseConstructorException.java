package tutorial7.task2;

public class CourseConstructorException extends Exception {

    /**
     * 
     */
    public CourseConstructorException() {
    }

    /**
     * @param message
     */
    public CourseConstructorException(String message) {
        super(message);
    }

    /**
     * @param message
     * @param cause
     */
    public CourseConstructorException(String message, Throwable cause) {
        super(message, cause);
    }
    
}
