//package TIMUS;

//import java.util.Scanner;
//
//public class chapter_04_01_1014 {
//    int met(int n, int i, int j){
//        for (int k = 0; k< 10; k++){
//            if (i*j*k==n){
//                int BIN = k;
//                return BIN;
//            }
//            else if (i*j*k<n){
//                met();
//                break;
//            }
//        }
//        return
//    }
//
//    public static void main(String[] args) {
//        // Принимаем число
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите целое число");
//        int n = scanner.nextInt();
//        scanner.close();
//
//        //создаем переменную контейнер
//        int q;
//
//        //задаем условие
//        for (int i =1; i<10; i++){
//            for (int j=0; j<10; j++){
//                if (i*j>n){
//                    break;
//                }
//                else if (i*j==n){
//                    q = (int)'i'+'j';
//                }
//            }
//        }
//
//    }
//}
//