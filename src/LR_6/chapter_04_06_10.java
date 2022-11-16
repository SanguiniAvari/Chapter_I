package LR_6;

public class chapter_04_06_10 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6,7};
        test = minMaxMagic.doMagic(test);
        System.out.println("Пробуем посмотреть");
        for(int i=0;i<test.length;i++){
            System.out.print(test[i]+"\t");
        }
    }
    static class minMaxMagic{
        static int[] doMagic(int ... nums){
            int[] consolid = nums;
            int[] count = new int[2];
            int max = 0;
            int min = 2147483647;
            for (int i=0;i<consolid.length;i++){
                if (max<consolid[i]){
                    max=consolid[i];
                }
                if (min>consolid[i]){
                    min=consolid[i];
                }
            }
            count[0]=min;
            count[1]=max;
            return count;
        }
    }
}
