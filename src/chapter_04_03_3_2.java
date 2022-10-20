
import java.util.Scanner;
public class chapter_04_03_3_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначи: ");
        int num = Scanner.nextInt();
        Scanner.close();
        int[] arr = new int[num];
        int i = 0;
        while (i < num){
            switch (i){
                case(0):
                    arr[i]=1;
                    System.out.println(arr[i]);
                    i++;
                    break;
                case (1):
                    arr[i]=1;
                    System.out.println(arr[i]);
                    i++;
                    break;
                default:
                    arr[i]=arr[i-2]+arr[i-1];
                    System.out.println(arr[i]);
                    i++;
            }
        }
    }
}