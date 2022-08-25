package com.example.my_app;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class view_activity extends AppCompatActivity {
    TextView textView = new TextView(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        TextView txt = (TextView) findViewById(R.id.button5);
        Typeface typeface = Typeface.createFromAsset(getAssets(), "roboto");
        txt.setTypeface(typeface);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                  textView.setTextColor(Integer.parseInt("0000ff"));
            }

        });
    }
}