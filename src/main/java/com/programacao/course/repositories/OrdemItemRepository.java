package com.programacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.course.entities.OrderItem;

public interface OrdemItemRepository extends JpaRepository<OrderItem, Long>{

}
