package LR_4;

public class chapter_04_04_7 {
    public static void main(String[] args) {
        int[][] Arr = new int[7][14];
        int i = 0;
        int j = 0;
        int q = 0;
        int temp = 0;
        int count = 0;

        for (;i < Arr.length; i++){
            j =0;
            while (j < Arr[i].length){
                if (Arr[i][j] == 0){
                    Arr[i][j] = count;
                    count++;
                    temp = j;
                }
                j++;
            }
            j = temp;
            q = Arr.length-1;
            while (q > -1){
                if (Arr[q][j] == 0){
                    Arr[q][j] = count;
                    count++;
                }
                q--;
            }
        }

        System.out.println("Вывод итогового массива:");
        for (int k = 0; k < Arr.length; k++) {
            for (int l = 0; l < Arr[k].length; l++) {
                System.out.print(Arr[k][l] + "\t");
            }
            System.out.print("\n");
        }
    }
}
