package com.pyc.edu.service;

import com.pyc.edu.model.User;
import com.pyc.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    public User login(String username, String password);
}
