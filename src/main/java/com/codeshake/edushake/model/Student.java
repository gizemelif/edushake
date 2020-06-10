package com.codeshake.edushake.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class Student {
    private UUID id;
    @NotBlank
    private String name;
    private String email;
    private Parent parentId;

    public Student(@JsonProperty("id") UUID id,
                   @JsonProperty("name") String name,
                   @JsonProperty("email") String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Parent getParentId() {
        return parentId;
    }

    public void setParentId(Parent parentId) {
        this.parentId = parentId;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }
}
