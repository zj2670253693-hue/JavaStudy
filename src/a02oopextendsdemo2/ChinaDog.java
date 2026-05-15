package a02oopextendsdemo2;

public class ChinaDog extends  Dog{
    // 父类中的方法不能满足我们的需求了，所以需要进行重写
    @Override
    public void eat(){
        System.out.println("中国狗吃剩饭");
    }
}
