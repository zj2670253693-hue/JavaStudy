package a01innerclassdemo2;

public class Test {
    static void main() {
        Outer.Inner inner = new Outer.Inner();
        inner.show();
        Outer.Inner.show2();
    }
}
