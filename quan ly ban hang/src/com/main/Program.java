package com.main;

import com.controllers.ProductController;
import com.controllers.ProductControllerImplement;
import com.models.ModelProduct;
import com.models.ModelProductImplement;
import com.views.ViewLoader;

public class Program {
    public static void main(String[] args) {

        ModelProduct model = new ModelProductImplement();
        ProductController ProductController = new ProductControllerImplement(model);

        ViewLoader viewLoader = new ViewLoader(ProductController);
    }
}
