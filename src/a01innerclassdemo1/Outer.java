package a01innerclassdemo1;

public class Outer {
    private int a = 10;
    class Inner {
        private int a = 20;
        public void show() {
            int a = 30;
            System.out.println(Outer.this.a); // a = 10
            System.out.println(this.a); // a = 20
            System.out.println(a); // a = 30
        }
    }
}
