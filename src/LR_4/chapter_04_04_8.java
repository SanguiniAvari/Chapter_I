package LR_4;

import java.util.Scanner;

public class chapter_04_04_8 {
    public static String getEncryptString(String encryptString, int shift) {
        char[] ArrayChar = encryptString.toCharArray();
        long[] ArrayInt = new long[ArrayChar.length];
        char[] ArrayCharNew = new char[ArrayChar.length];
        for (int i = 0; i < ArrayChar.length; i++) {
            ArrayInt[i] = ArrayChar[i] + shift;
            ArrayCharNew[i] = (char) ArrayInt[i];
        }
        encryptString = new String(ArrayCharNew);

        return encryptString;
    }

    public static void main(String[] args) {
        System.out.print("Введите текст для шифрования: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.print("Введите ключ: ");
        int key = scanner.nextInt();

        System.out.print("\nТекст после преобразования: ");
        String pass = getEncryptString(line, key);
        System.out.println(pass);
           while (true) {
               System.out.print("\nВыполнить обратное преобразование? (y/n): ");
               char q = scanner.next().charAt(0);
               if (q == 'y') {
                   String unpass = getEncryptString(pass, -key);
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

