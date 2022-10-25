package LR_1;

import java.io.PrintStream;
import java.util.Scanner;

public class chapter_04_01_19 {
    static double c;
    static double j;
     public static double hyp(double var0, double var2) {
        return c = Math.sqrt(var0 * var0 + var2 * var2);
    }
    public static double form(double var0, double var2) {
        return j = Math.exp(var2 * Math.log(var0));
    }

    public static void main(String[] var0) {
        Scanner var1 = new Scanner(System.in);
        System.out.println("Insert katet: ");
        double var2 = var1.nextDouble();
        System.out.println("Insert katet 2: ");
        double var4 = var1.nextDouble();
        var1.close();
        System.out.println("katet Р°=" + var2);
        System.out.println("katet b=" + var4);
        PrintStream var10000 = System.out;
        double var10001 = hyp(var2, var4);
        var10000.println("hypotenuse СЃ=" + var10001);
        var10000 = System.out;
        var10001 = form(var2, var4);
        var10000.println("formula iz 11 zadaniya j=" + var10001);
    }
}
