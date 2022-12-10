package LR_8;

import java.io.*;

public class chapter_04_08_10 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter Out = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\TMP\\TASK_4.txt"),"cp1251"));
            Out = new PrintWriter("C:\\TMP\\TASK_6.txt","cp1251");
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                Out.println(lineCount + ": " + s);
            }
        } catch (IOException e){
            System.out.println("Arghhh" + e);
        }
        finally{
            br.close();
            Out.flush();
            Out.close();
        }
    }
}
