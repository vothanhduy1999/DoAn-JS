package com.controllers;

import com.models.Product;
import com.models.ModelProduct;
import com.views.UpdateProductView;

import javax.swing.*;
import java.awt.*;

public class UpdateControllerImplement implements UpdateController {
    UpdateProductView view;
    ModelProduct model;
    Component parent;

    public UpdateControllerImplement(Component parent, ModelProduct model, UpdateProductView view) {
        this.parent = parent;
        this.model = model;
        this.view = view;
    }

    @Override
    public void updateStaff(int id) {
        Product product = model.getProductByID(id);
        view.setFullName(product.getProductName());
        view.setSoLuong(product.getSoLuong());
        view.setGia(product.getGia());
        int option = JOptionPane.showConfirmDialog(parent,
                view.getRootPanel(),
                "Cập Nhập Sản Phẩm",
                JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (!view.getFullName().trim().equals("")) {
                String fullName = view.getFullName();
                int amount = view.getAmount();
                int prices = view.getPrices();

                product.setProductName(fullName);
                product.setSoLuong(amount);
                product.setGia(prices);

                model.updateProduct(product);
            } else {
                JOptionPane.showMessageDialog(parent, "Không Được Để Trống Tên Sản Phẩm");
            }

        }
    }
}
