package com.icodeap.ecommerce.infrastructure.controller;


import com.icodeap.ecommerce.application.service.ProductService;
import com.icodeap.ecommerce.domain.Product;
import com.icodeap.ecommerce.domain.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
@AllArgsConstructor
public class AdminController {

    private final ProductService productService;
    @GetMapping
    public String home(Model model){
        User user = new User();
        user.setId(1);
        Iterable<Product> products=productService.getProductByUser(user);
        model.addAttribute("products",products);

        return "admin/home";
    }
}

