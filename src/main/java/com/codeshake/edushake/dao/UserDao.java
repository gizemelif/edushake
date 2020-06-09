package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.User;

import java.util.List;
import java.util.Optional;

public interface UserDao {

    int insertUser(User user);

    List<User> selectAllUsers();

    Optional<User> selectUserById(String id);
}
