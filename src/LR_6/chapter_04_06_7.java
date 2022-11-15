package LR_6;

public class chapter_04_06_7 {
    public static void main(String[] args) {
        char[] test = new char[]{'a','b','c','d'};
        for (int i=0;i< test.length;i++){
            System.out.print(charMagic.doMagic(test)[i]+"\t");
        }
    }
    static class charMagic{
        static int[] doMagic(char[] some){
            int[] res = new int[some.length];
            for (int i=0;i<res.length;i++){
                res[i]=some[i];
            }
            return res;
        }
    }

}
