package com.ghonaim.ecommerce.repos;

import com.ghonaim.ecommerce.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
