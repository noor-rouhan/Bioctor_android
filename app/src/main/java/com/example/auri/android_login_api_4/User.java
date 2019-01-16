package com.example.auri.android_login_api_4;


public class User {

    //public String username;
    public String phone;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String phone) {
        //this.username = username;
        this.phone = phone;
    }




}
