package LR_6;

public class chapter_04_06_2 {
    public static void main(String[] args) {
        NoName uno = new NoName();
        uno.getNoName();
        uno.getNoName();
        uno.getNoName();
        uno.getNoName();
    }
    static class NoName{
        private static int num = 0;

        static void getNoName(){
            System.out.println("число " + num);
            num++;
        }
    }

}
