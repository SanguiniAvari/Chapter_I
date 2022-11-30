package LR_7.task5;

public class SUB1_CHAP_5 extends superCHAP_04_07_5{
    protected int numb;

    public SUB1_CHAP_5(String str, int numb) {
        super(str);
        this.numb = numb;
    }

    @Override
    void name() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Значение текстового поля: " + str);
        System.out.println("Значение числового поля: " + numb);
    }
}
