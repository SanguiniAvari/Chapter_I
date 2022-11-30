package LR_7.task2;

public class superCHAP_07_2 {
    private String txt;

    public superCHAP_07_2(String txt) {
        this.txt = txt;
    }

    void setTxt(){
        txt = "Ответ из суперкласса: Значение не введено";
    }

    void setTxt(String text){
        this.txt = text;
        System.out.println("Ответ из суперкласса: Значение txt успешно изменено на: \""+text+"\"");
    }

     void getLenText(){
        System.out.println("Ответ из суперкласса: Получен запрос на получение длины строки");
        System.out.println(this.txt.length());
    }

    void show(){
        System.out.println(this.txt);
    }
}
