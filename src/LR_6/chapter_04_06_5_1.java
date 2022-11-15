package LR_6;

public class chapter_04_06_5_1 {
    public static void main(String[] args) {
        System.out.println("Решение без рекурсии");
        System.out.println("тестируем на 5");
        square.doit(5);
        System.out.println("тестируем на 6");
        square.doit(6);
    }
    static class square{
        static void doit(int num){
            long count=0;
            while (num>0){
                count+=num*num;
                num--;
            }
            System.out.println(count);
        }
    }

}
