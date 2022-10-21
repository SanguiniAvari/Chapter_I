package LR_3;

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class chapter_04_03_9 {
    public static void main(String[] args) {
        try {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int Size = Scanner.nextInt();
            if (Size<=0){
                System.out.print("Размер массива не может быть отрицательным или равным \"0\".");
            } else {
                int[] Arr = new int[Size];
                Random random = new Random();
                System.out.println("Сгенерирован массив случайных числел размерностью " + Size + " символов:");
                System.out.print("[");
                int temp=200;
                int tempInd;
                for (int i = 0; i < Arr.length; i++) {
                    Arr[i] = random.nextInt(50);
                    System.out.print(Arr[i] + "; ");
                    if (temp>Arr[i]){
                        temp=Arr[i];
                    }
                }
                System.out.println("\b\b]");
                System.out.println("Минимальное значение массива = "+temp);
                System.out.print("Минимальное значение находится под индексом(-ами): ");
                for(int j=0;j< Arr.length;j++){
                    if (Arr[j]==temp){
                        System.out.print(j + "\t");
                    }
                }
            }
        } catch (InputMismatchException e) {
        System.out.println("Введен некорректный размер массива");
        }
    }
}
