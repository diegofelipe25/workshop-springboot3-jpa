package com.programacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
