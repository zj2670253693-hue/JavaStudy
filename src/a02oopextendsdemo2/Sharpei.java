package a02oopextendsdemo2;

public class Sharpei extends Dog{
    @Override
    public void eat() {
        super.eat(); // 吃狗粮
        System.out.println("哈士奇吃骨头");
    }
}
