package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

//    Fields
    private String description;

//    Constructors
    public Skill() {}

//    Getter and setter
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
