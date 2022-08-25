package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page2);
        setLogin();
    }
    private void setLogin(){
        EditText username = (EditText)findViewById(R.id.editTextTextPersonName);
        EditText password = (EditText)findViewById(R.id.editTextTextPassword);
        final Button B = findViewById(R.id.button);


            B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = 0;
                if(username.getText().toString().equals("admin")&&password.getText().toString().equals("admin123")){
                startActivity(new Intent(LoginPage.this,MainActivity.class));
                    val = 1;
                    getIntent().putExtra("key",val);
                    finish();
            }

                finish();
                getIntent().putExtra("key",val);
            }
        });
    }

}