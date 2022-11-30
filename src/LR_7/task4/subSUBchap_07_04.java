package LR_7.task4;

public class subSUBchap_07_04 extends subCHAP_07_4{
    int numb;

    public subSUBchap_07_04(char symb, String str, int numb) {
        super(symb, str);
        this.numb = numb;
    }

    public subSUBchap_07_04(subSUBchap_07_04 C1){
        super(C1.symb,C1.str);
        this.numb = C1.numb;
    }
}
