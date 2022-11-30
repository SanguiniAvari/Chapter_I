package LR_7.task4;

public class chapter_04_07_4 {
    public static void main(String[] args) {
        System.out.println("\t*** Приступили ***");
        System.out.println("создаем объект А1 суперкласса");
        superCHAP_07_4 A1 = new superCHAP_07_4('k');
        System.out.println(A1.symb);
        System.out.println("\nсоздаем создаем копию объекта А1");
        superCHAP_07_4 A2 = new superCHAP_07_4(A1);
        System.out.println(A2.symb);

        System.out.println("\nсоздаем объект B1 первого подкласса");
        subCHAP_07_4 B1 = new subCHAP_07_4('u',"long value string");
        System.out.println(B1.symb);
        System.out.println(B1.str);
        System.out.println("\nсоздаем создаем копию объекта B1");
        subCHAP_07_4 B2 = new subCHAP_07_4(B1);
        System.out.println(B2.symb);
        System.out.println(B2.str);

        System.out.println("\nсоздаем объект C1 второго подкласса");
        subSUBchap_07_04 C1 = new subSUBchap_07_04('v',"second some string",13);
        System.out.println(C1.symb);
        System.out.println(C1.str);
        System.out.println(C1.numb);
        System.out.println("\nсоздаем создаем копию объекта C1");
        subSUBchap_07_04 C2 = new subSUBchap_07_04(C1);
        System.out.println(C2.symb);
        System.out.println(C2.str);
        System.out.println(C2.numb);
        System.out.println("\t*** Радуемся ***");
    }
}
