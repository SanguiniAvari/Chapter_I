package LR_4;

import java.util.Random;

public class chapter_04_04_6 {
    public static void main(String[] args) {
        int k = 3;
        int m = 5;
        int q = 0;
        int r = 0;

        //устанавливаем значения с возможностью расширения

        int[][] Arr = new int[k][m];
        int[][] ArrChen = new int[k-1][m-1];
        Random random = new Random();

        //определяем удаляемые столбец и строку

        int row = random.nextInt(k);
        int line = random.nextInt(m);

        //Заполнение изначального массива случайными значениями от 1 до 50

        for(int i=0;i< Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++){
                Arr[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < Arr.length; i++,q++) {
            if(i==row){
                q = q - 1;
            }else {
                if (q == ArrChen.length){

                } else {
                    for (int j = 0; j < Arr[i].length; j++, r++) {
                        if(j==line){
                            r = r - 1;
                        }else {
                                 ArrChen[q][r] = Arr[i][j];
                        }
                    }


            }
                r=0;

            }
        }
        System.out.println("Индекс столбца: " + line);
        System.out.println("Индекс строки:" + row);

        System.out.println("Демонтстрационно выводим содержание изначального массива:");
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("Демонтстрационно выводим содержание нового массива:");
        for (int i = 0; i < ArrChen.length; i++) {
            for (int j = 0; j < ArrChen[i].length; j++) {
                System.out.print(ArrChen[i][j]+"\t");
            }
            System.out.print("\n");
        }

    }
}
