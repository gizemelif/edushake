package com.codeshake.edushake.dao;

import com.codeshake.edushake.model.Parent;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ParentDao {
    int insertParent(Parent parent);

    List<Parent> selectAllParents();

    Optional<Parent> selectParentById(UUID id);

    Parent selectParentDetailsById(UUID id);
}
