package com.cs.user.repositories;

import com.cs.user.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
 //   Optional<Object> delete(String userId);
}
