package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Parent;

import java.util.List;
import java.util.Optional;

public interface ParentDao {
    int insertParent(Parent parent);

    List<Parent> selectAllParents();

    Optional<Parent> selectParentById(String id);
}
