package com.bookemporium.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookemporium.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	Role findByname(String name);
}
