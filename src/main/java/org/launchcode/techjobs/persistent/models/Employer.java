package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    //    Fields

    @NotBlank
    @Size(min = 2, max = 60)
    private String location;

    //    Constructors

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    //    Getter and setter

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
