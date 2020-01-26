package Lesson19.Praktika;

/**
 * Если копирование файла завершилось неудачей будет выброшено данное исключение
 * 
 * @author nedis
 * @version 1.0
 */
public class FileCopyFailedException extends Exception {
	private static final long serialVersionUID = 1433646159143681180L;

	public FileCopyFailedException(String message) {
		super(message);
	}

	public FileCopyFailedException(String message, Throwable cause) {
		super(message, cause);
	}

}
