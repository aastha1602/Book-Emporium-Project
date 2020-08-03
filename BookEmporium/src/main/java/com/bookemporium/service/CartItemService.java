package com.bookemporium.service;

import java.util.List;

import com.bookemporium.domain.Book;
import com.bookemporium.domain.CartItem;
import com.bookemporium.domain.Order;
import com.bookemporium.domain.ShoppingCart;
import com.bookemporium.domain.User;

public interface CartItemService {
	List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);
	
	CartItem updateCartItem(CartItem cartItem);
	
	CartItem addBookToCartItem(Book book, User user, int qty);
	
	CartItem findById(Long id);
	
	void removeCartItem(CartItem cartItem);
	
	CartItem save(CartItem cartItem);
	
	List<CartItem> findByOrder(Order order);
}
