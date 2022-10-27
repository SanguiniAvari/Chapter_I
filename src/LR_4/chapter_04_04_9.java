package LR_4;

import java.util.Scanner;

public class chapter_04_04_9 {
    public static String getArray(String encryptString, int shift) {
        // Задаем массив символов шифрования
        char[] arr_char = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
                'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
                'y', 'z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', 'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й',
                'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц',
                'ч', 'ш', 'щ', 'ь', 'ы', 'ъ', 'э', 'ю', 'я', 'А', 'Б', 'В', 'Г',
                'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П',
                'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ь', 'Ы', 'Ъ',
                'Э', 'Ю', 'Я', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                '!', '@', '#', '$', '%', '&', '?', '-', '+', '=', '~', ' ', '.',
                ',', '^', ':', ';', '[', ']', '{', '}', '|', '/', '*', '_'};
        // преобразуем строку в массив символов

        char[] ArrayChar = encryptString.toCharArray();

        // преобразуем в крокозябру

        char[] MutArray = new char[ArrayChar.length];
        int kir = 0;

        for (int i=0; i<ArrayChar.length; i++){
            char temp = ArrayChar[i];
            for (int q=0; q < arr_char.length; q++){
                if(temp == arr_char[q]){
                    kir = q+shift;
                    if (kir >= arr_char.length){
                        while (kir >= arr_char.length){
                            kir = kir - arr_char.length;
                        }
                        MutArray[i] = arr_char[kir];
                        break;
                    } else if (kir < 0){
                        while (kir < 0){
                            kir = kir + arr_char.length;
                        }
                        MutArray[i] = arr_char[kir];
                        break;
                    } else{
                        MutArray[i] = arr_char[kir];
                        break;
                    }
                }
            }

        }

        String MutString = new String(MutArray);
        return MutString;
    }

    public static void main(String[] args) {



        // Запрашиваем пользовательский ввод строки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String line = scanner.nextLine();
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        String reline = getArray(line,key);
        System.out.print("\nТекст после преобразования: ");
        System.out.print(reline);

        while (true) {
            System.out.print("\nВыполнить обратное преобразование? (y/n): ");
            char q = scanner.next().charAt(0);
            if (q == 'y') {
                String unpass = getArray(reline, -key);
                System.out.print("Был зашифрован текст: ");
                System.out.println(unpass);
                break;
            } else if (q == 'n') {
                System.out.print("До свидания!");
                break;
            } else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}

