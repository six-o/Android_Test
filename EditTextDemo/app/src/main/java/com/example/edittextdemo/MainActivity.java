package com.example.edittextdemo;

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
    public void button_Click(View view){
        EditText InputText = (EditText) findViewById(R.id.outText);
        TextView textView4 = (TextView) findViewById(R.id.textView4);
        String name = InputText.getText().toString();
        textView4.setText("你的名字是 : " + name);
    }
}