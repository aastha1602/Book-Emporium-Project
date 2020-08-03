package com.bookemporium.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookemporium.domain.Book;
import com.bookemporium.domain.BookToCartItem;
import com.bookemporium.domain.CartItem;
import com.bookemporium.domain.Order;
import com.bookemporium.domain.ShoppingCart;
import com.bookemporium.domain.User;
import com.bookemporium.repository.BookToCartItemRepository;
import com.bookemporium.repository.CartItemRepository;
import com.bookemporium.service.CartItemService;

@Service
public class CartItemServiceImpl implements CartItemService{
	
	@Autowired
	private CartItemRepository cartItemRepository;
	
	@Autowired
	private BookToCartItemRepository bookToCartItemRepository;
	
	public List<CartItem> findByShoppingCart(ShoppingCart shoppingCart) {
		return cartItemRepository.findByShoppingCart(shoppingCart);
	}
	
	public CartItem updateCartItem(CartItem cartItem) {
		BigDecimal bigDecimal = new BigDecimal(cartItem.getBook().getOurPrice()).multiply(new BigDecimal(cartItem.getQty()));
		
		bigDecimal = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP);
		cartItem.setSubtotal(bigDecimal);
		
		cartItemRepository.save(cartItem);
		
		return cartItem;
	}
	
	public CartItem addBookToCartItem(Book book, User user, int qty) {
		List<CartItem> cartItemList = findByShoppingCart(user.getShoppingCart());
		
		for (CartItem cartItem : cartItemList) {
			// That is to say that , the book we are trying to add 
			// is already in the shopping cart.
			if(book.getId() == cartItem.getBook().getId()) {
				cartItem.setQty(cartItem.getQty()+qty); //If book already exists , we will gonna increase the quantity.
				cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
				cartItemRepository.save(cartItem);  //And then , invoke the cartItemRepository to save that into our database.
				return cartItem;
			}
		}
		
		// If the book we are trying to add is not in the cart item , it is the new book , 
		// then we will create a new cartItem.	
		CartItem cartItem = new CartItem();
		// And then , set the Shopping Cart to current Shopping Cart , 
		// which is from the user.
		cartItem.setShoppingCart(user.getShoppingCart());
		// And then , set the Book to the book , we are trying to add.
		cartItem.setBook(book);
		
		// And then , set the Quantity(Qty) to the quantity(qty) , we just added.
		cartItem.setQty(qty);
		// And then , set the Subtotal as follows
		cartItem.setSubtotal(new BigDecimal(book.getOurPrice()).multiply(new BigDecimal(qty)));
		// And then , save the cartItem to the database.
		// And then , return the cartItem that we have saved.
		cartItem = cartItemRepository.save(cartItem);
		
		// After that , we need to define a BookToCartItem , to maintain the relationship.
		BookToCartItem bookToCartItem = new BookToCartItem();
		bookToCartItem.setBook(book);
		bookToCartItem.setCartItem(cartItem);
		// And then , save this bookToCartItem to the database.
		bookToCartItemRepository.save(bookToCartItem);
		
		return cartItem;
	}
	
	public CartItem findById(Long id) {
		return cartItemRepository.findOne(id);
	}
	
	public void removeCartItem(CartItem cartItem) {
		bookToCartItemRepository.deleteByCartItem(cartItem);
		cartItemRepository.delete(cartItem);
	}
	
	public CartItem save(CartItem cartItem) {
		return cartItemRepository.save(cartItem);
	}

	public List<CartItem> findByOrder(Order order) {
		return cartItemRepository.findByOrder(order);
	}
}
