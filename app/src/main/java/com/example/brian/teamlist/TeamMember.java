package com.example.brian.teamlist;

public class TeamMember {
    private String name;
    private String role;

    private int imgId;

    public TeamMember(String name, String role, int imgId) {
        this.name = name;
        this.role = role;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }


}
