package LR_1;

import java.util.Scanner;

public class chapter_04_01_5 {
    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.print("Input name: ");
        String var2 = var1.nextLine();
        System.out.print("Input age: ");
        int var3 = var1.nextInt();
        System.out.print("Input height: ");
        float var4 = var1.nextFloat();
        System.out.printf("Name: %s Age: %d Height: %.2f \n", var2, var3, var4);
        var1.close();
    }
}
