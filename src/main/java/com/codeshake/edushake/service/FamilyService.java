package com.codeshake.edushake.service;

import com.codeshake.edushake.dao.ParentDao;
import com.codeshake.edushake.model.Parent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {

    private final ParentDao parentDao;

    @Autowired
    public FamilyService(@Qualifier("fakeDao") ParentDao parentDao) {
        this.parentDao = parentDao;
    }

    public int addParent(Parent parent) {
        return parentDao.insertParent(parent);
    }

    public List<Parent> getAllParents() {
        return parentDao.selectAllParents();
    }

    public Optional<Parent> getParentById(String id) {
        return parentDao.selectParentById(id);
    }

}
