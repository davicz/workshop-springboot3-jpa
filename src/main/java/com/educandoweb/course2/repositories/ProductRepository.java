package com.educandoweb.course2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course2.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
