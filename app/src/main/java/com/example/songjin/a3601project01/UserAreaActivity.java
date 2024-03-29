package com.example.songjin.a3601project01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class UserAreaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        final EditText etUsername = (EditText)findViewById(R.id.etShowUserName);
        final EditText etAge = (EditText)findViewById(R.id.etShowAge);

        final TextView welcomeMsg = (TextView)findViewById(R.id.tvWelcomeMsg);


        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String username = intent.getStringExtra("username");
        int age  = intent.getIntExtra("age",-1);

        String message = name + "welcome to user area";
        welcomeMsg.setText(message);
        etUsername.setText(username);
        etAge.setText(""+age);

    }
}
