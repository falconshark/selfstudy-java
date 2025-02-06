package com.todo.todo;

import com.todo.todo.User;
import com.todo.todo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
import java.util.List;

@Service
public class UserServiceImp implements UserService{
    @Autowired
    private UserRepository userRepository;
 
    // save operation
    @Override
    public User saveUser(User user) {
        User n = new User();
        n.setName(user.getName());
        n.setPassword(user.getPassword());
        return userRepository.save(n);
    }
    @Override
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }
}
