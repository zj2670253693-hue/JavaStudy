package puzzlegame;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyFrame3 extends JFrame implements MouseListener {
    JButton button = new JButton("点击我");

    public MyFrame3() {
        this.setSize(603, 680);
        this.setTitle("拼图游戏");
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        button.setBounds(0, 0, 100, 50);
        // 设置鼠标监听事件
        button.addMouseListener(this);
        this.getContentPane().add(button);
        // 在这个界面显示出来
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // 获取点击的按钮
        JButton source = (JButton) e.getSource();
        if(source == button){
            System.out.println("点击了按钮");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // 获取点击的按钮
        JButton source = (JButton) e.getSource();
        if(source == button){
            System.out.println("按下了按钮");
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // 获取点击的按钮
        JButton source = (JButton) e.getSource();
        if(source == button){
            System.out.println("松开了按钮");
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // 获取点击的按钮
        JButton source = (JButton) e.getSource();
        if(source == button){
            System.out.println("鼠标进入了按钮");
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // 获取点击的按钮
        JButton source = (JButton) e.getSource();
        if(source == button){
            System.out.println("鼠标退出了按钮");
        }
    }
}
