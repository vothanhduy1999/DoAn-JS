package com.views;

import javax.swing.*;

public class UpdateProductView implements IView {
    private JPanel rootPanel;
    private JTextField txtProductName;
    private JSpinner txtSoLuong;
    private JSpinner txtGia;

    @Override
    public JPanel getRootPanel() {
        return rootPanel;
    }

    public void setFullName(String fullName) {
        txtProductName.setText(fullName);
    }

    public String getFullName() {
        return txtProductName.getText();
    }

    public int getAmount(){
        return Integer.parseInt(String.valueOf(txtGia.getValue()));
    }
    public int getPrices(){
        return Integer.parseInt(String.valueOf(txtSoLuong.getValue()));
    }

    public void setSoLuong(int amount){
        txtGia.setValue(amount);
    }
    public void setGia(int prices){
        txtSoLuong.setValue(prices);
    }
}
