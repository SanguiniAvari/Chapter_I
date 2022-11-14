//package TIMUS;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class chapter_04_01_1592 {
//    int mChar;
//    public int mut(char sym){
//        if (sym == '0'){mChar = 0;}
//        else if (sym == '1') {mChar = 1;}
//        else if (sym == '2') {mChar = 2;}
//        else if (sym == '3') {mChar = 3;}
//        else if (sym == '4') {mChar = 4;}
//        else if (sym == '5') {mChar = 5;}
//        else if (sym == '6') {mChar = 6;}
//        else if (sym == '7') {mChar = 7;}
//        else if (sym == '8') {mChar = 8;}
//        else if (sym == '9') {mChar = 9;}
//        return mChar;
//    }
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Введите количество часов: ");
//        String STR;
//        int len = scanner.nextInt();
//        int tempH=0;
//        int tempM=0;
//        int tempS=0;
//        STR = scanner.nextLine(); //костыль
//        ArrayList<Time> Arr = new ArrayList<>(); //собираем вводимые данные
//
//        //считываем время с часов и кладем в лист
//        for (int k = 0; k < len; k++){
//            System.out.print((k+1) + "\t");
//            STR = scanner.nextLine();
//            Time tmp = new Time(STR);
//                Arr.add(tmp);
//            };
//        scanner.close();
//
//
//        //выискиваем максимальное время
//
//        for (int j = 0; j < Arr.size(); j++){
//            if (tempH < Arr.get(j).H){
//                tempH = Arr.get(j).H;
//            }
//        }
//        for (int j = 0; j < Arr.size(); j++){
//            if (Arr.get(j).H == tempH){
//                if (tempM < Arr.get(j).M){
//                    tempM = Arr.get(j).M;
//                }
//            }
//        }
//        for (int j = 0; j<Arr.size(); j++){
//            if (Arr.get(j).H == tempH && Arr.get(j).M== tempM){
//                if (tempS < Arr.get(j).S){
//                    tempS = Arr.get(j).S;
//                }
//            }
//        }
//        for (int j = 0; j<Arr.size(); j++){
//            if (Arr.get(j).H == tempH && Arr.get(j).M == tempM && Arr.get(j).S == tempS){
//                Arr.get(j).print();
//            }
//        }
//    }
//
//    static class Time{
//        private int H, M, S, mChar;
//        String stat;
//
//        Time(String STR){
//            stat = STR;
//            if (STR.length()==7){
//                if (mut(STR.charAt(0))>=0 && mut(STR.charAt(0))<=9){H = mut(STR.charAt(0));}
//                if (mut(STR.charAt(2))*10+mut(STR.charAt(3))>=0 && mut(STR.charAt(2))*10+mut(STR.charAt(3))<=59){M = mut(STR.charAt(2))*10+mut(STR.charAt(3));}
//                if (mut(STR.charAt(5))*10+mut(STR.charAt(6))>=0 && mut(STR.charAt(5))*10+mut(STR.charAt(6))<=59){S = mut(STR.charAt(5))*10+mut(STR.charAt(6));}
//            }
//            else if (STR.length()==8) {
//                if (mut(STR.charAt(0))*10+mut(STR.charAt(1))>=0 && mut(STR.charAt(0))*10+mut(STR.charAt(1)) <=12){H = mut(STR.charAt(0))*10+mut(STR.charAt(1));}
//                if (mut(STR.charAt(3))*10+mut(STR.charAt(4))>=0 && mut(STR.charAt(3))*10+mut(STR.charAt(4)) <=59){M = mut(STR.charAt(3))*10+mut(STR.charAt(4));}
//                if (mut(STR.charAt(6))*10+mut(STR.charAt(7))>=0 && mut(STR.charAt(6))*10+mut(STR.charAt(7)) <=59){S = mut(STR.charAt(6))*10+mut(STR.charAt(7));}
//            }
//
//            }
//        void print(){
//            System.out.println(this.stat);
//        }
//
//
//    }
//}
//
//
//
//