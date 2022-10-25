package LR_2;

import java.util.Scanner;

public class chapter_04_02_2 {
    public static void main(String[] args) {
        Scanner impArg = new Scanner(System.in);
        System.out.println("Введите число, которое при делении на 5 имеет остаток 2 и при делении на 7 в остатке имеет 1:");
        int num = impArg.nextInt();
        impArg.close();
        if (num % 5 == 2 && num % 7 == 1) {
            System.out.println("Введенное число удовлетворяет требованиям.");
        } else {
            System.out.println("Число порочно.");
        }

    }
}
