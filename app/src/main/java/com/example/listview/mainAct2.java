package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class mainAct2 extends AppCompatActivity {
    TextView disp;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_act2);

        disp = findViewById(R.id.textView2);
        String str = getIntent().getStringExtra("name");
        disp.setText(str);
    }
}