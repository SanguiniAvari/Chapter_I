package LR_3;

public class chapter_04_03_8 {
    public static void main(String[] args) {
        int Size = 10;
        int j = 0;
        int i = 0;
        char[] Arr = new char[Size];
        while (j<Arr.length){
            if ((char)(i+65)!='A'&&(char)(i+65)!='E'&&(char)(i+65)!='I'&&(char)(i+65)!='O'&&(char)(i+65)!='U'&&(char)(i+65)!='Y'){
                Arr[j]=(char)(i+65);
                System.out.println(Arr[j]);
                j++;

            }
            i++;
        }
    }
}
