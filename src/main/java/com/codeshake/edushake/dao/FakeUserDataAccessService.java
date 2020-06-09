package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository("fakeDao")
public class FakeUserDataAccessService implements UserDao {

    private static List<User> DB = new ArrayList<>();

    @Override
    public int insertUser(User user) {
        DB.add(new User(user.getId(), user.getName(), user.getEmail(), user.getIntergalacticFederationIdentification(), user.getRole()));
        return 1;
    }

    @Override
    public List<User> selectAllUsers() {
        return DB;
    }

    @Override
    public Optional<User> selectUserById(String id) {
        return DB.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }
}
