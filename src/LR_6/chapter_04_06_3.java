package LR_6;

public class chapter_04_06_3 {
    public static void main(String[] args) {
        System.out.print("Максимум: ");
        Matematica.maxMatematica(1,2,3,4,5,4,3,2,1);
        System.out.print("Минимум: ");
        Matematica.minMatematica(1,2,3,4,5,4,3,2,1);
        System.out.print("Среднее: ");
        Matematica.srMatematica(1,2,3,4,5,4,3,2,1);

        System.out.println("Работа с массивом: ");
        int[] test1 = new int[]{1,2,3,4,7,8,6,1,4,2,0,25,15};
        System.out.print("Максимум: ");
        Matematica.maxMatematica(test1);
        System.out.print("Минимум: ");
        Matematica.minMatematica(test1);
        System.out.print("Среднее: ");
        Matematica.srMatematica(test1);
    }
    static class Matematica{

        static void maxMatematica (int ... num){
            int[] nums = num;
            int tmp=0;
            for(int i =0; i<nums.length;i++){
                if (tmp<nums[i]){
                    tmp=nums[i];
                }
            }
            System.out.println("Максимум: "+tmp);
        }

        static void minMatematica (int ... num){
            int[] nums = num;
            int tmp=2147483647;
            for(int i =0; i<nums.length;i++){
                if (tmp>nums[i]){
                    tmp=nums[i];
                }
            }
            System.out.println("Минимум: "+tmp);
        }

        static void srMatematica (int ... num){
            int[] nums = num;
            double tmp=0;
            for(int i =0; i<nums.length;i++){
                tmp+=nums[i];
            }
            tmp = tmp/nums.length;
                System.out.println("Среднее: "+tmp);
            }
        }
    }

