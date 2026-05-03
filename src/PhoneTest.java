public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone("华为",59999);
        Phone phone1 =  new Phone(); // 会调用phone 的无参构造
        System.out.println(phone.getName() + " " + phone.getPrice());
        // 任何类定义出来，默认就自带了无参构造器。写不写都有
        // 一旦定义了有参数构造器，五参数构造器就没有了，此时就需要自己写无参构造
        // 所以在任何时候都要手动写上空参和带有全部参数的构造方法
    }
}
