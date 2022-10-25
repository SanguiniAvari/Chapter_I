package LR_1;

import java.util.Scanner;

public class chapter_04_01_10 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert Day of week:");
        String var2 = var1.next();
        System.out.print("Insert Month:");
        String var3 = var1.next();
        System.out.print("Insert Date:");
        int var4 = var1.nextInt();
        var1.close();
        System.out.printf("insert is " + var2 + " " + var4 + " " + var3);
    }
}
