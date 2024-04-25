package com.example.testdocker;

import com.example.testdocker.models.User;
import com.example.testdocker.repositories.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestDockerApplication implements CommandLineRunner {

    @Autowired
    private Repository repository;

    public static void main(String[] args) {
        SpringApplication.run(TestDockerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        User user = User.builder()
                .id(0L)
                .name("Alex")
                .age(23)
                .build();
        repository.save(user);
    }
}
