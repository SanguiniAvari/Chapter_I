package LR_4;

import java.util.Random;

public class chapter_04_04_5 {
    public static void main(String[] args) {
        int k = 3;
        int m = 5;
        int[][] Arr = new int[k][m];
        int[][] ArrChen = new int[m][k];
        Random random = new Random();
        //Заполнение изначального массива случайными значениями от 1 до 50

        for(int i=0;i< Arr.length;i++){
            for(int j=0;j<Arr[i].length;j++){
                Arr[i][j] = random.nextInt(50);
            }
        }

        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                ArrChen[j][i] = Arr[i][j];
            }
        }
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

