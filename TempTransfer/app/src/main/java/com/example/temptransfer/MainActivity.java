package com.example.temptransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(){
        EditText editTextNumber = (EditText) findViewById(R.id.editTextNumber);
        TextView textView4 = (TextView) findViewById(R.id.textView4);

        double degree_C = Double.parseDouble(editTextNumber.getText().toString());
        double degree_F = (degree_C * 9.0) / 5.0 + 32.0;
        textView4.setText("華氏溫度 : " + degree_F);
    }
}