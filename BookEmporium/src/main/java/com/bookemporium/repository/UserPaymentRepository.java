package com.bookemporium.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookemporium.domain.UserPayment;

public interface UserPaymentRepository extends CrudRepository<UserPayment, Long>{

}
