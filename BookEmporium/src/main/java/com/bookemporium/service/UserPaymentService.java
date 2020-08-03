package com.bookemporium.service;

import com.bookemporium.domain.UserPayment;

public interface UserPaymentService {
	UserPayment findById(Long id);
	
	void removeById(Long id);
}
