package com.views;

import com.controllers.Controller;

import javax.swing.*;
import java.awt.*;

public class ViewLoader extends JFrame {
    IView view;
    public ViewLoader(Controller controller){

        view = controller.getView();
        setContentPane(view.getRootPanel());
        setTitle("Quản Lý Bán Hàng");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new Dimension(600, 700));
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
    }
}
