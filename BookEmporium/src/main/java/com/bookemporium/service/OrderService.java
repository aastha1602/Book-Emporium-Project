package com.bookemporium.service;

import com.bookemporium.domain.BillingAddress;
import com.bookemporium.domain.Order;
import com.bookemporium.domain.Payment;
import com.bookemporium.domain.ShippingAddress;
import com.bookemporium.domain.ShoppingCart;
import com.bookemporium.domain.User;

public interface OrderService {
	Order createOrder(ShoppingCart shoppingCart,
			ShippingAddress shippingAddress,
			BillingAddress billingAddress,
			Payment payment,
			String shippingMethod,
			User user);
	
	Order findOne(Long id);
}
