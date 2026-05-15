package puzzlegame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame2 extends JFrame implements ActionListener {
    JButton button = new JButton("点击我");
    JButton button1 = new JButton("再点击我呀");

    public MyFrame2() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        button.setBounds(0, 0, 100, 50);
        button1.setBounds(100,50,100,50);
        // 设置监听
        button.addActionListener(this); // 这里的this 表示的是本类的对象
        button1.addActionListener(this);
        this.getContentPane().add(button);
        this.getContentPane().add(button1);
        // 在这个界面显示出来
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 获取操作对象的那个按钮
        JButton source = (JButton) e.getSource();
        if(source == button){
            // 如果点击了button，设置按钮的大小为原来的一倍
            button.setSize(button.getWidth() * 2, button.getHeight() * 2);
            System.out.println("点击了button");
        }else if(source == button1){
            // 如果点击了button1 设置按钮出现在界面的任意位置
            button1.setLocation((int)(Math.random()*500), (int)(Math.random()*500));
            System.out.println("点击了button1");
        }
    }
}
