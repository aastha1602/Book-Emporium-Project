package com.bookemporium.service;

import com.bookemporium.domain.Payment;
import com.bookemporium.domain.UserPayment;

public interface PaymentService {
	Payment setByUserPayment(UserPayment userPayment, Payment payment);
}
