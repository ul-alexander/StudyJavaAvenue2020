package Lesson12.Homework;

import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/**
 * Утилитный класс для работы с множествами
 * 
 * @author nedis
 * @version 1.0
 */
public interface SetUtils {
	
	/**
	 * Возвращает отсортированное множество в обратном порядке (по убыванию) как объединение двух коллекций
	 * collection1 - коллекция чисел (Нужно привести каждое число к строковому представлению) и set2 - множество 
	 * неотсортированных строк
	 * 
	 * @param collection1 коллекция чисел
	 * @param set2 множество неотсортированных строк
	 * @return отсортированное множество в обратном порядке
	 * @throws NullPointerException если collection1 или set2 == null
	 */
	SortedSet<String> orderedSet(Collection<Integer> collection1, Set<String> set2) throws NullPointerException;
	
	/**
	 * Возвращает множество чисел val1,val2,val3,val4,val5 в таком же порядке
	 * 
	 * @param val1 аргумент функции
	 * @param val2 аргумент функции
	 * @param val3 аргумент функции
	 * @param val4 аргумент функции
	 * @param val5 аргумент функции
	 * @return упорядоченное множество в заданном порядке
	 */
	Set<Integer> customOrderSet(int val1, int val2, int val3, int val4,int val5);
}
