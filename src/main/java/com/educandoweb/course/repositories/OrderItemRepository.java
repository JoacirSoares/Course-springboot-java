package com.educandoweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.OrderItem;

// Just having defined the JpaRepository you already have a default implementation
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
