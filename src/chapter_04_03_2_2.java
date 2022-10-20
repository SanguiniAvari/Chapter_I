import java.util.Scanner;
public class chapter_04_03_2_2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите наименование дня недели:");
        String txt = Scanner.next();
        Scanner.close();
        if (new String( "Понедельник").equals(txt)) {
            System.out.println("1");
        } else {
            if (new String("Вторник").equals(txt)) {
                System.out.println("2");
            } else {
                if (new String( "Среда").equals(txt)) {
                    System.out.println("3");
                } else {
                    if (new String( "Четверг").equals(txt)) {
                        System.out.println("4");
                    } else {
                        if (new String( "Пятница").equals(txt)) {
                            System.out.println("5");
                        } else {
                            if (new String( "Суббота").equals(txt)) {
                                System.out.println("6");
                            } else {
                                if (new String( "Воскресенье").equals(txt)) {
                                    System.out.println("7");
                                } else {
                                    System.out.println("Такого дня нет");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}