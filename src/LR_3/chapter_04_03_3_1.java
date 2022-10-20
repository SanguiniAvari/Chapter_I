package LR_3;

import java.util.Scanner;
public class chapter_04_03_3_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначи: ");
        int num = Scanner.nextInt();
        Scanner.close();
        int[] arr = new int[num];
        for (int i = 0; i<num; i++){
            if(i<2){
                arr[i]=1;
                System.out.println(arr[i]);
            }else{
                arr[i]=arr[i-2]+arr[i-1];
                System.out.println(arr[i]);
            }
        }
    }
}