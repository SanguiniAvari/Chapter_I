package LR_1;

import java.util.Scanner;

public class chapter_04_01_12 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert your birth year:");
        int var2 = var1.nextInt();
        var1.close();
        int var3 = 2022 - var2;
        System.out.printf("You have a " + var3 + " years.");
    }
}
