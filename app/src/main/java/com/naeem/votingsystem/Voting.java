package com.naeem.votingsystem;

public class Voting {
    private String name;
    private String designation;
    private String description;
    private int image;

    public Voting(String s, String matt_crisara, String s1, String s2, int image3) {


    }

    public Voting(String name, String designation, String description, int image) {
        this.name = name;
        this.designation = designation;
        this.description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}



