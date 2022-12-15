package com.programacao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programacao.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
