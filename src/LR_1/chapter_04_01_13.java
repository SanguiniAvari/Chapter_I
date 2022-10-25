package LR_1;

import java.util.Scanner;

public class chapter_04_01_13 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert your name:");
        String var2 = var1.next();
        System.out.print("Insert your birth year:");
        int var3 = var1.nextInt();
        var1.close();
        int var4 = 2022 - var3;
        System.out.printf("Hello " + var2 + ". Are you knew, that you is granny! You have a " + var4 + " years old!");
    }
}
