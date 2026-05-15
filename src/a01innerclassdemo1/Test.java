package a01innerclassdemo1;

public class Test {
    static void main() {
        Outer.Inner inner = new Outer().new Inner(); // 创建内部类对象
        inner.show();
    }
}
