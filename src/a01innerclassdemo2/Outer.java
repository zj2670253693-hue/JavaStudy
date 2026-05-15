package a01innerclassdemo2;

public class Outer {
    String name;
    int age;
    static int count = 100;
    static class Inner {
        public void show() {
            // 静态内部类只能访问外部类中的静态方法和静态变量，如果要访问外部非静态成员，则需要创建对象
            Outer outer = new Outer();
            System.out.println(outer.name);
            System.out.println(outer.age);
            System.out.println(Outer.count);
            System.out.println("普通方法被调用了");
        }
        public static void show2() {
            // 静态方法中不能访问非静态成员变量
//             System.out.println(name);
//             System.out.println(age);
            System.out.println(Outer.count);
            System.out.println("静态方法被调用了");
        }
    }
}
