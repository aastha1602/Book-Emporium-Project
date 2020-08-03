package com.bookemporium.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import com.bookemporium.domain.BookToCartItem;
import com.bookemporium.domain.CartItem;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
	void deleteByCartItem(CartItem cartItem);
}
