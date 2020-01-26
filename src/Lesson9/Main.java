package Lesson9;

public class Main {
    public static void main(String[] args) {

        //Дробь 1
        FractionNumberImpl fractionNumber1 = new FractionNumberImpl(2, 15);
        //Дробь 2
        FractionNumberImpl fractionNumber2 = new FractionNumberImpl(12, 35);
        //////////////////////////////////

        //Интерфейс калькулятора
        FractionNumberOperationImpl calculator = new FractionNumberOperationImpl();
        //Addition (сложение)
        FractionNumber result = calculator.add(fractionNumber1, fractionNumber2);
        System.out.println(result);
        //Subtraction (вычитание)
        FractionNumber result2 = calculator.sub(fractionNumber1, fractionNumber2);
        System.out.println(result2);
        //Multiplication (умножение)
        FractionNumber result3 = calculator.mul(fractionNumber1, fractionNumber2);
        System.out.println(result3);
        //Division (деление)
        FractionNumber result4 = calculator.div(fractionNumber1, fractionNumber2);
        System.out.println(result4);
    }
}
