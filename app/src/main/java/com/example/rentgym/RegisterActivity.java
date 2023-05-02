package com.example.rentgym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    EditText nameText, emailText, passwordText, passwordAgainText;
    TextView textToLogin;
    Button btnRegister;
    private final String CREDENTIAL_SHARED_PREF = "our_shared_pref";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameText = (EditText) findViewById(R.id.edit_text_name);
        emailText = (EditText) findViewById(R.id.edit_text_email);
        passwordText = (EditText) findViewById(R.id.edit_text_password);
        passwordAgainText = (EditText) findViewById(R.id.edit_text_confirm_password);
        btnRegister = (Button) findViewById(R.id.button_register);
        textToLogin = (TextView) findViewById(R.id.toLoginPage);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameText.getText().toString();
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();
                String passwordAgain = passwordAgainText.getText().toString();

                if (password != null && passwordAgain != null && password.equalsIgnoreCase(passwordAgain)) {
                    SharedPreferences credentials = getSharedPreferences(CREDENTIAL_SHARED_PREF, Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor = credentials.edit();
                    editor.putString("Password", password);
                    editor.putString("Email", email);
                    editor.commit();

                    startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                    finish();

                }

            }
        });

        textToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(RegisterActivity.this,LoginActivity.class));
                finish();
            }
        });

    }
}