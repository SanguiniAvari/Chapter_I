package LR_6;

public class chapter_04_06_4_2 {
    public static void main(String[] args) {
        System.out.println("Решение реализовано с рекурсией");
        System.out.println("Тестируем 5!!");
        recurseFactorial.doubleFacctorial(5);
        recurseFactorial.getFactorial();
        recurseFactorial.setOne();
        System.out.println("Тестируем 6!!");
        recurseFactorial.doubleFacctorial(6);
        recurseFactorial.getFactorial();
        recurseFactorial.setOne();
    }
    static class recurseFactorial{
        static long count = 1;
        static void doubleFacctorial(int num){
            count *= num;
            if (num-2>2){
                doubleFacctorial(num-2);
            } else if (num-2==2) {
                count *= 2;
            } else if (num-2==1) {
                count *= 1;
            }
        }
        static void getFactorial(){
            System.out.println("двойной факториал равен: " + count);
        }
        static void setOne(){
            count = 1;
        }
    }
}
