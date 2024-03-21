package com.example.ui_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendString(View view) {
        EditText editText = (EditText) findViewById(R.id.editText);
        String string2send = editText.getText().toString();

        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("username", string2send);
        startActivity(intent);
    }
}
