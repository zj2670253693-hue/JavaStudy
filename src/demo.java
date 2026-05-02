import java.util.Random;
import java.util.Scanner;

public class demo {
    public static void func(){
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        System.out.println(num);
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while(true){
            count++;
            if(count == 3){
                System.out.println("你猜的次数已经超过3次，游戏结束");
            }
            int input = scanner.nextInt();
            if(input ==  num){
                System.out.println("恭喜你猜对了");
                break;
            }else if(input > num){
                System.out.println("你猜的数字太大了");
            }else{
                System.out.println("你猜的数字太小了");
            }
        }
    }
    public static void func_01(int []nums){
        for(int i=0;i<nums.length;i++){
            for(int j = 0;j<nums.length - 1 - i;j++){
                if(nums[j] < nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
    }
    public static void main() {
        // func();
        int []nums = {21,12,3,4,5,6,7,8,9,10};
        selectSort(nums);
        for(int i = 0;i < nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    // 选择排序
    public static void selectSort(int []nums){
        if(nums == null || nums.length < 2){
            return;
        }
        for(int i = 0,minIndex;i < nums.length;i++){
            minIndex = i;
            //找到 i+1 到 nums.length-1 中最小的索引
            for(int j = i+1;j < nums.length;j++){
                if(nums[j] < nums[minIndex]){
                    minIndex = j;
                }
            }
            swap(nums,i,minIndex);
        }
    }
    // 冒泡排序
    public static void bubbleSort(int []nums){
        if(nums == null || nums.length < 2){
            return;
        }
        // 表示的是排序的轮数
        for(int end = nums.length - 1;end > 0;end--){
            // 表示的是一轮排序中，比较的次数
            for(int i = 0;i < end;i++){
                if(nums[i] > nums[i+1]){
                    swap(nums,i,i+1);
                }
            }
        }
    }
    public static void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
