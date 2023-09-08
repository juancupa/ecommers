package com.icodeap.ecommerce.infrastructure.adapter;

import com.icodeap.ecommerce.application.repository.ProductRepository;
import com.icodeap.ecommerce.domain.Product;
import com.icodeap.ecommerce.domain.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;


@AllArgsConstructor
@Repository
public class ProdctRepositoryImpl implements ProductRepository {


    private final ProductCruddRepository productCruddRepository;
    @Override
    public Iterable<Product> getProducts() {
        return null;
    }

    @Override
    public Iterable<Product> getProductByUser(User user) {
        return null;
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }

    @Override
    public void deleteProductById(Integer id) {

    }
}
