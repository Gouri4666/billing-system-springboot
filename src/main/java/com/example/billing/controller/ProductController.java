package com.example.billing.controller;

import com.example.billing.model.Product;
import com.example.billing.repository.ProductRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductController {

    private final ProductRepository repo;

    // Constructor Injection
    public ProductController(ProductRepository repo){
        this.repo = repo;
    }

    // Show Products Page
    @GetMapping("/products")
    public String products(Model model){
        model.addAttribute("products", repo.findAll());
        return "products";
    }

    // Add Product
    @PostMapping("/addProduct")
    public String addProduct(@ModelAttribute Product product){
        repo.save(product);
        return "redirect:/products";
    }

    // Update Product (used by popup edit form)
    @PostMapping("/updateProduct")
    public String updateProduct(@ModelAttribute Product product){
        repo.save(product); // Hibernate updates if ID exists
        return "redirect:/products";
    }

    // Delete Product
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        repo.deleteById(id);
        return "redirect:/products";
    }
}