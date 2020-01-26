package Lesson19.Praktika;

/**
 * Интерфейс списка задач. 
 * 
 * @author nedis
 * @version 1.0
 */
public interface TasksStorage {

	/**
	 * Добавить задачу в список на исполнение. 
	 * 
	 * @param task задача для добавления 
	 * @throws NullPointerException если task == null
	 */
	void add(Task task) throws NullPointerException ;
	
	/**
	 * Получить первую задачу из списка задач и удалить её из списка. 
	 * 
	 * @return задача на исполнение или null если в списке нет задач.
	 */
	Task get();
	
	/**
	 * Возвращает количество задач в списке, которые можно взять на исполнение. 
	 * 
	 * @return количество задач в списке, которые можно взять на исполнение. 
	 */
	int count();
}
