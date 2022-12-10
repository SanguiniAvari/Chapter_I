package LR_8;

import java.io.*;
import java.net.URL;

public class chapter_04_08_8 {
    public static void readAllByByte(Reader in) throws IOException {
        while (true){
            int oneByte = in.read();
            if (oneByte != -1){
                System.out.print((char)oneByte);
            } else {
                System.out.println("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try{
            InputStream inFile = new FileInputStream("C:\\TMP\\TASK_5.txt");
            Reader rFile = new InputStreamReader(inFile,"cp1251");
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl= new InputStreamReader(inUrl, "cp1251");

            readAllByByte(rUrl);
            System.out.print("\n\n\n");
            inUrl.close();
            rUrl.close();

            InputStream inArray = new ByteArrayInputStream(new byte[]{79,80,81,82,83});
            Reader rArray = new InputStreamReader(inArray, "cp1251");

            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e){
            System.out.println("wrong!!!" + e);
        }
    }
}
