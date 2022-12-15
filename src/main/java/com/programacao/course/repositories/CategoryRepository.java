package com.programacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
