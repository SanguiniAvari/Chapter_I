package LR_8;

import java.io.*;

public class chapter_04_08_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\TMP\\TASK_1.txt"),"cp1251"));
            bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\TMP\\TASK_5.txt"),"cp1251"));
            int lineCount = 0;
            String s;
            while ((s = br.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + s);
                bw.write(lineCount + ": " + s);
                bw.newLine();
            }
        }catch (IOException e){
            System.out.println("allarm!");
        }
        finally {
            br.close();
            bw.flush();
            bw.close();
        }
    }
}
