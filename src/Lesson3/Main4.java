package Lesson3;

public class Main4 {
    public static void main(String[] args) {

        String password = "AaAaAaAa1*";

        //=================================================
        //символ
        char ch;
        //int counter = 0;

        //===========================
        //Содержит ли пробел
        boolean haveWhiteSpace = false;
        //Содержит ли большую букву
        boolean haveBigCase = false;
        //Содержит ли маленькую букву
        boolean haveLowCase = false;
        //Содержит ли число
        boolean haveNumber = false;
        //Содержит ли символ
        boolean haveSymbol = false;

        //Проверка на длинну пароля
        if (password.length() < 8) {
            System.out.println("Пароль должен содержать не менее 8 символов");
            return;
        }

        //=================================================
        //Проверка на пробелы
        for (int i = 0; i < password.length(); i++) {
            //Проверяемый символ
            ch = password.charAt(i);
            //Проверка символа на  пробел
            if (Character.isWhitespace(ch)) {
                haveWhiteSpace = true;
            }
        }

        //=================================================
        //Проверка символа на Большую букву

        //Счетчик
        int counter1 = 0;
        for (int i = 0; i < password.length(); i++) {
            //Проверяемый символ
            ch = password.charAt(i);
            //Проверка символа на Большую букву
            if (Character.isUpperCase(ch)) {
                counter1++;
            }

        }
        //Если 0 то ошибка
        if (counter1 == 0) {
            haveBigCase = true;
        }

        //=================================================
        //Проверка символа на Маленькую букву
        //Счетчик
        int counter2 = 0;

        for (int i = 0; i < password.length(); i++) {
            //Проверяемый символ
            ch = password.charAt(i);
            //Проверка символа на Маленькую букву
            if (Character.isLowerCase(ch)) {
                counter2++;
            }
        }
        //Если 0 то ошибка
        if (counter2 == 0) {
            haveLowCase = true;
        }
        //=================================================
        //Проверка символа на число
        //Счетчик
        int counter3 = 0;

        for (int i = 0; i < password.length(); i++) {
            //Проверяемый символ
            ch = password.charAt(i);
            //Проверка символа на число
            if (Character.isDigit(ch)) {
                counter3++;
            }
        }
        //Если 0 то ошибка
        if (counter3 == 0) {
            haveNumber = true;
        }
        //=================================================
        //Проверка символа на символ
        //Счетчик

        /*int counter4 = 0;

        for (int i = 0; i < password.length(); i++) {
            //Проверяемый символ
            ch = password.charAt(i);
            //Проверка символа на символ
            if (Character.(ch)) {
                counter4++;
            }
        }
        //Если 0 то ошибка
        if (counter4 == 0) {
            haveSymbol = true;
        }
        */
        //=================================================
        if (haveWhiteSpace) {
            System.out.println("Ошибка Пароль содержит пробелы");
            return;
        }
        if (haveBigCase) {
            System.out.println("Пароль не содержит Большой Буквы");
            return;
        }
        if (haveLowCase) {
            System.out.println("Пароль не содержит маленькую букву");
            return;
        }
        if (haveNumber) {
            System.out.println("Пароль не содержит число");
            return;
        }
        /*if (haveSymbol) {
            System.out.println("Пароль не содержит символа  например : * , $ ,# , &");
            return;
        }*/

    }
}
