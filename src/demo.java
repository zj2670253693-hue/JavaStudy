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
    public static void main(String[] args) {
        testPartition2();
    }
    
    public static void testPartition2() {
        int[] nums = {5, 3, 8, 4, 2, 7, 1, 6};
        System.out.println("测试 partition_2 方法");
        System.out.println("分区前:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        int pivotIndex = partition_2(nums, 0, nums.length - 1);
        
        System.out.println("分区后:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("基准值索引: " + pivotIndex + ", 基准值: " + nums[pivotIndex]);
        System.out.println();
        
        boolean valid = true;
        for (int i = 0; i < pivotIndex; i++) {
            if (nums[i] > nums[pivotIndex]) {
                valid = false;
                break;
            }
        }
        for (int i = pivotIndex + 1; i < nums.length; i++) {
            if (nums[i] < nums[pivotIndex]) {
                valid = false;
                break;
            }
        }
        System.out.println("验证结果: " + (valid ? "通过" : "失败"));
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
    // 二分查找
    public static int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // 快速排序
    public static void quickSort(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(nums, left, right);
            quickSort(nums, left, pivotIndex - 1);
            quickSort(nums, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (nums[j] <= pivot) {
                i++;
                swap(nums, i, j);
            }
        }
        swap(nums, i + 1, right);
        return i + 1;
    }
    private static int partition_2(int[] nums, int left, int right) {
        int pivot = nums[left];
        while (left < right) {
            while (left < right && nums[right] >= pivot) {
                right--;
            }
            nums[left] = nums[right];
            
            while (left < right && nums[left] <= pivot) {
                left++;
            }
            nums[right] = nums[left];
        }
        nums[left] = pivot;
        return left;
    }
    public static void swap(int []nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
