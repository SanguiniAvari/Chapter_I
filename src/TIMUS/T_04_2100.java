package TIMUS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T_04_2100 {
    public static void main(String[] args) {
        String inputFileName = "src/TIMUS/input2100.txt";
        boolean oj = System.getProperty("ONLINE_JUDGE")!=null;
        int marshalAndLily = 2;
        try{
            BufferedReader bufferedReader = oj ? new BufferedReader(new InputStreamReader(System.in)):new BufferedReader(new FileReader(inputFileName));

            String readLine ="";
            int numberOfFriends = 0;
            int numbersOfPairs = 0;

            while ((readLine = bufferedReader.readLine()) != null){
                if (numberOfFriends == 0){
                    numberOfFriends = Integer.parseInt(readLine);
                    continue;
                }
                if (readLine.contains("+")){
                    numbersOfPairs++;
                }
            }

            int result;
            int guests = (marshalAndLily + numberOfFriends + numbersOfPairs);
            if(guests==13){
                result = (guests*100)+100;
            }else {
                result = guests*100;
            }

            System.out.println(result);
        }catch (IOException exception){
            exception.printStackTrace();
        }
    }
}
