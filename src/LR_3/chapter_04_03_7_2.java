package LR_3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class chapter_04_03_7_2 {
    public static void main(String[] args) {
        System.out.println("Расширение задачи. Массив заполняется набором из циклично повторяющихся 10 символов");
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите длину массива:");
        try {
            int Size = Scanner.nextInt();
            if (Size<=0){
                System.out.println("Размер массива меньше или равен нулю.");
            } else {
                int len = 10;
                char[] Arr = new char[len];
                char temp;
                Arr[0]='a';
                for (int i=1;i<Arr.length;i++){
                    temp = Arr[i-1];
                    temp = (char)(temp + 2);
                    Arr[i]= temp;
                }
                char[] Arr2 = new char[Size];
                int i=0;
                for (int j=0;j<Arr2.length;j++){
                    Arr2[j]=Arr[i];
                    System.out.println(Arr2[j]);
                    i++;
                    if (i>=Arr.length){
                        i=0;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введен некорректный размер массива");
        }

    }
}