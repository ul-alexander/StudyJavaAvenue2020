package Lesson9;

/**
 * Интерфейс представляющий число в виде дроби. Для вывода ошибок функции могут бросать IllegalArgumentException
 * Данный интерфейс может быть использован для хранения обычных дробей, например 1/2, 1/4, 3/7 и т.д.
 * 
 * @author nedis
 * @version 1.0
 */
public interface FractionNumber {

	/**
	 * Значение делителя после создания объкта конструктором
	 */
	int DEFAULT_DIVISOR_VALUE = 1;
	/**
	 * Установить делимое 
	 * 
	 * @param dividend делимое
	 */
	void setDividend(int dividend);
	
	/**
	 * Получить делимое 
	 * 
	 * @return делимое
	 */
	int getDividend();
	
	/**
	 * Установить делитель 
	 * 
	 * @param divisor делитель 
	 * @throws IllegalArgumentException если пытаются установить делитель равный 0
	 */
	void setDivisor(int divisor) throws IllegalArgumentException;
	
	/**
	 * Получить делитель
	 * 
	 * @return делитель
	 */
	int getDivisor();
	
	/**
	 * Получить значение как вещественное число. 
	 * Например если делимое = 1, делитель = 4, то вещественное число для дроби 1/4 = 0.25 
	 * 
	 * @return вещественное число для заднной дроби
	 */
	double value();
	
	/**
	 * Получить символьное представление числа
	 * Например если делимое = 1, делитель = 4, то символьное представление числа равно 1/4
	 * 
	 * @return символьное представление числа
	 */
	String toString();
}

