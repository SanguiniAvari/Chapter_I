package LR_8;

import java.io.*;
import java.util.Scanner;

public class chapter_04_08_4 {
    public static void main(String[] args) throws IOException {
        try{
            File ftmp = new File("C:\\TMP");
            ftmp.mkdirs();
            ftmp = new File("C:\\TMP\\TASK_1.txt");
            ftmp.createNewFile();
            ftmp = new File("C:\\TMP\\TASK_2.txt");
            ftmp.createNewFile();

            Scanner sc = new Scanner(System.in, "UTF-8");

            DataOutputStream wr = new DataOutputStream(new FileOutputStream("C:\\TMP\\TASK_2.txt"));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = sc.nextInt();

            System.out.println("Введите числа");
            for (int i =0; i < count; i++){
                wr.writeFloat(sc.nextFloat());
            }
            wr.flush();
            wr.close();

            DataInputStream rd = new DataInputStream(new FileInputStream("C:\\TMP\\TASK_1.txt"));
            wr = new DataOutputStream(new FileOutputStream("C:\\TMP\\TASK_3.txt"));

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
