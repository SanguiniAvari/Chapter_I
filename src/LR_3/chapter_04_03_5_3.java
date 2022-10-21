package LR_3;

import java.util.Scanner;
import java.util.Random;
public class chapter_04_03_5_3 {
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
        //Заполняю массив случаными аргументами
        Random random = new Random();
        do {
            Arr[i]=random.nextInt(200);
            i++;
        } while(i<Arr.length);
        //Обнуляю счетчик, проверяю элементы на соответствие, вывожу значения, удовлетворяющие результатом
        i = 0;
        do {
            if (Arr[i] % 5 == 2 || Arr[i] % 3 == 1) {
                viborka[j] = Arr[i];
                System.out.println(viborka[j]);
                j++;
            }
            i++;
        } while(i<Arr.length);
        // Собираю сумму значений в переменную
        do {
            sum = sum+viborka[k];
            k++;
        } while(k<viborka.length);

        System.out.println("Сумма равна = "+ sum);
    }
}
