package com.models;

import java.util.List;
import java.util.Vector;

public class ModelProductImplement implements ModelProduct {

    List<TableObserver> observers = new Vector<>();

    @Override
    public List<Product> getAllProduct() {
        ProductDataObject dao = new ProductDataObjectImplement();
        return dao.getAllProduct();
    }

    @Override
    public List<Product> getAllProductByName(String name) {
        ProductDataObject dao = new ProductDataObjectImplement();
        return dao.getAllProductByName(name);
    }

    @Override
    public Product getProductByID(int id) {
        ProductDataObject dao = new ProductDataObjectImplement();
        return dao.getProductByID(id);
    }

    @Override
    public void addProduct(Product product) {

        ProductDataObject dao = new ProductDataObjectImplement();
        dao.insertProduct(product);
        notifyObservers();
    }

    @Override
    public void deleteProduct(int index) {

        ProductDataObject dao = new ProductDataObjectImplement();
        dao.deleteProduct(index);
        notifyObservers();
    }

    @Override
    public void updateProduct(Product product) {
        ProductDataObject dao = new ProductDataObjectImplement();
        dao.updateProduct(product);
        notifyObservers();
    }

    @Override
    public void registerObserver(TableObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void unregisterObserver(TableObserver observer) {
        observers.remove(observer);
    }

    private void notifyObservers() {
        List<Product> students = getAllProduct();
        for (TableObserver observer : observers) {
            observer.update(students);
        }
    }
}
