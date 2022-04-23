package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
 TextView txthello;
 private String ACC_VARIABLE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        txthello = (TextView) findViewById(R.id.text_accvar);

        Bundle extras = getIntent().getExtras();
        ACC_VARIABLE = extras.getString("varFromMain");
        txthello.setText("Hallo, "+ ACC_VARIABLE+ "!");
    }
}