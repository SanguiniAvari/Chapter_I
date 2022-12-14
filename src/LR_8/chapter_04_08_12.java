package LR_8;

import java.io.*;

public class chapter_04_08_12 {
    static boolean isGlas(char CH){
        if (CH=='А' || CH=='а' || CH=='О' || CH=='о' || CH=='У' || CH=='у' || CH=='Ы' || CH=='ы' || CH=='Э' || CH=='э' || CH=='Е' || CH=='е' || CH=='Ё' || CH=='ё' || CH=='И' || CH=='и' || CH=='Ю' || CH=='ю' || CH=='Я' || CH=='я'){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader rd = null;
        BufferedWriter wd = null;
        try {
            rd = new BufferedReader(new InputStreamReader(new FileInputStream("C:\\TMP\\TASK-12.txt")));
            wd = new BufferedWriter(new BufferedWriter(new FileWriter("C:\\TMP\\TASK-12-OUT.txt")));
            String strTMP = null;
            while (true) {
                strTMP = rd.readLine();
                if (strTMP != null && !strTMP.isEmpty()){
                    if (isGlas(strTMP.charAt(0))) {
                        wd.write(strTMP);
                        wd.newLine();
                    }
                }else if (strTMP == null){
                    break;
                }
            }
        } catch (IOException e){
            System.out.println("где-то накосячил "+e);
        } finally {
            rd.close();
            wd.flush();
            wd.close();
        }
    }
}
