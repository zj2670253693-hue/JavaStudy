package a0innerclassdemo4;

public class Test {
    // 匿名内部类 隐藏了名字的内部类，可以写在成员位置，也可以写在局部位置
    // 格式细节：包含了继承或实现，方法重写，创建对象，整体就是一个类的子类对象或者接口的实现类对象
    // 当方法的参数是接口或者类时，以接口为例，可以传递这个接口的实现类对象，如果实现类只要使用一次，就可以用匿名内部类简化代码
    public static void main(String[] args) {
       Swim s =  new Swim(){
            @Override
            public void swim() {
                System.out.println("swim");
            }
        };
        Animal animal = new Animal(){
            @Override
            public void eat() {
                System.out.println("eat");
            }
        };
        new Animal(){
            @Override
            public void eat() {
                System.out.println("吃骨头");
            }
        }.eat();
        s.swim();
        animal.eat();
        // 在测试类中调用methd方法
        // 在以前的方法中要创建一个子类继承自父类animal 之后实例化子类对象，在子类中重写抽象方法
        // 现在直接使用匿名内部类，在方法的参数中直接就是匿名内部类，直接就是一个对象
        method(new Animal(){
            @Override
            public void eat() {
                System.out.println("狗吃骨头");
            }
        });
    }
    public static void method(Animal animal){
        animal.eat();
    }
}
