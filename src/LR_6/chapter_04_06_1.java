package LR_6;

public class chapter_04_06_1 {
    public static void main(String[] args) {
        System.out.println("Тест 1");
        NoName first = new NoName();
        first.setNoName('a');
        first.getNoName();

        System.out.println("Тест 2");
        NoName second = new NoName();
        second.setNoName("String");
        second.getNoName();

        char[] test = new char[]{'a','b','c'};
        char[] test2 = new char[]{'a'};

        System.out.println("Тест 3");
        NoName uno = new NoName();
        uno.setNoName(test);
        uno.getNoName();

        System.out.println("Тест 4");
        NoName dos = new NoName();
        dos.setNoName(test2);
        dos.getNoName();

    }

    static class NoName{
        char sym;
        String str = new String();

        void setNoName(char sym){
            this.sym = sym;
        }
        void setNoName(String str){
            this.str = str;
        }
        void setNoName(char[] chars){
            if(chars.length==1){
                this.sym = chars[0];
            } else if (chars.length>1) {
                String tmp = new String(chars);
                this.str = tmp;
            }
        }
        void getNoName(){
            System.out.println("символ "+this.sym);
            System.out.println("строка "+this.str);
        }
    }
}
