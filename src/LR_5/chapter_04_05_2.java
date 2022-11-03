package LR_5;

import java.util.Scanner;

public class chapter_04_05_2 {
    public static void main(String[] args) {
        Literals join = new Literals();
        join.getLit();

    }

    public static class Literals{
        char sym_A;
        char sym_B;

        Literals(){
            //Формируем конструктор класса
            System.out.print("Введите первый символ: ");
            Scanner scanner = new Scanner(System.in);
            char temp;
            this.sym_A = scanner.next().charAt(0);
            System.out.print("\n");
            System.out.print("Введите второй символ: ");
            this.sym_B = scanner.next().charAt(0);
            scanner.close();
            if (sym_B<sym_A){
                temp = sym_A;
                sym_A = sym_B;
                sym_B = temp;
            }
        }

        void getLit(){
            int leng = (int)this.sym_B-(int)this.sym_A+1;
            System.out.print("Возвращаемый массив: \t");
            for (int i = 0; i < leng; i++){
                    System.out.print(this.sym_A + "  ");
                    this.sym_A++;
            }
        }
    }
}
