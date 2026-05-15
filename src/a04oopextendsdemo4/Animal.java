package a04oopextendsdemo4;

public class Animal {
    String name = "动物";
    public void eat(){
        System.out.println("吃东西");
    }

    public static void main(String[] args) {
        Animal a = new Dog();
        // 多态 父类引用指向子类对象
        // 父类引用调用子类的特有方法时行不通的
        // a.lookHome();
        System.out.println(a.name);
        a.eat();
        // 先判断a是否为dog 类型 如果是 就进行强转成dog类型
        if(a instanceof Dog d){
            d.lookHome();
        }else if(a instanceof Cat c){
            c.catchMouse();
        }else{
            System.out.println("没有这个类型");
        }
    }
}
class Dog extends Animal{
    String name = "狗";
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
    public void lookHome(){
        System.out.println("看家");
    }
}
class Cat extends Animal{
    String name = "猫";
    @Override
    public void eat(){
        System.out.println("吃老鼠");
    }
    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
