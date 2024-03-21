package com.example.ui_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_activity_main);

        TextView textView = (TextView) findViewById(R.id.textView);
        Intent intent = getIntent();
        String outputString = intent.getStringExtra("username") + ", 你好";
        textView.setText(outputString);
    }
}