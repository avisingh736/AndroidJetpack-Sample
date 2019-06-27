package com.devspot.androidjetpackexample;

import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.devspot.androidjetpackexample.databinding.ActivityMainBinding;
import com.devspot.androidjetpackexample.models.Profile;
import com.devspot.androidjetpackexample.viewmodels.MainViewModel;

public class MainActivity extends AppCompatActivity {

    private Handler mThreadHandler;
    private Runnable mProfileManager1;
    private Runnable mProfileManager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        /**
         * Here we set Profile object to binding
         * */
        //binding.setProfile(getProfile());


        final MainViewModel mainViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        /**
         * Here we set Profile object to binding from ViewHolder
         * */
        //binding.setProfile(mainViewModel.getProfile());


        /**
         * Here we creating and an observer and listening it
         * */
        final Observer<Profile> mProfileObserver = new Observer<Profile>() {
            @Override
            public void onChanged(Profile profile) {
                binding.setProfile(profile);
            }
        };
        mainViewModel.getLiveProfile().observe(this,mProfileObserver);

        mThreadHandler = new Handler();
        mProfileManager1 = new Runnable() {
            @Override
            public void run() {
                mainViewModel.getLiveProfile().setValue(new Profile("mDevSpot","mdevspot@gmail.com","8871608443","https://www.mdevspot.com/profile/mdevspot.jpg","25"));
                mThreadHandler.postDelayed(mProfileManager2,1000);
            }
        };

        mProfileManager2 = new Runnable() {
            @Override
            public void run() {
                mainViewModel.getLiveProfile().setValue(new Profile("Avinash Kumar","avisingh736@gmail.com","8871608443","https://www.mdevspot.com/profile/avinash.jpg","25"));
                mThreadHandler.postDelayed(mProfileManager1,1000);
            }
        };

        mThreadHandler.post(mProfileManager1);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mThreadHandler.removeCallbacks(mProfileManager1);
        mThreadHandler.removeCallbacks(mProfileManager2);
    }

    private Profile getProfile() {
        return new Profile("mDevSpot","mdevspot@gmail.com","8871608443","https://www.mdevspot.com/profile/deep.jpg","25");
    }
}
