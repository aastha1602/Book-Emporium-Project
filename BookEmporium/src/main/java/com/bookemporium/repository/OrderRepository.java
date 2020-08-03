package com.bookemporium.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookemporium.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Long>{

}
