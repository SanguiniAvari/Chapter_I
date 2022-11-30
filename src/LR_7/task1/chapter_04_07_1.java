package LR_7.task1;

public class chapter_04_07_1 {
    public static void main(String[] args) {
        superClassTest superClassObject = new subClassTest("передал в конструктор суперкласса");
        String className = superClassObject.toString();
        System.out.println(className);

        subClassTest subClassObject1 = new subClassTest("передал в конструктор подкласса");
        String subClassName = subClassObject1.toString();
        System.out.println(subClassName);

        subClassTest subClassObject2 = new subClassTest("Передал в конструктор подкласса", "где два параметра");
        String subClassName2 = subClassObject2.toString();
        System.out.println(subClassName2);
    }
}


