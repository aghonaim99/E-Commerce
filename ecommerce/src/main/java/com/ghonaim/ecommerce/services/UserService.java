package com.ghonaim.ecommerce.services;

import com.ghonaim.ecommerce.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    User getUser(String username);
    List<User> getUsers();
}
