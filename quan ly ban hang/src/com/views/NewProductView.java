package com.views;

import javax.swing.*;

public class NewProductView implements IView{
    private JPanel rootPanel;
    private JTextField txtTenSanPham;
    private JSpinner txtSoLuong;
    private JSpinner txtGia;

    public JPanel getRootPanel() {
        return rootPanel;
    }
    public String getProductName(){
        return txtTenSanPham.getText();
    }
    public int getSoLuong(){
        return Integer.parseInt(String.valueOf(txtSoLuong.getValue()));
    }
    public int getGia(){
        return Integer.parseInt(String.valueOf(txtGia.getValue()));
    }
}
