package LR_6;

public class chapter_04_06_9 {
    public static void main(String[] args) {
        char[] test = new char[]{'a','b','c','d'};
        System.out.println(Magic.doMagic(test));
        char[] test2 = new char[]{'a','b','c','d','e'};
        System.out.println(Magic.doMagic(test2));
    }
    static class Magic{
        static char[] doMagic(char[] chars){
            char[] newChars = new char[chars.length];
            for (int i=0;i< chars.length;i++){
                newChars[i]=chars[chars.length-1-i];
            }
            return newChars;
        }
    }
}
