public class Phone {
    private String name; // 只定义不给值
    private double price;
    // 在创建对象之后，才可以赋值，如果在对象定义之前就进行赋值，那么这个变量就一直是这个值
    // 封装： 对象代表什么，就得封装对应的数据，并提供数据对应的行为
    public Phone(){
        System.out.println("调用了这个方法");
    }
    public Phone(String name ,int price){
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        //String name = "zhoujin";
        //System.out.println(name);
        // 如果想使用成员变量
        // System.out.println(this.name);
        this.name = name; // 表示的是在这个类中被 private修饰的name 就是成员变量 把name 赋值给它
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }

    public void call(){
        System.out.println(name + "打电话");
    }
    public void playGame(){
        System.out.println(name + "玩游戏");
    }
}
