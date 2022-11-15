package LR_6;

public class chapter_04_06_8 {
    public static void main(String[] args) {
        int[] test = new int[]{1,2,3,4,5,6};
        System.out.print("среднее значение элементов массива: "+midArr.midRes(test));
    }
    static class midArr{
        static double midRes(int[] nums){
            double res=0;
            for (int i=0; i< nums.length;i++){
                res+=nums[i];
            }
            res/=nums.length;
            return res;
        }
    }
}
