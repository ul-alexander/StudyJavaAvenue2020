package Lesson2;

import Lesson4.FigureUtils;

public class Main4 {
    public static void main(String[] args) {
        /*
         * напечатать на консоль цыфры от 100 до 150 которые делятся на 5 без остатка
         * */

        for (int i = 100; i < 150; i++){

            if( i  % 5 == 0){
                System.out.println(i);
            }
        }

        FigureUtils.printTypeOfTriangle(5,6,7);

    }
}
