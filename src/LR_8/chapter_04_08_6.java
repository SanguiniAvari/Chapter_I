package LR_8;

import java.io.*;

public class chapter_04_08_6 {
    public static void main(String[] args) throws IOException {
        FileReader in = null;
        FileWriter out = null;
        try {
            in = new FileReader("C:\\TMP\\TASK_2.txt");
            out = new FileWriter("C:\\TMP\\TASK_5.txt",true);
            int oneByte;
            while ((oneByte = in.read()) !=-1){
                out.append((char)oneByte);
                System.out.print((char)oneByte);
            }
        }catch (IOException e){
            System.out.println("Ouch!");
        }
        finally {
            in.close();
            out.close();
        }
    }
}
