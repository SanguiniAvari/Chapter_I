package LR_8;

import java.io.*;

public class chapter_04_08_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;
        try{
            br = new BufferedReader(new FileReader("C:\\TMP\\TASK_1.txt"),1024);
            out = new BufferedWriter(new FileWriter("C:\\TMP\\TASK_2.txt"));

            int lineCount = 0;
            String s;
            while ((s = br.readLine())!= null){
                lineCount++;
                System.out.println(lineCount+": "+ s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e){
            System.out.println("Wrong!" + e);
        }
        finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
