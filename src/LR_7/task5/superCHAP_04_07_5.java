package LR_7.task5;

public class superCHAP_04_07_5 {
    protected String str;

    public superCHAP_04_07_5(String str) {
        this.str = str;
    }
    void name(){
        System.out.println(this.getClass().getSimpleName());
        System.out.println("Значение поля: " + str);
    }
}
