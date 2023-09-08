package com.icodeap.ecommerce.infrastructure.adapter;

import com.icodeap.ecommerce.infrastructure.entity.ProductEntity;
import org.springframework.data.repository.CrudRepository;

public interface ProductCruddRepository  extends CrudRepository<ProductEntity, Integer> {

}
