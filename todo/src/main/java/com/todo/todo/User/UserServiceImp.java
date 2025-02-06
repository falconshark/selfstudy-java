package com.todo.todo.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;
 
    // save operation
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
    @Override
    public Optional<User> getUser(Integer id) {
        return userRepository.findById(id);
    }
}
