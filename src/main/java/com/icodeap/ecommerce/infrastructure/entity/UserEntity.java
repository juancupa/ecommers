package com.icodeap.ecommerce.infrastructure.entity;

import com.icodeap.ecommerce.domain.UserType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name="users")

public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String username;
    private  String firstName;
    private String lastName;
    private String email;
    private String address;
    private String cellphone;
    private String password;
    private UserType userType;
    private LocalDateTime dateCreated;
}
