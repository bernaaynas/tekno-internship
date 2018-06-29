package com.example.berna.teknokentmobil;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");

        Toast.makeText(this, "Welcome "+ username, Toast.LENGTH_SHORT).show();


    }
}