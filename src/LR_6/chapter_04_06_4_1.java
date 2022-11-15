package LR_6;

public class chapter_04_06_4_1 {
    public static void main(String[] args) {
        System.out.println("Запрашиваем 5!!:");
        forFactorial.doubleFactorialCall(5);
        System.out.println("Запрашиваем 6!!:");
        forFactorial.doubleFactorialCall(6);
    }
    static class forFactorial{
        static void doubleFactorialCall(int num){
            long count=1;

            while (num>0){
                if(num > 2){
                    count *= num;
                } else if (num == 2) {
                    count *= 2;
                } else if (num == 1){
                    count *= 1;
                }
                num=num-2;
            }
            System.out.println("n!!= " + count);
        }
    }
}
