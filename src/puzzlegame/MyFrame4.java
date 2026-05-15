package puzzlegame;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame4 extends JFrame implements KeyListener {

    public MyFrame4() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        // 如果一直按按键没有松开，就一直调用键盘监听方法
        // 按下一个按键之后，会记录一个键值码
        this.addKeyListener(this);
        // 在这个界面显示出来
        // 第一个this 表示的是哪个界面
        // 第二个this 表示的是哪个组件
        this.setVisible(true);
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下了按键");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if(e.getKeyCode() == 65){
            System.out.println("按下了A");
        }
    }
}
