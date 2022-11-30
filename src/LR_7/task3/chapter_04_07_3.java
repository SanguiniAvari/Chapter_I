package LR_7.task3;

public class chapter_04_07_3 {
    public static void main(String[] args) {
        System.out.println("Создаем объект А из суперкласса");
        superCHAP_07_3 A = new superCHAP_07_3(13);
        System.out.println("Выводим значение А");
        System.out.println(A.number);

        System.out.println("\nСоздаем объект В из первого подкласса");
        subCAHP_07_3 B = new subCAHP_07_3(26,"first string");
        System.out.println("Выводим значение B");
        System.out.println(B.number);
        System.out.println(B.str);

        System.out.println("\nСоздаем объект C из второго подкласса");
        subSUBcahp_07_03 C = new subSUBcahp_07_03(39,"second first string","first second string");
        System.out.println("Выводим значение C");
        System.out.println(C.number);
        System.out.println(C.str);
        System.out.println(C.SUBstr);

        System.out.println("\n\t\t*** Дублируем вывод всего что навводили ***");
        System.out.println(A.number);
        System.out.println(B.number);
        System.out.println(B.str);
        System.out.println(C.number);
        System.out.println(C.str);
        System.out.println(C.SUBstr);
        System.out.println("\n\t\t*** Радуемся успеху ***");
    }
}
