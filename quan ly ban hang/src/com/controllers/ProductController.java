package com.controllers;

public interface ProductController extends Controller{

    void addProduct();

    void deleteProduct(int id);

    void updateProduct(int id);

    void search(String name);
}
