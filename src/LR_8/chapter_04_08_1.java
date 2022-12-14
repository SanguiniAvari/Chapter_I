package LR_8;

import java.io.File;


class MagicThread extends Thread {
    MagicThread() {
        super("Магия первого порядка");
        start();
    }

    public void run() {
        try {
            long tmp1 = System.currentTimeMillis();
            File f1 = new File("MyFile1.txt");
            f1.createNewFile();
            if (f1.exists()) {
                System.out.println("Успех!");
                System.out.println("Полный путь 1: " + f1.getAbsolutePath());
            }
            tmp1 = System.currentTimeMillis()-tmp1;
            System.out.println("поток 1: " + tmp1+" мс");
        } catch (Exception e) {
            System.out.println("Ой-йой! " + e);
        }
    }
}
class Magic2Thread extends Thread{
        Magic2Thread(){
            super("Магия второго порядка");
            start();
        }
        public void run() {
            try {
                long tmp2 = System.currentTimeMillis();
                File f2 = new File("C:\\TMP\\Chapter_04_08_1.txt");
                f2.createNewFile();
                System.out.println("Полный путь 2: " + f2.getAbsolutePath());

                f2 = new File("C:\\TMP\\TASK_1.txt");
                f2.createNewFile();
                System.out.println("Полный путь 2: " + f2.getAbsolutePath());

                f2 = new File("C:\\TMP\\TASK_3.txt");
                f2.createNewFile();
                System.out.println("Полный путь 2: " + f2.getAbsolutePath());
                tmp2 = System.currentTimeMillis() - tmp2;
                System.out.println("поток 2: "+tmp2+" мс");
            } catch (Exception e) {
                System.out.println("Ой-йой! " + e);
            }
        }
}
class Magic3Thread extends Thread {
    Magic3Thread() {
        super("Магия третьего порядка");
        start();
    }

    public void run() {
        try {
            long tmp3 = System.currentTimeMillis();
            File f3 = new File("C:\\TMP\\LR_8\\TASK_1");
            f3.mkdirs();
            System.out.println("Полный путь 3: "+f3.getAbsolutePath());
            tmp3 = System.currentTimeMillis() - tmp3;
            System.out.println("поток 3: " + tmp3 + " мс");
        } catch (Exception e){
            System.out.println("Ой-йой! " + e);
        }
    }
}

public class chapter_04_08_1 {

    public static void main(String[] args) {
        new MagicThread();
        new Magic2Thread();
        new Magic3Thread();
    }
}

