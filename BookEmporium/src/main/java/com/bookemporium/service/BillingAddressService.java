package com.bookemporium.service;

import com.bookemporium.domain.BillingAddress;
import com.bookemporium.domain.UserBilling;

public interface BillingAddressService {
	BillingAddress setByUserBilling(UserBilling userBilling, BillingAddress billingAddress);
}
