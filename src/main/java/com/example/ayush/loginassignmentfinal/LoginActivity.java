package com.example.ayush.loginassignmentfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.R.attr.data;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final EditText et1 = (EditText) findViewById(R.id.et_email);
        final EditText et2 = (EditText) findViewById(R.id.et_password);
        Button bt1 = (Button) findViewById(R.id.bt_continue);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToHomeScreen();


            }
            void goToHomeScreen(){
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
    });
}}
