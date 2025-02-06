package com.todo.todo.LoginToken;
import org.springframework.data.repository.CrudRepository;

public interface LoginTokenRepository extends CrudRepository<LoginToken, Integer> {
    LoginToken findByToken(String token);
}

