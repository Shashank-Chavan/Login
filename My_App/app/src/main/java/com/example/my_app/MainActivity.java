package com.example.my_app;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupviewbutton();
        setupviewgroupbutton();
        setupLogoutbutton();
    }
    private void setupviewbutton(){
        final Button T = findViewById(R.id.views_button);
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,view_activity.class);
                startActivity(intent);
            }
        });
    }
    private void setupviewgroupbutton(){
        final Button T = findViewById(R.id.viewgroup_button);
        T.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ViewGroup.class);
                startActivity(intent);
            }
        });
    }
    private void setupLogoutbutton(){
        final Button B = findViewById(R.id.Logout_button);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,LoginPage.class));
            }
        });
    }
        
}