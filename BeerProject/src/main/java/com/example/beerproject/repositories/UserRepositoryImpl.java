package com.example.beerproject.repositories;

import com.example.beerproject.exceptions.EntityNotFoundExceptions;
import com.example.beerproject.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private List<User> users;

    public UserRepositoryImpl() {
        users = new ArrayList<>();
        users.add(new User("petar", "petar@gmail.com", true));
        users.add(new User("ivan", "ivan@gmail.com", false));
    }

    @Override
    public List<User> get() {
        return users;
    }

    @Override
    public User get(String username) {
        return users.stream()
                .filter(u -> u.getUsername().equalsIgnoreCase(username))
                .findFirst()
                .orElseThrow(() -> new EntityNotFoundExceptions("User", "username", username));
    }

}
