package com.dicoding.picodiploma.mysharedpreference;

public class UserModel {

    private String name;
    private String email;
    private int age;
    private String phoneNumber;
    private boolean isLove;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLove(boolean love) {
        isLove = love;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isLove() {
        return isLove;
    }
}
