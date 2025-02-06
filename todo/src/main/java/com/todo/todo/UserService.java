package com.todo.todo;

import com.todo.todo.User;
import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> getAllUsers();
    //User updateUser(User user, Integer id);
}
