package pers.xleixz.view;

import java.awt.Container;

import javax.swing.JFrame;

import pers.xleixz.util.BackgroundImage;
import pers.xleixz.util.FrameOption;
import pers.xleixz.util.MenuBar;


/**
 * 主界面类
 *
 * @author 小雷学长
 */
public class MainFrame {


    JFrame frame = new JFrame("小雷的图书馆");
    Container container = frame.getContentPane();

    public MainFrame() {

        // 设置背景图片
        new BackgroundImage(frame, container, "mainFrame.jpg");
        // 添加工具栏以及各组件和监听事件
        new MenuBar(frame);

        // 设置窗口大小、位置、可视、默认关闭方式等
        new FrameOption(frame);
    }


}
