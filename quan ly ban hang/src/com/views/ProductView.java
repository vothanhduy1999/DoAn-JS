package com.views;

import com.controllers.ProductController;
import com.models.Product;
import com.models.ModelProduct;
import com.models.TableObserver;

import javax.swing.*;
import java.awt.event.*;
import java.util.List;

public class ProductView implements IView, TableObserver {
    private JPanel rootPanel;
    private JTable tableProduct;
    private JButton btnAdd;
    private JButton btnDelete;
    private JButton btnUpdate;
    private JTextField txtSearch;
    private JButton searchButton;
    private ProductTableModel ProductTableModel;
    ModelProduct model;
    ProductController controller;

    public ProductView(ModelProduct model, ProductController controller) {
        this.model = model;
        this.controller = controller;

        ProductTableModel = new ProductTableModel();

        tableProduct.setModel(ProductTableModel);
        tableProduct.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        model.registerObserver(this);

        btnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.addProduct();
            }
        });

        btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tableProduct.getSelectedRow();
                if (row >= 0) {
                    int id = Integer.parseInt(tableProduct.getValueAt(row, 0).toString());
                    controller.deleteProduct(id);
                }
            }
        });

        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int row = tableProduct.getSelectedRow();
                if (row >= 0) {
                    int id = Integer.parseInt(tableProduct.getValueAt(row, 0).toString());
                    controller.updateProduct(id);
                }
            }
        });

        tableProduct.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    int row = tableProduct.getSelectedRow();
                    if (row >= 0) {
                        int id = Integer.parseInt(tableProduct.getValueAt(row, 0).toString());
                        controller.updateProduct(id);
                    }
                }
            }
        });
        List<Product> products = this.model.getAllProduct();
        ProductTableModel.update(products);

        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtSearch.getText().isEmpty()) {
                    List<Product> products = model.getAllProduct();
                    ProductTableModel.update(products);
                } else {
                    List<Product> products = model.getAllProductByName(txtSearch.getText());
                    ProductTableModel.update(products);
                }

            }
        });
    }

    @Override
    public JPanel getRootPanel() {
        return rootPanel;
    }

    @Override
    public void update(List<Product> productList) {
        ProductTableModel.update(productList);
    }
}
