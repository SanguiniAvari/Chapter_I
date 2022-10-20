import java.util.Scanner;

    public class chapter_04_03_4_1 {
        public static void main(String[] args) {
            Scanner Scanner = new Scanner(System.in);
            System.out.println("Введите первое целое число: ");
            int num1 = Scanner.nextInt();
            System.out.println("Введите второе целое число: ");
            int num2 = Scanner.nextInt();
            Scanner.close();

            if (num1<num2){
                int tmp = num2-num1;
                System.out.println("Первое число = "+num1);
                System.out.println("Второе число = "+num2);
                for(int i =0;i<tmp+1;i++){
                    System.out.println(num1++);
                }
            }else {
                int tmp = num1 - num2;
                System.out.println("Первое число = " + num1);
                System.out.println("Второе число = " + num2);
                for (int i = 0; i < tmp + 1; i++) {
                    System.out.println(num2++);
                }
            }
        }
    }
