package LR_8;

import java.io.*;

public class chapter_04_08_6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try {
            in = new FileReader("C:\\TMP\\LR_8\\TASK_3.txt");
            out = new FileWriter("C:\\TMP\\LR_8\\TASK_4.txt");
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
