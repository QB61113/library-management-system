package pers.xleixz;


import javax.swing.JFrame;

import pers.xleixz.view.Login;


/**
 * 主程序类
 */
@SuppressWarnings("serial")

public class BookManage extends JFrame {


    public BookManage() {

        new Login();
    }


    public static void main(String[] args) {

        new BookManage();

    }

}
