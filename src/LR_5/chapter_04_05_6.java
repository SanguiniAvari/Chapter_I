package LR_5;

public class chapter_04_05_6 {
    public static void main(String[] args) {
        MinMax test_1 = new MinMax(4);
        test_1.show();
        test_1.setVal(8,15);
        test_1.show();
        test_1.setVal(10);
        test_1.show();

        System.out.println("");
        MinMax test_2 = new MinMax(8,10);
        test_2.show();
        test_2.setVal(18,1);
        test_2.show();
        test_2.setVal(100);
        test_2.show();

        System.out.println("");
        MinMax test_3 = new MinMax(10,8);
        test_3.show();
        test_3.setVal(10,10);
        test_3.show();
        test_3.setVal(95);
        test_3.show();
    }

    static class MinMax{
        private int max;
        private int min;

        MinMax(int A){
            min = A;
            max = A;
        }

        MinMax(int max, int min){
            if (this.min<this.max){
                this.min = min;
                this.max = max;
            } else {
                this.max = min;
                this.min = max;
            }
        }


        public void setVal(int max, int min){
            if (this.min<this.max){
                this.min = min;
                this.max = max;
            } else {
                this.max = min;
                this.min = max;
            }
        }

        public void setVal(int A){
            min = A;
            max = A;
        }

        public void show(){
            System.out.println("минимум " + min + ", максимум " + max);
        }

    }
}
