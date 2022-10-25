package LR_4;

public class chapter_04_04_2_1 {
    public static void main(String[] args) {
        int figure = 11;
        int cline = 10;
        int i, j;
        for (i=0;i<=cline;i++) {
            System.out.print("0");
        }
        System.out.print("\n");
        for (i=0;i<figure;i++){
            for (j=0;j <= cline; j++){
                if(j>i){
                    System.out.print("0");
                } else if (j<i || j==i) {
                    System.out.print("+");
                }
            }
            System.out.print("\n");
        }
        for (i=0;i<=cline;i++){
            System.out.print("0");
        }
    }
}
