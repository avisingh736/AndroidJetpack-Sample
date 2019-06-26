package com.devspot.androidjetpackexample.viewmodels;


import androidx.lifecycle.ViewModel;

import com.devspot.androidjetpackexample.models.Profile;

public class MainViewModel extends ViewModel {
    private Profile profile;
    public MainViewModel() {
        profile = new Profile("mDevSpot","mdevspot@gmail.com","8871608443","https://www.mdevspot.com/profile/deep.jpg","25");
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
