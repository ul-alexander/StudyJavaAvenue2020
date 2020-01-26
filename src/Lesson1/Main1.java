package Lesson1;

public class Main1 {

    public static void main(String[] args) {

        int tourCost = 20000;
        int moneyRightNow = 10000;
        int monthToTrip = 4;
        int salary = 2000;

        int savedMoneyAtThisPeriod = salary * monthToTrip;
        int totalMoneyBeforeTrip = moneyRightNow + savedMoneyAtThisPeriod;

        if(totalMoneyBeforeTrip < tourCost){
            System.out.println("Мы не едем в тур");
        }else {
            System.out.println("Деньги есть");
        }
    }
}
