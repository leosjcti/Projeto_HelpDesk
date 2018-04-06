package com.leonardo.helpdesk.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.leonardo.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {

	User findByEmail(String email);
}
