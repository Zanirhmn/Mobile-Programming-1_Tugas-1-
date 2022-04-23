package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    EditText send;
    String dikirim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.buttonPindah);
        send = findViewById(R.id.edit_sendvar);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindah = new Intent(MainActivity.this, SecondActivity.class);
                dikirim = send.getText().toString();
                pindah.putExtra("varFromMain", dikirim);
                startActivity(pindah);
            }
        });
    }
}