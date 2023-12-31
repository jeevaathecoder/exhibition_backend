package com.onlineexhibition.backend.dtos;


import com.onlineexhibition.backend.entity.User;

public class UserLoginDto {

    private User user;
    private String jwt;

    public UserLoginDto() {
        super();
    }

    public UserLoginDto(User user, String jwt) {
        this.user = user;
        this.jwt = jwt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getJwt() {
        return jwt;
    }

    public void setJwt(String jwt) {
        this.jwt = jwt;
    }
}
