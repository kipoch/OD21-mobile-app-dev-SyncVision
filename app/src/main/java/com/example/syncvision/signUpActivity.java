package com.example.syncvision;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class signUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sign_up);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SignUpActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("signUPActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("signUpActivity", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SignUpActivity", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("signUpActivity", "onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("signUpActivity", "onRestart");
    }
}