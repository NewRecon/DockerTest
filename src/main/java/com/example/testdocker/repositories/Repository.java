package com.example.testdocker.repositories;

import com.example.testdocker.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<User, Long> {
}
