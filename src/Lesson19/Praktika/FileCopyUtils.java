package Lesson19.Praktika;

import java.io.FileNotFoundException;

/**
 * Интерфейс копирования файлов
 * 
 * @author nedis
 * @version 1.0
 */
public interface FileCopyUtils {
	
	/**
	 * Функция копирования файла source в файл destination. Source и destination - это пути к файлам
	 * 
	 * @param source путь к исходному файлу
	 * @param destination путь к целевому файлу
	 * @throws FileAlreadyExistsException если целевой файл уже существует
	 * @throws FileCopyFailedException если произошла какая-нибудь ошибка при копировании файлов, в cause следует указать источник ошибки
	 */
	void copyFile(String source, String destination) throws FileCopyFailedException, FileAlreadyExistsException, FileNotFoundException;
}
