package com.bookemporium.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookemporium.domain.CartItem;
import com.bookemporium.domain.Order;
import com.bookemporium.domain.ShoppingCart;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	List<CartItem> findByOrder(Order order);
}
