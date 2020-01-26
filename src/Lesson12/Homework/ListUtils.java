package Lesson12.Homework;

import java.util.List;

/**
 * Утилитный класс для работы со списками
 * 
 * @author nedis
 * @version 1.0
 */
public interface ListUtils {

	/**
	 * Конвертирует переменное число параметров в список строк
	 * 
	 * @param strings переменное число аргументов
	 * @return список строк
	 * @throws IllegalArgumentException если один из аргументов null
	 */
	List<String> asList (String ... strings) throws IllegalArgumentException;
	
	/**
	 * Возвращает отсортированный список в обратном порядке (по убыванию)
	 * <b>Исходный список не должен быть изменен</b>
	 * 
	 * @param data исходный список
	 * @return отсортированный список по убыванию
	 * @throws IllegalArgumentException если data = null
	 */
	List<Double> sortedList(List<Double> data) throws IllegalArgumentException;
}
