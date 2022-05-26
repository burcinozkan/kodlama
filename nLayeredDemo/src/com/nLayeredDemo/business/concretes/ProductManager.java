package com.nLayeredDemo.business.concretes;

import com.nLayeredDemo.business.abstracts.ProductService;
import com.nLayeredDemo.core.LoggerService;
import com.nLayeredDemo.dataAccess.abstracts.ProductDao;
import com.nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {
    public ProductManager(ProductDao productDao, LoggerService loggerService) {
        this.productDao = productDao;
        this.loggerService= loggerService;
    }

    private ProductDao productDao;
    private LoggerService loggerService;
    @Override
    public void Add(Product product) {
        if (product.getCategoryId()==1) {
            System.out.println("BU kategoride ürün kabul edilmiyor");
            return;
        }

        this.productDao.add(product);
        this.loggerService.logToSystem("Ürün eklendi:"+ product.getName());


    }

    @Override
    public List<Product> getAll() {
        return null;
    }
}
