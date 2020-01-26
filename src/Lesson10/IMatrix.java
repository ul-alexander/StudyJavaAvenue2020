package Lesson10;

/**
 * Интерфейс работы с матрицами
 * 
 * @author nedis
 * @version 1.0
 */
public interface IMatrix {
	
	/**
	 * Размер матрицы для конструктора без параметров
	 */
	int DEFAULT_MATRIX_SIZE = 1;
	
	/**
	 * Возвращает количество строк матрицы
	 * 
	 * @return количесвто строк матрицы
	 */
	int getRows ();
	
	/**
	 * Возвращает количество столбцов матрицы
	 * 
	 * @return количество столбцов матрицы
	 */
	int getColumns ();
	
	/**
	 * Возвращает элемент матрицы по индексам
	 * 
	 * @param rowIndex индекс строки 
	 * @param colIndex индекс столбца
	 * @return элемент матрицы по индексам
	 * @throws IndexOutOfBoundsException если индекс строки меньше нуля или больше (или равно) количества строк матрицы
	 * 			или индекс столбца меньше нуля или больше (или равно) количества столбцов матрицы
	 */
	double getValueAt (int rowIndex, int colIndex) throws IndexOutOfBoundsException;
	
	/**
	 * Устанавливает элемент матрицы по индексам
	 * 
	 * @param rowIndex индекс строки 
	 * @param colIndex индекс столбца
	 * @param value новое значение элемента
	 * @throws IndexOutOfBoundsException если индекс строки меньше нуля или больше (или равно) количества строк матрицы
	 * 			или индекс столбца меньше нуля или больше (или равно) количества столбцов матрицы
	 */
	void setValueAt (int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException;
	
	/**
	 * Возвращает сумму текущей матрицы и второго аргумента. <br/>
	 * <b><i>(После выполнения функции текущая матрица не должна быть изменена! Результат операции - новый объект матрицы) </i></b>
	 * 
	 * @param otherMatrix второй аргумент (матрица)
	 * @return сумма матриц <b><i>(новый объект матрицы)</i></b>
	 * @throws IllegalArgumentException если текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов
	 * @throws NullPointerException если второй аргумент null
	 */
	IMatrix add (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;
	
	/**
	 * Возвращает разность текущей матрицы и второго аргумента.<br/>
	 * <b><i>(После выполнения функции текущая матрица не должна быть изменена! Результат операции - новый объект матрицы) </i></b> 
	 * 
	 * @param otherMatrix второй аргумент (матрица)
	 * @return разность матриц <b><i>(новый объект матрицы)</i></b>
	 * @throws IllegalArgumentException если текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов
	 * @throws NullPointerException если второй аргумент null
	 */
	IMatrix sub (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;
	
	/**
	 * Возвращает произведение текущей матрицы и второго аргумента.<br/>
	 * <b><i>(После выполнения функции текущая матрица не должна быть изменена! Результат операции - новый объект матрицы) </i></b> 
	 * 
	 * @param otherMatrix второй аргумент (матрица)
	 * @return произведение матриц <b><i>(новый объект матрицы)</i></b>
	 * @throws IllegalArgumentException если текущая матрица и второй аргумент имеют несовместимое количество строк и (или) столбцов
	 * @throws NullPointerException если второй аргумент null
	 */
	IMatrix mul (IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException;
	
	/**
	 * Возвращает произведение текущей матрицы на число.<br/>
	 * <b><i>(После выполнения функции текущая матрица не должна быть изменена! Результат операции - новый объект матрицы) </i></b>
	 * 
	 * @param value число
	 * @return произведение <b><i>(новый объект матрицы)</i></b>
	 */
	IMatrix mul (double value);
	
	/**
	 * Возвращает транспонированную матрицу по отношению к текущей
	 * 
	 * @return транспонированная матрица по отношению к текущей
	 */
	IMatrix transpose();
	
	/**
	 * Заполняет текущю матрицу заднным значением
	 * 
	 * @param value значение
	 */
	void fillMatrix (double value);
	
	/**
	 * Вычисляет детерминант матрицы.<br/>
	 * Описание алгоритма для любой матрицы тут: <a target="_blank" href="http://ru.wikipedia.org/wiki/LU-%D1%80%D0%B0%D0%B7%D0%BB%D0%BE%D0%B6%D0%B5%D0%BD%D0%B8%D0%B5">LU-разложение</a>
	 * 
	 * @return детерминант
	 */
	double determinant();
	
	/**
	 * Проверяет является ли текущая матрица нулевой<br/>
	 * Нулевая матрица - матрица у которой все элементы нули:
	 * 
	 * <table>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * </table>
	 * 
	 * @return <b>true</b> если текущая матрица нулевая
	 */
	boolean isNullMatrix();
	
	/**
	 * Проверяет является ли текущая матрица единичной<br/>
	 * Единичная матрица - матрица у которой на главной диагонали единицы, а остальные элементы нули:
	 * 
	 * <table>
	 * <tr><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td></tr>
	 * <tr><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;0&nbsp;&nbsp;</td><td>&nbsp;&nbsp;1&nbsp;&nbsp;</td></tr>
	 * </table>
	 * 
	 * @return <b>true</b> если текущая матрица единичная
	 */
	boolean isIdentityMatrix();
	
	/**
	 * Проверяет является ли текущая матрица квадратной. <br/>
	 * Т.е. матрица у которой количество строк равно количеству столбцов<br/>
	 * 
	 * @return <b>true</b> если текущая матрица квадратная
	 */
	boolean isSquareMatrix ();
	
	/**
	 * Вывод матрицу на консоль
	 * @see System.out.println()
	 */
	void printToConsole ();
}
