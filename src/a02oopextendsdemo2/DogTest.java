package a02oopextendsdemo2;

public class DogTest {
    static void main() {
        Husky husky = new Husky();
        husky.eat();
        husky.drink();
        husky.breakHome();

        Sharpei sharpei = new Sharpei();
        sharpei.eat();
        sharpei.drink();
        sharpei.lookHome();

        ChinaDog chinaDog = new ChinaDog();
        chinaDog.eat();
        chinaDog.drink();
        chinaDog.lookHome();
    }
}
