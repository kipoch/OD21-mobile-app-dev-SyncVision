package com.example.syncvision;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;


public class login_Activity extends AppCompatActivity {

    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private Switch switcher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        SharedPreferences sharedPreferences = getSharedPreferences("ThemePref", MODE_PRIVATE);
        boolean isDarkMode = sharedPreferences.getBoolean("isDarkMode", false);
        if (isDarkMode) {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
        } else {
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        }

        setContentView(R.layout.activity_login);


       switcher= findViewById(R.id.switcher);
       switcher.setChecked(isDarkMode);

        switcher.setOnCheckedChangeListener((buttonView, isChecked) -> {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.putBoolean("isDarkMode", isChecked);
            editor.apply();

            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });

        TextView signUpTextView = findViewById(R.id.tosignUp);
        signUpTextView.setOnClickListener(v -> {
            Intent intent = new Intent(login_Activity.this, signUpActivity.class);
            startActivity(intent);

});
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Login_Activity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Login_Activity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Login_Activity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Login_Activity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Login_Activity", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Login_Activity", "onRestart");
    }
}