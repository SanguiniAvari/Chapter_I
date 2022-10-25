package LR_1;

public class chapter_04_01_3 {
    public static void main(String[] var0) {
        int var1 = 10;
        byte var2 = 20;
        if (var1 < var2) {
            System.out.println("S < D");
        }

        var1 *= 2;
        if (var1 == var2) {
            System.out.println("S = D");
        }

        var1 *= var2;
        if (var1 > var2) {
            System.out.println("S > D");
        }

    }
}
