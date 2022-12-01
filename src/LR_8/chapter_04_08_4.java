package LR_8;

import java.io.*;
import java.util.Scanner;

public class chapter_04_08_4 {
    public static void main(String[] args) throws IOException {
        try{
            File ftmp = new File("C:\\TMP");
            ftmp.mkdirs();
            ftmp = new File("C:\\TMP\\chapter_04_08_4(reading).txt"); //для красоты берем свой формат
            ftmp.createNewFile();
            ftmp = new File("C:\\TMP\\chapter_04_08_4(writing).txt"); //для красоты берем свой формат
            ftmp.createNewFile();

            Scanner sc = new Scanner(System.in, "cp1251");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream("C:\\TMP\\chapter_04_08_4(reading).txt"));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа");
            for (int i =0; i < count; i++){
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            DataInputStream rd = new DataInputStream(new FileInputStream("C:\\TMP\\chapter_04_08_4(reading).txt"));
            wr = new DataOutputStream(new FileOutputStream("C:\\TMP\\chapter_04_08_4(writing).txt"));

            try{
                while (true){
                    float num = rd.readFloat();
                    wr.writeFloat(num);;
                    System.out.println("Число: " + (float)num);
                }
            } catch (EOFException e){}
            wr.flush();
            wr.close();
            rd.close();
        } catch (IOException e) {
            System.out.println("End of file");
        }
    }
}
