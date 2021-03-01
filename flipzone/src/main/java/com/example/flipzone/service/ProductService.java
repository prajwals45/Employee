package com.example.flipzone.service;

import com.example.flipzone.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public interface ProductService {

    List<Product> getAllProducts();

    Product addProduct(Product pd);

    Optional<Product> findProductById(String pid);
}
