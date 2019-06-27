package com.devspot.androidjetpackexample.viewmodels;


import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.devspot.androidjetpackexample.models.Profile;

public class MainViewModel extends ViewModel {
    private Profile profile;

    private MutableLiveData<Profile> mProfile;

    /**
     * This method is to get profile
     * @return Profile
     * Not observable
     * */
    public Profile getProfile() {
        if(profile == null) {
            profile = new Profile("mDevSpot","mdevspot@gmail.com","8871608443","https://www.mdevspot.com/profile/deep.jpg","25");
        }
        return profile;
    }


    /**
     * This method is to get livedata profile
     * @return LiveData
     * Not observable
     * */
    public MutableLiveData<Profile> getLiveProfile() {
        if(mProfile == null) {
            mProfile = new MutableLiveData<>();
            mProfile.setValue(new Profile("mDevSpot","mdevspot@gmail.com","8871608443","https://www.mdevspot.com/profile/deep.jpg","25"));
        }
        return mProfile;
    }
}
