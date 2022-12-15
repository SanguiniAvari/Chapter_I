package TIMUS;

import java.io.PrintWriter;
import java.util.Scanner;

public class T_04_1409 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int numberOfCans = a + b - 1;
        int harry = numberOfCans - a;
        int larry = numberOfCans - b;


        System.out.println(harry+" "+larry);
        out.flush();
    }
}
