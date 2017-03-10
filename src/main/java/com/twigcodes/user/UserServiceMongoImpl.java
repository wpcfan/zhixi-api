package com.twigcodes.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by wangpeng on 2017/3/3.
 */
@Service
public class UserServiceMongoImpl implements UserService {
    private final UserRepository repository;

    @Autowired
    public UserServiceMongoImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public User addUser(User user) {
        return repository.insert(user);
    }

    @Override
    public User deleteUser(String id) {
        User deletedUser = repository.findOne(id);
        repository.delete(id);
        return deletedUser;
    }

    @Override
    public List<User> findAll() {
        return repository.findAll();
    }

    @Override
    public User findById(String id) {
        return repository.findOne(id);
    }

    @Override
    public User update(User user) {
        return repository.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }
}
