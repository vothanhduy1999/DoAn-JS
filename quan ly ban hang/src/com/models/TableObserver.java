package com.models;

import java.util.List;

public interface TableObserver {
    void update(List<Product> productList);
}
