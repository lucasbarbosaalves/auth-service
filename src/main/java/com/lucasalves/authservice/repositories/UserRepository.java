package com.lucasalves.authservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import com.lucasalves.authservice.domain.User;

public interface UserRepository extends JpaRepository<User, String>{
	UserDetails findByLogin(String login);

}
