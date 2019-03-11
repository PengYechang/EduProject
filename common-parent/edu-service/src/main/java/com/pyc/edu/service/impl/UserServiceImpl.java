package com.pyc.edu.service.impl;

import com.pyc.edu.model.User;
import com.pyc.edu.service.IUserService;
import com.pyc.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }

    @Override
    public User findByUUID(String id) {
        return null;
    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public void deleteByUUID(String id) {

    }

    @Override
    public void update(User user) {

    }

    @Override
    public void insert(User user) {

    }

}
