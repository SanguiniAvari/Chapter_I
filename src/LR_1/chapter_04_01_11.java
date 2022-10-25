package LR_1;

import java.util.Scanner;

public class chapter_04_01_11 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert Month:");
        String var2 = var1.next();
        System.out.print("Insert how many day of month:");
        int var3 = var1.nextInt();
        var1.close();
        System.out.printf(var2 + " is have a " + var3 + " days");
    }
}
