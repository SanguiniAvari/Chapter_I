package LR_7.task5;

public class chapter_04_07_5 {
    public static void main(String[] args) {
        System.out.println("Вызываем суперкласс");
        superCHAP_04_07_5 A = new superCHAP_04_07_5("Строка");
        A.name();
        System.out.println("\nВызываем первый подкласс");
        SUB1_CHAP_5 B = new SUB1_CHAP_5("Вторая строка",13);
        B.name();
        System.out.println("\nВызываем второй подкласс");
        SUB2_CHAP_5 C = new SUB2_CHAP_5("Третья строка", 'A');
        C.name();
    }
}
