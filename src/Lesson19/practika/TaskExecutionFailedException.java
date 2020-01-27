package Lesson19.practika;

/**
 * Непредвиденные ошибки во время выполнения задачи
 * 
 * @author nedis
 * @version 1.0
 */
public class TaskExecutionFailedException extends Exception {

	private static final long serialVersionUID = -3853034940823091780L;

	public TaskExecutionFailedException(String message) {
		super(message);
	}

	public TaskExecutionFailedException(Throwable cause) {
		super(cause);
	}

	public TaskExecutionFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}
