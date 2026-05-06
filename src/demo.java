import java.util.Arrays;
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
        String[] testCases = {
            "Hello World",
            "Hello World  ",
            "Hello",
            "   ",
            ""
        };
        for (String str : testCases) {
            int length = getLastWordLength(str);
            System.out.println("字符串: \"" + str + "\"");
            System.out.println("最后一个单词的长度: " + length);
            System.out.println();
        }
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
    // 生成验证码，可以是小写，也可以是大写，还可以是数字，长度为5，其中4个是字母，一个数字
    public static String generateVerificationCode(){
        char []newArr = new char[5];
        char []arr = new char[52];
        for(int i=0;i<26;i++){
            arr[i] = (char)('a' + i);
        }
        for(int i=26;i<arr.length;i++){
            arr[i] = (char)('A' + (i - 26));
        }
        Random random = new Random();
        for(int i=0;i<4;i++){
            int index = random.nextInt(52);
            newArr[i] = arr[index];
        }
        char ch = (char)('0' + random.nextInt(10));
        newArr[4] = ch;
        int swap_index = random.nextInt(5);
        if (swap_index != 4) {
            char temp = newArr[swap_index];
            newArr[swap_index] = newArr[4];
            newArr[4] = temp;
        }
        return new String(newArr);
    }
    // 两个字符串相乘，这里不考虑字符串整数过大，导致的类型溢出问题
    public static int stringMultiply(String str1, String str2) {
        int []nums1 = new int[str1.length()];
        int []nums2 = new int[str2.length()];
        stringToArr(str1, nums1);
        stringToArr(str2, nums2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        int num1 = arrToNum(nums1);
        int num2 = arrToNum(nums2);
        return num1 * num2;
    }
    public static int arrToNum(int []nums){
        int res = 0;
        int count = 1;
        for(int i=nums.length - 1;i >= 0;i--){
            res = res + nums[i] * count;
            count *= 10;
        }
        // 3 * 1 = 3 count = 10
        // 3 + 2 * 10 = 23 count = 100
        // 23 + 100 = 123
        return res;
    }
    public static void stringToArr(String s,int []nums){
        for(int i = 0;i < s.length();i++){
            nums[i] = s.charAt(i) - '0';
        }
    }
    // 输入一个字符串，该字符串中包含若干个单词，得到最后一个单词的长度
    public static int getLastWordLength(String str){
        if (str == null || str.isEmpty()) {
            return 0;
        }
        int count = 0;
        int i = str.length() - 1;
        while (i >= 0 && str.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && str.charAt(i) != ' ') {
            count++;
            i--;
        }
        return count;
    }
}
