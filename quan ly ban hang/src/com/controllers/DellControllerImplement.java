package com.controllers;

import com.models.Product;
import com.models.ModelProduct;
import com.views.DeleteView;

import javax.swing.*;
import java.awt.*;

public class DellControllerImplement implements DeleteProductController {
    ModelProduct model;
    Component parent;
    DeleteView view;
    public DellControllerImplement(Component parent, ModelProduct model, DeleteView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;
    }
    @Override
    public void deleteProduct(int id) {

        Product product = model.getProductByID(id);
        view.setFullName(product.getProductName());
        view.setFullName(product.getProductName());
        int option = JOptionPane.showConfirmDialog(parent, view.getRootPanel(),
                "Bạn Có Muốn Xóa Tên Sản Phẩm ",
                JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            model.deleteProduct(id);
        }
    }
}
