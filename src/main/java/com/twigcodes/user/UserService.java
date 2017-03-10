package com.twigcodes.user;

import java.util.List;

public interface UserService {
    User addUser(User user);
    User deleteUser(String id);
    List<User> findAll();
    User findById(String id);
    User update(User user);
    User findByUsername(String username);
}
