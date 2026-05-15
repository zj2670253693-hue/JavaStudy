package a01oopextendsdemo1;
class Person{
    public void eat(){
        System.out.println("吃饭");
    }
    public void drink(){
        System.out.println("喝水");
    }
}
class OverseasStudent extends Person{
    // 当父类中的方法不能满足子类要求，那么子类就可以重写父类的方法
    // 子类重写父类方法时，访问权限子类必须大于等于父类
    // 子类重写父类方法时，返回值类型子类必须小于等于父类
    @Override
    public void eat(){
        System.out.println("吃西餐");
    }
    @Override
    public void drink(){
        System.out.println("喝咖啡");
    }
    public void lunch(){
        // 在本类中查找 eat 和drink 方法
        this.eat();
        this.drink();

        super.drink();
        super.eat();
    }
}
class Student extends Person{
    public void study(){
        System.out.println("学习");
    }
    public void lunch(){
        // 现在子类中寻找是否存在eat和drink方法，如果有就直接调用，如果没有就会调用父类中的eat和drink方法
        this.eat();
        this.drink();
        // 直接调用父类中的eat和 drink方法
        super.drink();
        super.eat();
    }
}
public class Test {
    static void main() {
//        Student s = new Student();
//        s.lunch();
        OverseasStudent os = new OverseasStudent();
        os.lunch();
    }
}
