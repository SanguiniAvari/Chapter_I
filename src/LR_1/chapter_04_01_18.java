package LR_1;

public class chapter_04_01_18 {
    static double a = 10.0;
    static double b = 4.0;
    static double c;
    static double j;
       public static double hyp() {
        return c = Math.sqrt(a * a + b * b);
    }
    public static double form() {
        return j = Math.exp(b * Math.log(a));
    }

    public static void main(String[] var0) {
        System.out.println("katet Р°=" + a);
        System.out.println("katet b=" + b);
        System.out.println("hypotenuse СЃ=" + hyp());
        System.out.println("a in b=" + form());
    }
}
