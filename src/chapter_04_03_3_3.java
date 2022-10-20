import java.util.Scanner;
public class chapter_04_03_3_3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначи: ");
        int num = Scanner.nextInt();
        Scanner.close();
        int[] arr = new int[num];
        int i = 0;
        do {
            if(i<2){
                arr[i]=1;
                System.out.println(arr[i]);
                i++;
            }else{
                arr[i]=arr[i-2]+arr[i-1];
                System.out.println(arr[i]);
                i++;
            }
        } while (i < num);
    }
}