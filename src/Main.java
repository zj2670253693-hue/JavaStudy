import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int  n = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 0;i < n;i++){
            System.out.println("i = " + i);
        }
        // 隐式类型转化
//        int a = 10;
//        double b = 12.3;
//        System.out.println(a + b);
        // System.out.println(b);
        // 数据类型不一样的时候，不能进行计算，需要转成一样的才可以进行计算
        // byte short char 三种类型的数据在运算的时候，后悔直接先提升为int，然后在进行计算
        // += -= *= /= %= 底层都隐藏了一个强制类型转换
        short s = 1;
        s += 1; // 相当于 s = (short)(s + 1);
        System.out.println(s);
        int a = 300;
        byte b = (byte) a;
        a = 200;
        // 00000000 00000000 00000000 11001000
        // 1100 1000
        // 补码取反加一
        // 1011 0111
        // 1011 1000
        // 8 + 16 + 32 = 56
        // -56
        byte c = (byte) a;
        System.out.println(c);
    }
}