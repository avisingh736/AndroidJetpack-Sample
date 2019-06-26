package com.devspot.androidjetpackexample;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import com.devspot.androidjetpackexample.databinding.ActivityMainBinding;
import com.devspot.androidjetpackexample.models.Profile;
import com.devspot.androidjetpackexample.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        //binding.setProfile(getProfile());

        MainViewModel mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        binding.setProfile(mainViewModel.getProfile());

    }

    private Profile getProfile() {
        return new Profile("mDevSpot","mdevspot@gmail.com","8871608443","https://www.mdevspot.com/profile/deep.jpg","25");
    }
}
