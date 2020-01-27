package Lesson19.practika;

/**
 * Интерфейс абстрактной задачи. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface Task {
	public static final int a = 0;
	
	/**
	 * Возвращает количество попыток исполнения задачи
	 * 
	 * @return количество попыток исполнения задачи
	 */
	int getTryCount();
	
	/**
	 * Увеличить количество попыток исполнения задачи на 1. 
	 */
	void incTryCount();
	
	/**
	 * Метод, который исполняет задачу. 
	 * 
	 * @throws TaskExecutionFailedException если задача не была выполнена корректно
	 */
	void execute() throws TaskExecutionFailedException;
}
