package LR_3;

import java.util.Scanner;
import java.util.Random;
public class chapter_04_03_5_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите количество значений: ");
        int Size = Scanner.nextInt();
        int[] Arr = new int[Size];
        int[] viborka = new int[Size];
        int j =0;
        int sum =0;
        Random random = new Random();
        for(int i =0;i<Arr.length;i++){
            Arr[i]=random.nextInt(200);
        }
        for(int i =0;i<Arr.length;i++) {
            if (Arr[i] % 5 == 2 || Arr[i] % 3 == 1) {
                viborka[j] = Arr[i];
                System.out.println(viborka[j]);
                j++;
            }
        }
        for(int k =0;k<viborka.length;k++){
            sum = sum+viborka[k];
        }
        System.out.println("Сумма равна = "+ sum);
    }
}
