package LR_1;

import java.util.Scanner;

public class chapter_04_01_8 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert Lastname:");
        String var2 = var1.next();
        System.out.print("Insert Name:");
        String var3 = var1.next();
        System.out.print("Insert patronymic:");
        String var4 = var1.next();
        var1.close();
        System.out.printf("Hello " + var2 + " " + var3 + " " + var4);
    }
}
