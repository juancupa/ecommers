package com.icodeap.ecommerce.infrastructure.entity;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="productsd")
@NoArgsConstructor
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String description;
    private  String image;
    private BigDecimal price;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    @ManyToOne
    private UserEntity userEntity;
}
