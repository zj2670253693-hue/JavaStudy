package a0innerclassdemo3;

public class Outer {
    // 局部内部类： 将内部类定义在方法里面就叫做局部内部类，类似与方法里面的局部变量
    int a = 20;
    public void show() {
        int a = 10;
        class Inner {
            // 该类可以直接访问外部类中的成员，也可以方法方法内部的局部变量
            public void show() {
                System.out.println(a);
                // 访问外部类成员变量
                System.out.println(Outer.this.a);
                System.out.println("局部内部类");
            }
            public static void show2() {
                System.out.println("局部内部类方法");
            }
        }
        // 创建局部内部类对象
        Inner inner = new Inner();
        inner.show();
        Inner.show2();
        // 外界是无法直接使用局部内部类，需要在方法内部创建对象并使用
    }
}
