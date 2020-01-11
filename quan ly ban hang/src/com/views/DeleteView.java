package com.views;

import javax.swing.*;

public class DeleteView implements IView{
    private JPanel rootPanel;
    private JLabel txtName;

    public void setFullName(String fullName){
        txtName.setText(fullName);
    }

    @Override
    public JPanel getRootPanel() {
        return rootPanel;
    }
}
