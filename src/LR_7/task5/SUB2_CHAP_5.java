package LR_7.task5;

public class SUB2_CHAP_5 extends superCHAP_04_07_5{
    protected char sym;

    public SUB2_CHAP_5(String str, char sym) {
        super(str);
        this.sym = sym;
    }

    @Override
    void name() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Значение текстового поля: " + str);
        System.out.println("Значение символьного поля: " + sym);
    }
}
