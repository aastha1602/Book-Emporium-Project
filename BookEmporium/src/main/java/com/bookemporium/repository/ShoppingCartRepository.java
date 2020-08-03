package com.bookemporium.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookemporium.domain.ShoppingCart;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart, Long> {

}
