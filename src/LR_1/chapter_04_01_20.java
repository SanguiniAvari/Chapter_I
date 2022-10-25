package LR_1;
import java.io.PrintStream;
import java.util.Scanner;
public class chapter_04_01_20 {


        public static void main(String[] var0) {
            Scanner var1 = new Scanner(System.in);
            System.out.println("Insert argument: ");
            double var2 = var1.nextDouble();
            System.out.println("Insert stepen: ");
            int var4 = var1.nextInt();
            var1.close();
            PrintStream var10000 = System.out;
            double var10001 = Math.pow(var2, (double)var4);
            var10000.println("kvadrat Р°=" + var10001);
        }
}
