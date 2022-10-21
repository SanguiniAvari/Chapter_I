package LR_3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class chapter_04_03_7_1 {
    public static void main(String[] args) {
        try{
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Введите длину массива:");
            int Size = Scanner.nextInt();
            if (Size<=0){
                System.out.println("Размер массива меньше или равен нулю.");
            } else {
                char[] Arr = new char[Size];
                char temp;
                Arr[0]='a';
                System.out.println("Прямой порядок");
                System.out.println(Arr[0]);
                for (int i=1;i<Arr.length;i++){
                    temp = Arr[i-1];
                    temp = (char)(temp + 2);
                    Arr[i]= temp;
                    System.out.println(Arr[i]);
                }
                System.out.println("Обратный порядок");
                for (int j = Arr.length-1;j>=0;j--){
                    System.out.println(Arr[j]);
                }
            }
        }catch (InputMismatchException e) {
            System.out.println("Введен некорректный размер массива");
        }
    }
}
