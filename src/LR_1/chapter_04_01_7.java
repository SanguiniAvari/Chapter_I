package LR_1;

import java.util.Scanner;

public class chapter_04_01_7 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Radius kruga: ");
        int var2 = var1.nextInt();
        long var3 = Math.round(Math.PI * Math.pow((double)var2, 2.0));
        System.out.printf("S kruga s R %d = %d \n", var2, var3);
    }
}
