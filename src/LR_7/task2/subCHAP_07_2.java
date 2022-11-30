package LR_7.task2;


public class subCHAP_07_2 extends superCHAP_07_2{
    int poleInt;

    public subCHAP_07_2(int pole, String txt) {
        super(txt);
        poleInt = pole;
    }

    void setTxt() {
        System.out.println("Вызов из подкласса: Обнуляем значения переменных");
        super.setTxt();
        poleInt = 0;
    }

    void setTxt(int pole) {
        System.out.println("Вызов из подкласса: Из суперкласса вызывается метод с пустым текстовым параметром," +
                "числовой параметр устанавливается в значение целочисленной переменной");
        poleInt = pole;
    }
    void setTxt(String txt) {
        System.out.println("Вызов из подкласса: Текстовый параметр передается конструктору суперкласса," +
                "числовой параметр не изменяется");
        super.setTxt(txt);
    }

    void setTxt(int pole, String txt) {
        System.out.println("Вызов из подкласса: Текстовый параметр передается конструктору суперкласса," +
                "числовой параметр устанавливается в значение целочисленной переменной");
        super.setTxt(txt);
        poleInt = pole;
    }

    void show(){
        System.out.println("числовое значение = "+poleInt);
        System.out.print("текстовое поле = ");
        super.show();
    }
}
