package com.capstone.Week6Capstone;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capstone.Week6Capstone.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	List<User> findAllByOrderByName();

	User findByEmail(String email);

}
