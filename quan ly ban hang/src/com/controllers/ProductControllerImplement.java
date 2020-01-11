package com.controllers;

import com.models.ModelProduct;
import com.views.*;

public class ProductControllerImplement implements ProductController {

    ProductView view;
    ModelProduct model;
    public ProductControllerImplement(ModelProduct model) {
        this.model = model;
        view = new ProductView(model, this);
    }
    @Override
    public IView getView(){
        return view;
    }
    @Override
    public void addProduct() {

        NewController newNvController = new NewControllerImplement(view.getRootPanel(), model, new NewProductView());
        newNvController.newProduct();
    }

    @Override
    public void deleteProduct(int id) {
        DeleteProductController delNvController = new DellControllerImplement(view.getRootPanel(),
                model, new DeleteView());
        delNvController.deleteProduct(id);
    }

    @Override
    public void updateProduct(int id) {

        UpdateController updateController = new UpdateControllerImplement(view.getRootPanel(), model,
                new UpdateProductView());

        updateController.updateStaff(id);
    }

    @Override
    public void search(String name) {

    }
}
