package puzzlegame;

import javax.swing.*;

public class LoginJFrame extends JFrame {
    // 在创建登陆页面的时候，同时给出这个页面设置一些信息
    // 比如长宽，直接展示出来,所以在调用loginJFrame的时候，就自动调用构造方法
    // 构造方法：在创建对象的时候，用来进行初始化
    public LoginJFrame() {
        this.setTitle("登陆界面");
        this.setSize(488, 430);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible( true);
    }
}
