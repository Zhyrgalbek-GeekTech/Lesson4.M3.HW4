package com.geektech.lesson4m3hw4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.geektech.lesson4m3hw4.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    public static Boolean isSecondFragment = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        if (savedInstanceState == null){
            getSupportFragmentManager().beginTransaction().add(R.id.container, new MainFragment()).commit();
        }

    }

    @Override
    public void onBackPressed() {
        if (isSecondFragment){
            super.onBackPressed();
        }else{
            getSupportFragmentManager().beginTransaction().replace(R.id.container, new MainFragment()).commit();
        }

    }
}