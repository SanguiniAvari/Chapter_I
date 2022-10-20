import java.util.Scanner;
public class chapter_04_03_2_1 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Введите наименование дня недели:");
        String txt = Scanner.next();
        Scanner.close();
        switch (txt){
            case ("Понедельник"):
                System.out.println(1);
                break;
            case ("Вторник"):
                System.out.println(2);
                break;
            case ("Среда"):
                System.out.println(3);
                break;
            case ("Четверг"):
                System.out.println(4);
                break;
            case ("Пятница"):
                System.out.println(5);
                break;
            case ("Суббота"):
                System.out.println(6);
                break;
            case ("Воскресенье"):
                System.out.println(7);
                break;
            default:
                System.out.println("Такого дня нет");
        }
    }
}
