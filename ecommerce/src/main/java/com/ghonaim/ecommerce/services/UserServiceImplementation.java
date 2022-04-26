package com.ghonaim.ecommerce.services;

import com.ghonaim.ecommerce.models.User;
import com.ghonaim.ecommerce.repos.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImplementation implements UserService{
    private final UserRepo userRepo;
    @Override
    public User saveUser(User user) {
        log.info("Saving user {} to database", user.getUsername());
        userRepo.save(user);
        return user;
    }

    @Override
    public User getUser(String username) {
        log.info("Getting user {} from database", username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        log.info("Getting users from database");
        return userRepo.findAll();
    }
}
