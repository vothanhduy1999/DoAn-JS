package com.views;

import com.models.Product;

import javax.swing.table.AbstractTableModel;
import java.util.List;
import java.util.Vector;

public class ProductTableModel extends AbstractTableModel {
    private List<Product> products = new Vector<>();

    private static final String[] COLUMN_NAMES = {"Stt", "Tên Sản Phẩm", "Số Lượng", "Giá"};
    private static final int ID = 0;
    private static final int TEN_SP = 1;
    private static final int SOLUONG = 2;
    private static final int GIA =3;
    @Override
    public int getRowCount() {
        return products.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMN_NAMES.length;
    }

    @Override
    public String getColumnName(int column) {
        return COLUMN_NAMES[column];
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        Product product = products.get(rowIndex);
        if (columnIndex == ID) {
            return product.getID();
        } else if (columnIndex == TEN_SP) {
            return product.getProductName();
        } else if (columnIndex == SOLUONG){
            return product.getSoLuong();
        }else if(columnIndex == GIA){
            return product.getGia();
        }
        return null;
    }
    public void update(List<Product> products){

        this.products.clear();
        this.products.addAll(products);
        fireTableDataChanged();
    }
}
