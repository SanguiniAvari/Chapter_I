package LR_4;

public class chapter_04_04_1 {
    public static void main(String[] args) {
        int figure = 12;
        int i, j, z;

        for (i=1; i < figure; i++){
            System.out.print("номер строки: " + i + " ");
            z=0;
            for(j=-11; j < figure; j++){
                System.out.print("+");
                z++;
            }
            System.out.println(" Количество символов в строке "+z);
        }

    }
}
