package Lesson19.Praktika;

/**
 * Интерфейс исполнителя задач. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface TaskExecutor {

	/**
	 * Установить хранилище задач. 
	 * 
	 * @param storage хранилище задач.
	 * @throws NullPointerException если хранилище задач = null
	 */
	void setStorage(TasksStorage storage) throws NullPointerException;
	
	/**
	 * Получить текущее хранилище задач. 
	 * 
	 * @return текущее хранилище задач. 
	 */
	TasksStorage getStorage();
	
	/**
	 * Запустить исполнитель задач. 
	 * 
	 * @throws NullPointerException если storage == null 
	 * @throws IllegalStateException в случаях когда вызов функции не возможен или неверен (повторный вызов без вызова stop)
	 */
	void start() throws NullPointerException, IllegalStateException;
	
	/**
	 * Остановить исполнитель задач. При остановке исполнитель должен дождаться завершения текущей задачи, если 
	 * таковая есть и только затем завершать исполняющую нить и совершать выход из функции. 
	 * 
	 * @throws IllegalStateException в случаях когда вызов функции не возможен или неверен (вызов stop без вызова start)
	 */
	void stop() throws IllegalStateException;
}
