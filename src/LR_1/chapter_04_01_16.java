package LR_1;

import java.util.Scanner;

public class chapter_04_01_16 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert number: ");
        int var2 = var1.nextInt();
        var1.close();
        int var3 = var2 - 1;
        int var4 = var2 + 1;
        int var5 = (var2 + var4 + var3) * (var2 + var4 + var3);
        System.out.printf("na edinicu men'she = " + var3 + " vvedennoe chislo = " + var2 + " na edinicu bol'she = " + var4 + " square = " + var5 + ".");
    }
}
