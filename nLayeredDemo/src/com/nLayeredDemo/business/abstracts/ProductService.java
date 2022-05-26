package com.nLayeredDemo.business.abstracts;

import com.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public interface ProductService {
    void Add(Product product);
    List<Product> getAll();
}
