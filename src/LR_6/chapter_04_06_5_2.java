package LR_6;

public class chapter_04_06_5_2 {
    public static void main(String[] args) {
        squareReqursion.reqSquare(5);
        squareReqursion.getResult();
        squareReqursion.doResault();
        squareReqursion.reqSquare(6);
        squareReqursion.getResult();
        squareReqursion.doResault();
    }
    static class squareReqursion{
        static long count=0;
        static void reqSquare(int num){
            if (num>0){
                count += num*num;
                reqSquare(num-1);
            }
        }
        static void getResult(){
            System.out.println("Результат = " + count);
        }
        static void doResault(){
            count=0;
        }

    }
}
