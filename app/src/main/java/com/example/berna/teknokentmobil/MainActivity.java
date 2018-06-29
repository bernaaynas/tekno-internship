package com.example.berna.teknokentmobil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static String usernameString = "admin";
    static String passwordString = "123";

    EditText username;
    EditText password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.editusername);
        password = (EditText) findViewById(R.id.editpassword);
        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getusername = username.getText().toString();
                String getpassword = password.getText().toString();
                if (usernameString.equals(getusername) && passwordString.equals(getpassword)) {
                    Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);

                    myIntent.putExtra("username", getusername);
                    MainActivity.this.startActivity(myIntent);
                } else {
                    Toast.makeText(MainActivity.this, "Kullanıcı adı veya şifre yanlış", Toast.LENGTH_SHORT).show();
                }


            }
        });

        /*login.setOnClickListener(new View.OnClickListener().OnClickListener() {
            @Override
            public void onClick(View View) {


                String getusername = username.getText().toString();
                String getpassword = password.getText().toString();


                if( usernameString.equals(getusername) && passwordString.equals(getpassword) )
                {
                    //Yeni activity'e gecis
                    Intent myIntent = new Intent(MainActivity.this, UserPanel.class);

                    myIntent.putExtra("username", getusername);
                    MainActivity.this.startActivity(myIntent);

                }

                else
                {
                    Toast.makeText(MainActivity.this, "Kullanıcı adı veya şifre yanlış", Toast.LENGTH_SHORT).show();

    }*/
    }

}