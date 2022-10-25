package LR_1;

import java.util.Scanner;

public class chapter_04_01_9 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Insert Name:");
        String var2 = var1.next();
        System.out.print("Insert age:");
        int var3 = var1.nextInt();
        var1.close();
        System.out.printf("Hello " + var2 + "! how long you have " + var3 + " years old?");
    }
}
