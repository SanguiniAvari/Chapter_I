package TIMUS;

import java.io.PrintWriter;
import java.util.Scanner;

public class T_04_1293 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = (n * (a*b))*2;

        System.out.println(result);
        out.flush();
    }
}
