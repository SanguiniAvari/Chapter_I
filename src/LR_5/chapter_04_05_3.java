package LR_5;

public class chapter_04_05_3 {
    public static void main(String[] args) {
        // нет аргументов
        NoName i = new NoName();
        System.out.println(i.A +" пробел "+ i.B);
        // один аргумент
        NoName j = new NoName(2);
        System.out.println(j.A +" пробел "+ j.B);
        // два аргумента
        NoName k = new NoName(3,4);
        System.out.println(k.A +" пробел "+ k.B);
    }
    static class NoName{
        int A;
        int B;
        NoName(){
            this.A = 1;
            this.B = 2;
        }
        NoName(int A, int B){
            this.A = A;
            this.B = B;
        }
        NoName(int Z){
            this.A = Z;
            this.B = Z;
        }

    }
}
