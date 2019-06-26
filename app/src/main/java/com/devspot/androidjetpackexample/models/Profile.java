package com.devspot.androidjetpackexample.models;

import java.io.Serializable;

public class Profile implements Serializable {
    private String userName;
    private String email;
    private String mobileNo;
    private String profileImage;
    private String age;
    private boolean maritalStatus;

    public Profile(){}

    public Profile(String userName,String email,String mobileNo, String profileImage, String age) {
        this.userName = userName;
        this.email = email;
        this.mobileNo = mobileNo;
        this.profileImage = profileImage;
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public boolean isMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(boolean maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
}
