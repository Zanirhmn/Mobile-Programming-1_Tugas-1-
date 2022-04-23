package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnPindah;
    EditText nik;
    EditText Nama;
    EditText Tempat_Lahir;
    EditText Tanggal_Lahir;
    EditText Alamat;
    EditText Jenis_Kelamin;
    EditText Pekerjaan;
    EditText Status_Perkawinan;

    String _nik;
    String _Nama;
    String _Tempat_Lahir;
    String _Tanggal_Lahir;
    String _Alamat;
    String _Jenis_Kelamin;
    String _Pekerjaan;
    String _Status_Perkawinan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPindah = findViewById(R.id.buttonPindah);
        nik = findViewById(R.id.nik);
        Nama = findViewById(R.id.Nama);
        Tempat_Lahir = findViewById(R.id.Tempat_Lahir);
        Tanggal_Lahir = findViewById(R.id.Tanggal_Lahir);
        Alamat = findViewById(R.id.Alamat);
        Jenis_Kelamin = findViewById(R.id.Jenis_Kelamin);
        Pekerjaan = findViewById(R.id.Pekerjaan);
        Status_Perkawinan = findViewById(R.id.Status_Perkawinan);

        btnPindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nik_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Nama_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Tempat_Lahir_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Tanggal_Lahir_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Alamat_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Jenis_Kelamin_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Pekerjaan_ = new Intent(MainActivity.this, SecondActivity.class);
                Intent Status_Perkawinana_ = new Intent(MainActivity.this, SecondActivity.class);

                _nik = nik.getText().toString();
                _Nama = Nama.getText().toString();
                _Tempat_Lahir = Tempat_Lahir.getText().toString();
                _Tanggal_Lahir = Tanggal_Lahir.getText().toString();
                _Alamat = Alamat.getText().toString();
                _Jenis_Kelamin = Jenis_Kelamin.getText().toString();
                _Pekerjaan = Pekerjaan.getText().toString();
                _Status_Perkawinan = Status_Perkawinan.getText().toString();
                nik_.putExtra("nik", _nik);
                Nama_.putExtra("Nama", _Nama);
                Tempat_Lahir_.putExtra("Tempat_Lahir", _Tempat_Lahir);
                Tanggal_Lahir_.putExtra("Tanggal_Lahir", _Tanggal_Lahir);
                Alamat_.putExtra("Alamat", _Alamat);
                Jenis_Kelamin_.putExtra("Jenis_Kelamin", _Jenis_Kelamin);
                Pekerjaan_.putExtra("Pekerjaan", _Pekerjaan);
                Status_Perkawinana_.putExtra("Status_Perkawinan", _Status_Perkawinan);
                startActivity(nik_);
                startActivity(Nama_);
                startActivity(Nama_);
                startActivity(Nama_);
                startActivity(Nama_);
                startActivity(Nama_);
                startActivity(Nama_);
                startActivity(Nama_);

            }
        });
    }
}