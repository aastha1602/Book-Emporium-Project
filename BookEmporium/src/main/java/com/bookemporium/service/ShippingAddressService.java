package com.bookemporium.service;

import com.bookemporium.domain.ShippingAddress;
import com.bookemporium.domain.UserShipping;

public interface ShippingAddressService {
	ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
