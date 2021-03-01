package com.example.flipzone.service;

import com.example.flipzone.Repository.ProductRepository;
import com.example.flipzone.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() { return productRepository.findAll(); }

    public Product addProduct(Product pd){ return productRepository.save(pd); }

    public Optional<Product> findProductById(String pid) { return productRepository.findById(pid); }
}
