package com.example.temptransfer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void button_Click(View view) {
        EditText editNumber = (EditText) findViewById(R.id.editNumber);
        TextView textShow = (TextView) findViewById(R.id.textShow);

        double degree_C = Double.parseDouble(editNumber.getText().toString());
        double degree_F = (degree_C * 9.0) / 5.0 + 32.0;
        textShow.setText(String.format("華氏溫度 : %.2f", degree_F));
    }
}