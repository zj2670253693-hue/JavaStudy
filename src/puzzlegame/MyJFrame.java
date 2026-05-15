package puzzlegame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyJFrame extends JFrame {
    JButton button = new JButton("点击我");
    JButton button1 = new JButton("再点击我呀");
    public MyJFrame(){
        this.setSize(603, 680);
        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        button.setBounds(0,0,100,50);
        // 对按钮添加事件,在这里使用了匿名内部类
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了");
            }
        });
        button1.setBounds(100,50,100,50);
        // 对按钮添加事件,在这里使用了匿名内部类
        button1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了");
            }
        });
        this.getContentPane().add(button);
        this.getContentPane().add(button1);
        // 在这个界面显示出来
        this.setVisible(true);
    }
}
