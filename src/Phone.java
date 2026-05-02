public class Phone {
    private String name;
    private double price;

    public void setName(String name) {
        this.name = name;
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
