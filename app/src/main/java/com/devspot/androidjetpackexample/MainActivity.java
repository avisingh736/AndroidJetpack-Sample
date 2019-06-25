package com.devspot.androidjetpackexample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.devspot.androidjetpackexample.databinding.ActivityMainBinding;
import com.devspot.androidjetpackexample.models.Profile;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setProfile(getProfile());

    }

    private Profile getProfile() {
        Profile profile = new Profile();
        profile.setUserName("Deep Raj");
        profile.setEmail("mdevspot@gmail.com");
        profile.setMobileNo("8871608443");
        profile.setAge("25");
        profile.setMaritalStatus(false);
        profile.setProfileImage("https://www.mdevspot.com/profile/deep.jpg");

        return profile;
    }
}
