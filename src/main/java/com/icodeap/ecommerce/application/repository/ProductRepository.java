package com.icodeap.ecommerce.application.repository;

import com.icodeap.ecommerce.domain.Product;
import com.icodeap.ecommerce.domain.User;



public interface ProductRepository {

    Iterable<Product> getProducts();
    Iterable<Product> getProductByUser(User user);
    Product getProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProductById(Integer id);


}
