package com.rightInvesting.api;

import org.springframework.data.repository.CrudRepository;

import com.rightInvesting.ip.User;

public interface UserRepository extends CrudRepository<User,Integer> {

}
