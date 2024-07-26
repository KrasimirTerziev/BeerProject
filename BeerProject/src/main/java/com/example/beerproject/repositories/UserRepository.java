package com.example.beerproject.repositories;

import com.example.beerproject.models.User;

import java.util.List;

public interface UserRepository {
    List<User> get();

    User get(String username);

}
