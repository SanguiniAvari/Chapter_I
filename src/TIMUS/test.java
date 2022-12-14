package TIMUS;

public class test {

    static double GRAC(String S) {
        double col = 0;
        int count = 0;
        int i = S.length() - 1;
        while (S.charAt(i) != '.' && S.charAt(i) != '-' && S.charAt(i) != ',' && i > 0) {
            col = col + CST(S.charAt(i)) * Math.pow(10, count);
            count++;
            i--;
        }
        if (S.charAt(i) == '.' || S.charAt(i) == ',') {
            col /= Math.pow(10, count);
            count = 0;
            i--;
            while (i>-1 && S.charAt(i)!='-'){
                col = col + CST(S.charAt(i)) * Math.pow(10, count);
                count++;
                i--;
            }
        }
        if (S.charAt(i) == '-') {
            col *= -1;
            i--;
        }
        return col;
    }

    static int CST(char CH){
        int res = 0;
        switch (CH){
            case ('0'):
                res = 0;
                break;
            case ('1'):
                res = 1;
                break;
            case ('2'):
                res = 2;
                break;
            case ('3'):
                res = 3;
                break;
            case ('4'):
                res = 4;
                break;
            case ('5'):
                res = 5;
                break;
            case ('6'):
                res = 6;
                break;
            case ('7'):
                res = 7;
                break;
            case ('8'):
                res = 8;
                break;
            case ('9'):
                res = 9;
                break;
        }
        return res;
    }

    public static void main(String[] args) {
        String STR = "-28791.897";
        System.out.println(GRAC(STR));
    }
}
