package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Parent;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ParentDataAccessService implements ParentDao {
    private static List<Parent> DB = new ArrayList<>();

    @Override
    public int insertParent(Parent parent) {
        DB.add(new Parent(parent.getId(), parent.getName(), parent.getEmail()));
        return 1;
    }

    @Override
    public List<Parent> selectAllParents() {
        return DB;
    }

    @Override
    public Optional<Parent> selectParentById(String id) {
        return DB.stream()
                .filter(parent -> parent.getId().equals(id))
                .findFirst();
    }
}