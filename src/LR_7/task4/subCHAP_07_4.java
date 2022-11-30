package LR_7.task4;

public class subCHAP_07_4 extends superCHAP_07_4{
    String str;

    public subCHAP_07_4(char symb, String str) {
        super(symb);
        this.str = str;
    }

    public subCHAP_07_4(subCHAP_07_4 B1){
        super(B1.symb);
        this.str = B1.str;
    }
}
