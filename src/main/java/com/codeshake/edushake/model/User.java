package com.codeshake.edushake.model;

import java.util.UUID;

public class User {
    private UUID id;
    private String name;
    private String email;
    private String intergalacticFederationIdentification;
    private String role;

    public User(){}

    public User(UUID id, String name, String email, String intergalacticFederationIdentification, String role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.intergalacticFederationIdentification = intergalacticFederationIdentification;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIntergalacticFederationIdentification() {
        return intergalacticFederationIdentification;
    }

    public void setIntergalacticFederationIdentification(String intergalacticFederationIdentification) {
        this.intergalacticFederationIdentification = intergalacticFederationIdentification;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
