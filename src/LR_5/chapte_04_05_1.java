package LR_5;


import java.util.Scanner;

public class chapte_04_05_1 {
    public static void main(String[] args) {

        CloseSymbol mysymbol = new CloseSymbol();
        CloseSymbol mysymbol2 = new CloseSymbol();

        mysymbol.setLine();
        mysymbol.getCode();
        mysymbol.outSymInd();

        mysymbol2.setLine();
        mysymbol2.getCode();
        mysymbol2.outSymInd();


        mysymbol.outSymInd();

        char b = 'k';
        int i = b;
        System.out.print(i);

    }
}

class CloseSymbol{
    private char sym;
    private int indexSym;


    void setLine(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите символ: ");
        this.sym = scanner.next().charAt(0);


        //return sym;
    }

    int getCode(){

        int indexSym = sym;
        System.out.print("тест сим: ");
        System.out.println(sym);
        System.out.print("тест инд: ");
        System.out.println(indexSym);

        return indexSym;
    }

    void outSymInd(){
        System.out.println("Символ: " + sym + "\tиндекс: " + indexSym);
    }
}