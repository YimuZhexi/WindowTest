package window;

import window.login.LoginWindow;

import javax.swing.*;
import java.awt.*;

public class UIManager {
    private JFrame frame = null;

    public UIManager() {
        // 创建 JFrame 实例
        frame = new JFrame("Login Example");
        // Setting the width and height of frame
        frame.setSize(700, 500);
        // 使窗口默认屏幕居中
        int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
        int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
        int windowWidth = frame.getWidth();
        int windowHeight = frame.getHeight();
        frame.setLocation((screenWidth - windowWidth) / 2, (screenHeight - windowHeight) / 2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void Test() {

        /* 创建面板，这个类似于 HTML 的 div 标签
         * 我们可以创建多个面板并在 JFrame 中指定位置
         * 面板中我们可以添加文本字段，按钮及其他组件。
         */
        JPanel panel = new JPanel();
        // 添加面板
        frame.add(panel);
        /*
         * 调用用户定义的方法并添加组件到面板
         */
        LoginWindow.placeComponents(panel);

        // 设置界面可见
        frame.setVisible(true);

        frame.getComponents();
    }
}
