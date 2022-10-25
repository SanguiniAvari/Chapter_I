package LR_4;

public class chapter_04_04_2_2 {
    public static void main(String[] args) {
        System.out.println("Расширение задачи - построение равнобедренного треугольника");
        int figure = 11;
        int cline = 20;
        int i, j;
        for (i=0;i<=cline;i++) {
            System.out.print("0");
        }
        System.out.print("\n");
        for (i=0;i<figure;i++){
            for (j=0;j <= cline; j++){
                if(j>((cline/2)+i) || j<((cline/2)-i)){
                    System.out.print("0");
                } else if (j<((cline/2)+i) || j>((cline/2)-i) || j==(cline/2)) {
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
