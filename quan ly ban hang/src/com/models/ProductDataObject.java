package com.models;

import java.util.List;

public interface ProductDataObject {

    void insertProduct(Product product);

    List<Product> getAllProduct();
    List<Product> getAllProductByName(String name);

    Product getProductByID(int ID);

    void updateProduct(Product product);

    void deleteProduct(int index);
}
