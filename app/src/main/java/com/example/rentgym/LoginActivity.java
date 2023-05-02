package com.example.rentgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText loginText, passwordText;
    Button btnLogin;
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginText = (EditText) findViewById(R.id.login);
        passwordText = (EditText) findViewById(R.id.password);

        btnLogin = (Button) findViewById(R.id.buttonLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                String strEmail = credentials.getString("Email", null);
                String strPassword = credentials.getString("Password", null);

                String email = loginText.getText().toString();
                String password = passwordText.getText().toString();

                if (strEmail != null && email != null && strEmail.equalsIgnoreCase(email)) {
                    if (strPassword != null && password != null && strPassword.equalsIgnoreCase(password)) {
                        Toast.makeText(LoginActivity.this, "Welcome to the GYM!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), ProfileActivity.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}