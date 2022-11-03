package LR_5;


import java.util.Scanner;

public class chapter_04_05_1 {
    public static void main(String[] args) {

        CloseSymbol mysymbol = new CloseSymbol();
        CloseSymbol mysymbol2 = new CloseSymbol();

        mysymbol.setLine();
        mysymbol.getCode();
        mysymbol.outSymInd();

        mysymbol2.setLine();
        mysymbol2.getCode();
        mysymbol2.outSymInd();

    }

    static class CloseSymbol {
        private char sym;

        public void setLine() {
            //метод позволяет присвоить значение полю
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите символ: ");
            this.sym = scanner.next().charAt(0);
        }

        public int getCode() {
            // метод выводит код символа
            System.out.print("код символа: ");
            System.out.println((int) sym);
            return sym;
        }

        public void outSymInd() {
            //метод выводит значение символа и его индекс
            System.out.println("Символ: " + sym + "\tиндекс: " + (int) sym);
        }
    }
}