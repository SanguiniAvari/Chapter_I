package TIMUS;

import java.util.Scanner;

public class T_04_1785 {
    static void p(String A){
        System.out.print(A);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = scanner.nextInt();
        scanner.close();
        if (inp<5){
            p("few");
        } else if (inp>4 && inp<10) {
            p("several");
        } else if (inp>9 && inp<20) {
            p("pack");
        } else if (inp>19 && inp<50) {
            p("lots");
        } else if (inp>49 && inp<100) {
            p("horde");
        } else if (inp>99 && inp<250) {
            p("throng");
        } else if (inp>249 && inp<500) {
            p("swarm");
        } else if (inp>499 && inp<1000) {
            p("zounds");
        } else if (inp>999) {
            p("legion");
        }
    }
}
