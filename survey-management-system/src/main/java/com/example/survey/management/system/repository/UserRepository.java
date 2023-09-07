package com.example.survey.management.system.repository;

import com.example.survey.management.system.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findFirstByUserEmail(String newEmail);

    User findByUserEmail(String userEmail);
}
