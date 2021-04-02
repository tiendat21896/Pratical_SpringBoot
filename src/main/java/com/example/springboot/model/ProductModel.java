package com.example.springboot.model;


import com.example.springboot.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface ProductModel
        extends PagingAndSortingRepository<Product, Integer> {

    Page<Product> findProductsByPrice(int price, Pageable pageable);

    Page<Product> findProductsByStatus(int status, Pageable pageable);

    Page<Product> findByName(String name, Pageable pageable);

    Optional<Product> findById(int id);
}
