package com.codeshake.edushake.api;

import com.codeshake.edushake.model.Parent;
import com.codeshake.edushake.service.FamilyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("codeshake/family")
@RestController
public class FamilyController {

    private final FamilyService familyService;

    @Autowired
    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }

    @GetMapping(path = "members/{id}")
    public Parent getParentById(@PathVariable("id") String id) {
        return familyService.getParentById(id)
                .orElse(null);
    }
}
