package Lesson19.practika;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Задача поиска файла(ов) в заданной директории по указанному шаблону.
 * Данный таск ищет файлы в директории directory по шаблону searchString. 
 * Результат выводится в выходной поток out. Результатом является массив полных путей к файлам
 * 
 * @author nedis
 * @version 1.0
 */
public interface FindFilesTask extends Task {
	
	/**
	 * Устанавливает путь к директории
	 * 
	 * @param directory путь к директории
	 * @throws NullPointerException если directory = null
	 * @throws FileNotFoundException если директория не существует
	 */
	void setDirectory(String directory) throws NullPointerException, FileNotFoundException;
	
	/**
	 * Строка поиска с поддержкой Windows совместимых шаблонов: 
	 * <br/>* - любое количество символов
	 * <br/>? - один символ
	 * 
	 * @param searchString строка поиска
	 * @throws IllegalArgumentException если searchString = null
	 */
	void setFileNameSearchString(String searchString) throws IllegalArgumentException;
	
	/**
	 * Устанавливает выходной поток, куда задача будет выводить результаты поиска
	 * 
	 * @param out выходной поток, куда задача будет выводить результаты поиска
	 */
	void setPrintStream(PrintStream out);
}
