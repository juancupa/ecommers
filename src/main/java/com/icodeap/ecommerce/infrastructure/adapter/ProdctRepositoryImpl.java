package com.icodeap.ecommerce.infrastructure.adapter;

import com.icodeap.ecommerce.application.repository.ProductRepository;
import com.icodeap.ecommerce.domain.Product;
import com.icodeap.ecommerce.domain.User;
import com.icodeap.ecommerce.infrastructure.mapper.ProductMapper;
import com.icodeap.ecommerce.infrastructure.mapper.UserMapper;

import org.springframework.stereotype.Repository;



@Repository

public class ProdctRepositoryImpl implements ProductRepository {
    private final  ProductCruddRepository productCruddRepository;
    private final ProductMapper productMapper;
    private final UserMapper userMapper;

    public ProdctRepositoryImpl(ProductCruddRepository productCruddRepository, ProductMapper productMapper, UserMapper userMapper) {
        this.productCruddRepository = productCruddRepository;
        this.productMapper = productMapper;
        this.userMapper = userMapper;
    }

    @Override
    public Iterable<Product> getProducts() {

        return productMapper.toProducts(productCruddRepository.findAll());
    }

    @Override
    public Iterable<Product> getProductByUser(User user) {

        return productMapper.toProducts(productCruddRepository.findByUserEntity(userMapper.toUserEntity(user)));
    }

    @Override
    public Product getProductById(Integer id) {

        return productMapper.toProduct(productCruddRepository.findById(id).get());
    }

    @Override
    public Product saveProduct(Product product) {
        return  productMapper.toProduct(productCruddRepository.save(productMapper.toProductEntity(product)));

    }

    @Override
    public void deleteProductById(Integer id) {
        productCruddRepository.deleteById(id);
    }
}
