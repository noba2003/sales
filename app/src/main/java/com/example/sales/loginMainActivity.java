package com.example.sales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class loginMainActivity extends AppCompatActivity {
EditText passwoerd,email;
Button loginGoogle,loginTwitter,loginFacebook,btnLogin,btnSignOut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_main);
        passwoerd=findViewById(R.id.txt_password);
        email=findViewById(R.id.login_email);
        loginGoogle=findViewById(R.id.login_google);
        loginTwitter=findViewById(R.id.login_twitter);
        loginFacebook=findViewById(R.id.login_facbook);
        btnLogin=findViewById(R.id.login_login);
        btnSignOut=findViewById(R.id.login_signup);



    }
}