package com.bookemporium.service;

import com.bookemporium.domain.UserShipping;

public interface UserShippingService {
	UserShipping findById(Long id);
	
	void removeById(Long id);
}
