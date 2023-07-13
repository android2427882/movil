package com.example.bancoproyectos;

public class Login {
    User_Login user;
    private String access_token;
    private String otro ;

    public User_Login getUser() {
        return user;
    }

    public void setUser(User_Login user) {
        this.user = user;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getOtro() {
        return otro;
    }

    public void setOtro(String otro) {
        this.otro = otro;
    }
}

