package LR_8;

import java.io.*;
import java.util.Scanner;

public class chapter_04_08_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла:\t");
        String fname = sc.nextLine();
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.print("Введите количество строк для записи в файл:\t");
            int n = sc.nextInt();
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));
            sc.nextLine();
            for (int i = 0; i < n; i++) {
                System.out.println("Введите строку для записи в файл =>\t");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush();
                dOut.close();
                DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
                while(true) {
                    System.out.println(dIn.readUTF());
                }
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
