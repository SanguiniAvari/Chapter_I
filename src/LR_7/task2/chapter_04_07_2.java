package LR_7.task2;

public class chapter_04_07_2 {
    public static void main(String[] args) {
        System.out.println("Вызов Main: создаем суперкласс А:");
        superCHAP_07_2 A = new superCHAP_07_2("Это текст создан из конструктора суперкласса");
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        A.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        A.getLenText();

        System.out.println("Вызов Main: вызываем метод с пустыми параметрами:");
        A.setTxt();
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        A.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        A.getLenText();

        System.out.println("Вызов Main: вызываем метод с одним текстовым параметром:");
        A.setTxt("Какие-то данные");
        A.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        A.getLenText();

        System.out.println("\n\t*** Начало работы с подклассом ***");

        System.out.println("Вызов Main: создаем подкласс В:");
        subCHAP_07_2 B = new subCHAP_07_2(12,"Это текст создан из конструктора подкласса");
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        B.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        B.getLenText();

        System.out.println("Вызов Main: вызываем метод подкласса с пустыми параметрами:");
        B.setTxt();
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        B.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        B.getLenText();

        System.out.println("Вызов Main: вызываем метод подкласса с числовым параметром:");
        B.setTxt(25);
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        B.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        B.getLenText();

        System.out.println("Вызов Main: вызываем метод подкласса с текстовым параметром:");
        B.setTxt("Сначала ничего не было");
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        B.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        B.getLenText();

        System.out.println("Вызов Main: вызываем метод подкласса с числовым и текстовым параметром:");
        B.setTxt(65,"Затем было слово");
        System.out.println("Вызов Main: вызываем метод show для просмотра");
        B.show();
        System.out.println("Вызов Main: запрашиваем длину текста:");
        B.getLenText();

        System.out.println("\n\t*** Проверочный вызов А ***");
        A.show();
        A.getLenText();
    }
}
