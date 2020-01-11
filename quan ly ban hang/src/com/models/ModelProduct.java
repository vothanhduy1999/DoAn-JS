package com.models;

import java.util.List;

public interface ModelProduct {

    List<Product> getAllProduct();
    List<Product> getAllProductByName(String name);
    Product getProductByID(int id);

    void addProduct(Product product);

    void deleteProduct(int index);

    void updateProduct(Product product);

    void registerObserver(TableObserver observer);

    void unregisterObserver(TableObserver observer);

}
