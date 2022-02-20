package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;
import com.educandoweb.course.entities.Product;

// Just having defined the JpaRepository you already have a default implementation
public interface ProductRepository extends JpaRepository<Product, Long> {

}
