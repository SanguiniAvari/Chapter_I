package LR_2;

import java.util.Scanner;

public class chapter_04_02_4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число, которое попадает в диапазон от 5 до 10 включительно: ");
        int num = Scanner.nextInt();
        Scanner.close();
        if (num > 4 && num < 11) {
            System.out.println("Число удовлетворяет требованиям.");
        } else {
            System.out.println("Число порочно.");
        }
    }
}
