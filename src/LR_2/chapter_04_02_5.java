package LR_2;

import java.util.Scanner;

public class chapter_04_02_5 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int num = Scanner.nextInt();
        Scanner.close();
        System.out.println(num / 1000 + " тысяч.");
    }
}
