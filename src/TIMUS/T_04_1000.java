package TIMUS;

import java.util.Scanner;

public class T_04_1000 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] nums = inp.split(" ");
        System.out.println(Integer.parseInt(nums[0].trim())+Integer.parseInt(nums[1].trim()));
    }
}
