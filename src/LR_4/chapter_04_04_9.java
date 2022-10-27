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
        // создаем новый массив
        char[] MutArray = new char[ArrayChar.length];
        /* вводим переменную в которую в последствии будем помещать индекс найденного символа
         и прибавлять к нему смещение */
        int kir = 0;
        //создаем первый цикл, который проходит по введенной строке посимвольно
        for (int i=0; i<ArrayChar.length; i++){
            //помещаем в временную переменную значение символа введенной строки
            char temp = ArrayChar[i];
            // создаем второй цикл для поиска переменной в созданном словаре
            for (int q=0; q < arr_char.length; q++){
                if(temp == arr_char[q]){
                    // когда символ найден помещаем ешго в переменную и прибавляем значение смещения
                    kir = q+shift;
                    // проверяем не выходит ли полученный индекс за пределы массива в большую сторону
                    if (kir >= arr_char.length){
                        // если выходит то запускаем цикл по уменьшению значения
                        while (kir >= arr_char.length){
                            kir = kir - arr_char.length;
                        }
                        // помещаем полученный символ крокозябры в массив символов кровозябры
                        MutArray[i] = arr_char[kir];
                        // прерываем цикл, так как уже нашли что искали
                        break;
                    /* проверяем не выходит ли полученный индекс за пределы массива в меньшую сторону,
                    аналогично как в большую */
                    } else if (kir < 0){
                        while (kir < 0){
                            kir = kir + arr_char.length;
                        }
                        MutArray[i] = arr_char[kir];
                        break;
                        // если всё тип-топ, то просто записываем кроко-символ в массив
                    } else{
                        MutArray[i] = arr_char[kir];
                        break;
                    }
                }
            }

        }
        // преобразуем полученную крокозябру в строку
        String MutString = new String(MutArray);
        // возвращаем строку
        return MutString;
    }

    public static void main(String[] args) {



        // Запрашиваем пользовательский ввод строки
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String line = scanner.nextLine();
        // Запрашиваем ключ
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();
        // Запускаем метод преобразования и выводим в консоль
        String reline = getArray(line,key);
        System.out.print("\nТекст после преобразования: ");
        System.out.print(reline);

        // спрашиваем об обратном преобразовании
        while (true) {
            System.out.print("\nВыполнить обратное преобразование? (y/n): ");
            char q = scanner.next().charAt(0);
            if (q == 'y') {
            // если получили ответ, что обратно нужно преобразовать, то запускаем обратный процесс изменяя знак ключа
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

