package com.loginmodule.retrofit.loginretrofit.model;

/**
 * Created by Hemraj on 2/23/2017.
 */

public class ServerRequest {

    private String operation;
    private User user;

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setUser(User user) {
        this.user = user;
    }
}