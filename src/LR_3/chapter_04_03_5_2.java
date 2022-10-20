package LR_3;

import java.util.Scanner;
import java.util.Random;
public class chapter_04_03_5_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите количество значений: ");
        int Size = Scanner.nextInt();
        int[] Arr = new int[Size];
        int[] viborka = new int[Size];
        int j =0;
        int sum =0;
        int i=0;
        int k=0;
        Random random = new Random();
        while(i<Arr.length){
            Arr[i]=random.nextInt(200);
            i++;
        }
        i = 0;
        while(i<Arr.length) {
            if (Arr[i] % 5 == 2 || Arr[i] % 3 == 1) {
                viborka[j] = Arr[i];
                System.out.println(viborka[j]);
                j++;
                i++;
            }
        }
        while(k<viborka.length){
            sum = sum+viborka[k];
            k++;
        }
        System.out.println("Сумма равна = "+ sum);
    }
}
