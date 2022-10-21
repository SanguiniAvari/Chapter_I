package LR_3;

import java.util.Scanner;
import java.util.Random;
import java.util.InputMismatchException;

public class chapter_04_03_6 {
    public static void main(String[] args) {
        //Обработка исключения
        try{
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Введите размер массива: ");
            int Size = Scanner.nextInt();
            if (Size<=0){
                System.out.println("Размер массива меньше или равен нулю.");
            } else {
                int[] Arr = new int[Size];
                //Заполняем массив
                Random random = new Random();
                int j=0;
                for(int i=0;i<Arr.length;i++) {
                    if (i % 5 == 2) {
                        Arr[j] = i;
                        System.out.println(Arr[j]);
                        j++;
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Введен некорректный размер массива");
        }
    }
}
