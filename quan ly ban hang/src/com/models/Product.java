package com.models;

public class Product {
    private  int ID;
    private  String ProductName;
    private  int SoLuong;

    public int getGia() {
        return Gia;
    }

    public void setGia(int gia) {
        this.Gia = gia;
    }

    private  int Gia;

    public Product() {
    }

    public Product(int ID, String ProductName, int SoLuong, int Gia) {
        this.ID = ID;
        this.ProductName = ProductName;
        this.SoLuong = SoLuong;
        this.Gia = Gia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        this.ProductName = productName;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int soLuong) {
        this.SoLuong = soLuong;
    }
}
