package Lesson12;

public class Coin implements Comparable<Coin> {

    //Свойства обьекта
    private double diameter;
    private int year;
    private int nominal;

    //Конструктор пустой
    //НЕ устанавливает автоматически свойства
    //Вызывается автоматически ,
    //Обязателен если его не будет то появится ошибка при наследование класса
    public Coin() {
    }

    //Конструктор не пустой
    //Принимает свойства и автоматически их устанавливает
    public Coin(double diameter, int year, int nominal) {
        this.diameter = diameter;
        this.year = year;
        this.nominal = nominal;
    }

    // Методы Гетеры и Сеторы
    // После создания обьекта используются для доступа к свойствам обращаемого обьекта
    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    //Переопределения метода
    // Преобразовать в строку
    @Override
    public String toString() {
        String str = "Диаметр монеты : " + this.diameter + " Год монеты : " + this.year + " Номинал монеты : " + this.nominal;
        return str;
    }

    //Переопределение Метода сравнение
    //Равенства элементов
    //Задача состоит в сарвнения свойств обьекта
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Coin)) return false;

        Coin coin = (Coin) o;

        if (Double.compare(coin.getDiameter(), getDiameter()) != 0) return false;
        if (getYear() != coin.getYear()) return false;
        return getNominal() == coin.getNominal();
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getDiameter());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getYear();
        result = 31 * result + getNominal();
        return result;
    }

    //Переопределение метода созданного в интерфейсе Comparable
    @Override

    //Реализация метода ИНтерфейса
    public int compareTo(Coin o) {
        //this текущая монета
        int year1 = this.year;
        // o приходящая монета
        int year2 = o.year;
        //логика сортировки (по годам) по бинарному дереву Трисет
        if (year1 != year2) {
            //int result = year1 - year2;
            int result = year1 - year2;
            return result;
        }
        //логика сортировки (по номиналам) по бинарному дереву Трисет
        if (this.nominal != o.nominal) {
            return  this.nominal - o.nominal;
        }
        //логика сортировки (по диаметру) по бинарному дереву Трисет
        //return по умолчанию
        return (int)this.diameter - (int)o.diameter;
    }
}

