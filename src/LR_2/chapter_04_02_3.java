package LR_2;

import java.util.Scanner;

public class chapter_04_02_3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число, которое делится на 4 и не меньше 10: ");
        int num = Scanner.nextInt();
        Scanner.close();
        if (num % 4 == 0 && num > 9) {
            System.out.println("Число удовлетворяет требованиям.");
        } else {
            System.out.println("Число порочно.");
        }

    }
}
