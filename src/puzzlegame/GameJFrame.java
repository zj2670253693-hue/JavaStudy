package puzzlegame;

import javax.swing.*;
import java.util.Random;

public class GameJFrame extends JFrame {
    int [][]data = new int[4][4]; // 用于加载数据
    public GameJFrame() {
        initJFrame();
        this.setJMenuBar(getBar());
        initData();
        initImage();
        this.setVisible(true);
    }

    private void initData() {
        int []nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0};
        // 随机打乱
        Random random = new Random();
        for(int i = 0;i<nums.length;i++){
            int index = random.nextInt(nums.length);
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
        for(int i = 0;i<nums.length;i++){
            data[i/4][i%4] = nums[i];
        }
    }

    private void initImage() {
        for(int i = 0;i<4;i++){
            for(int j = 0;j < 4;j++){
                ImageIcon icon = new ImageIcon("D:\\JavaStuday\\demo_4_1\\image\\animal\\animal1\\" + data[i][j] + ".jpg");
                JLabel jLabel = new JLabel(icon);
                jLabel.setBounds(105 * j, 105 * i, 105, 105);
                this.getContentPane().add(jLabel);
            }
        }
    } 

    private static JMenuBar getBar() {
        // 创建一个菜单栏
        JMenuBar jMenuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
        JMenuItem reLoginJMenuItem = new JMenuItem("重新登录");
        JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");

        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reLoginJMenuItem);
        functionJMenu.add(closeJMenuItem);

        JMenuItem accountItem = new JMenuItem("公众号");
        aboutJMenu.add(accountItem);

        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);
        return jMenuBar;
    }

    private void initJFrame() {
        this.setTitle("拼图游戏");
        this.setSize(488, 500);
        this.setAlwaysOnTop(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // 取消默认的居中放置
        this.setLayout(null);
    }
}
