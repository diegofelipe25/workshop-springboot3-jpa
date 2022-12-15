package com.programacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
