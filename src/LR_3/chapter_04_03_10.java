package LR_3;

import java.util.*;

public class chapter_04_03_10 {
    public static void main(String[] args) {
        try {
            Scanner Scanner = new Scanner(System.in);
            System.out.print("Введите длину массива: ");
            int Size = Scanner.nextInt();
            if (Size<=0){
                System.out.print("Размер массива не может быть отрицательным или равным \"0\".");
            } else {
                int[] arr = new int[Size];
                Random random = new Random();
                System.out.println("Сгенерирован массив случайных числел размерностью " + Size + " символов:");
                System.out.print("[");
                int temp=200;
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = random.nextInt(50);
                    System.out.print(arr[i] + "; ");
                    if (temp>arr[i]){
                        temp=arr[i];
                    }
                }
                System.out.println("\b\b]");
                System.out.println("Минимальное значение массива = "+temp);
                System.out.print("Минимальное значение находится под индексом(-ами): ");
                for(int j=0;j< arr.length;j++){
                    if (arr[j]==temp){
                        System.out.print(j + "\t");
                    }
                }

                //сортировка

                int[] arr2 = Arrays.stream(arr)
                        .boxed()
                        .sorted(Collections.reverseOrder())
                        .mapToInt(Integer::intValue)
                        .toArray();

                //вывод массива

                System.out.print("\n");
                System.out.println("Выводим отсортированный массив");

                System.out.print("[");
                for(int i=0;i<arr2.length;i++){
                    System.out.print(arr2[i] + "; ");
                }
                System.out.println("\b\b]");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введен некорректный размер массива");
        }
    }
}
