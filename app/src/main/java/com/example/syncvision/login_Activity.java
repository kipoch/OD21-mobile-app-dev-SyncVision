package com.example.syncvision;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class login_Activity extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        tv = findViewById(R.id.textView6);

        tv.setOnClickListener(v -> startActivity(new Intent(login_Activity.this,signUpActivity.class)));
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