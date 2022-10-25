package LR_1;

import java.util.Scanner;

public class chapter_04_01_17 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert number of one: ");
        int var2 = var1.nextInt();
        System.out.print("Insert number of two: ");
        int var3 = var1.nextInt();
        var1.close();
        int var4 = var2 + var3;
        int var5 = var2 - var3;
        System.out.printf("summa = " + var4 + " raznost = " + var5);
    }
}
