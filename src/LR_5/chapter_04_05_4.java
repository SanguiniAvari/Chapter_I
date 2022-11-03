package LR_5;

public class chapter_04_05_4 {
    public static void main(String[] args) {
        Restruct test = new Restruct('B',12);
        System.out.println(test.Symb + "\t" + test.Numb);

        Restruct test2 = new Restruct(66.12456);
        System.out.println(test2.Symb + "\t" + test2.Numb);
    }
    static class Restruct{

        int Numb;
        char Symb;

        //  конструктор конструктор с двумя аргументами
        Restruct(char A, int B){
            Symb = A;
            Numb = B;
        }
        // констурктор с одим аргументом
        Restruct(double Z){
            Symb = (char)((int)Z);
            Numb = (int)((Z%1)*100);
        }
    }
}
