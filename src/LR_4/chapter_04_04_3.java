package LR_4;

public class chapter_04_04_3 {
    public static void main(String[] args) {
        int i,j;
        int[][] Arr = new int[10][20];
        for(i=0;i<Arr.length;i++){
            for(j=0;j<Arr[i].length;j++){
                if(i==0 || i==Arr.length-1){
                    Arr[i][j]=0;
                    System.out.print("0 ");
                } else if (i!=0 && i != Arr.length && j != 0 && j != Arr[i].length-1) {
                    Arr[i][j]=2;
                    System.out.print("2 ");
                } else if (i!=0 && i != Arr.length && (j == 0 || j == Arr[i].length-1)) {
                    Arr[i][j]=0;
                    System.out.print("0 ");
                }
            }
            System.out.print('\n');
            }
        System.out.println("Демонтстрационно выводим содержание массива:");
        for (i=0;i<Arr.length;i++){
            for(j=0;j<Arr[i].length;j++){
                System.out.print(Arr[i][j]);
            }
            System.out.print("\n");
        }
    }
}
