package TIMUS;

import java.util.Scanner;

public class T_04_1787 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        String[] A = a.split(" ");
        String[] B = b.split(" ");
        int count = 0;
        for (int i=0;i<Integer.parseInt(A[1].trim());i++){
            if(count+Integer.parseInt(B[i].trim()) > Integer.parseInt(A[0].trim())){
                count += Integer.parseInt(B[i].trim())-Integer.parseInt(A[0].trim());
            }else {
                count = 0;
            }
        }
        System.out.print(count);
    }
}
