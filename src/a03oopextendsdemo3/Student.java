package a03oopextendsdemo3;

public class Student extends  Person{
    String name;
    int age;
    String school;
    public Student() {
        // 子类构造方法中隐藏的super() 去访问父类的无参构造
        //super();
        //System.out.println("子类无参构造");
        // 在没有给 student对象赋值的时候，默认school 为1234
        this(null,0,"1234");
    }
    public Student(String name,int age,String school) {
        //super(name,age); // 调用父类的带参构造
        //System.out.println("子类有参构造");
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
