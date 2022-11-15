package LR_6;

public class chapter_04_06_6 {
    public static void main(String[] args) {
        System.out.println("Проверяем нормальную работу");
        int [] a = new int[]{1,2,3,4,5,6};
        int b = 4;
        for (int i=0; i<magicArr.doMagic(a,b).length;i++){
            System.out.print(magicArr.doMagic(a,b)[i]+"\t");
        }

        System.out.println("\nПроверяем работу при большем числе индексов нового массива");
        int [] k = new int[]{1,2,3,4,5,6};
        int l = 14;
        for (int i=0; i<magicArr.doMagic(k,l).length;i++){
            System.out.print(magicArr.doMagic(k,l)[i]+"\t");
        }
        System.out.println("\nПроверяем работу при отрицательных значениях");
        int [] m = new int[]{1,2,3,4,5,6};
        int n = -4;
        for (int i=0; i<magicArr.doMagic(m,n).length;i++){
            System.out.print(magicArr.doMagic(m,n)[i]+"\t");
        }
    }
    static class magicArr{
        static int[] doMagic(int[] nums, int num){
            if (num > 0){
                int[] resArr= new int[num];
                if (num>nums.length){
                    resArr = nums;
                } else if (num > 0){
                    resArr = new int[num];
                    for (int i=0;i<resArr.length;i++){
                        resArr[i]=nums[i];
                    }
                }
                return resArr;
            }
            else {
                System.out.println("Введено некорректное значение длины нового массива");
                int[] resArr= new int[0]; //коряво обхожу исключение
                return resArr;
            }

        }
    }
}
