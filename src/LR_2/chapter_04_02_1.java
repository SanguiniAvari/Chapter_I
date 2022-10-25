package LR_2;

import java.util.Scanner;

public class chapter_04_02_1 {

        public static void main(String[] args) {
            Scanner impArg = new Scanner(System.in);
            System.out.println("Укажите числовую переменную: ");
            int num = impArg.nextInt();
            impArg.close();
            if (num % 3 == 0) {
                System.out.println("Введенное число делится на 3 без остатка.");
            } else {
                System.out.println("" + num + " Что-то не так.");
            }

        }
    }

