package com.example.secondactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
 TextView _nik;
    TextView _Nama;
    TextView _Tempat_Lahir;
    TextView _Tanggal_Lahir;
    TextView _Alamat;
    TextView _Jenis_Kelamin;
    TextView _Pekerjaan;
    TextView _Status_Perkawinan;



    private String nik;
    private String Nama;
    private String Tempat_Lahir;
    private String Tanggal_Lahir;
    private String Alamat;
    private String Jenis_Kelamin;
    private String Pekerjaan;
    private String Status_Perkawinan;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        _nik = (TextView) findViewById(R.id.nik);
        _Nama = (TextView) findViewById(R.id.Nama);
        _Tempat_Lahir = (TextView) findViewById(R.id.Tempat_Lahir);
        _Tanggal_Lahir = (TextView) findViewById(R.id.Tanggal_Lahir);
        _Alamat = (TextView) findViewById(R.id.Alamat);
        _Jenis_Kelamin = (TextView) findViewById(R.id.Jenis_Kelamin);
        _Pekerjaan = (TextView) findViewById(R.id.Pekerjaan);
        _Status_Perkawinan = (TextView) findViewById(R.id.Status_Perkawinan);


        Bundle extras = getIntent().getExtras();
        nik = extras.getString("nik");
        Nama = extras.getString("Nama");
        Tempat_Lahir = extras.getString("Tempat_Lahir");
        Tanggal_Lahir = extras.getString("Tanggal_Lahir");
        Alamat = extras.getString("Alamat");
        Jenis_Kelamin = extras.getString("Jenis_Kelamin");
        Pekerjaan = extras.getString("Pekerjaan");
        Status_Perkawinan = extras.getString("Status_Perkawinan");

        _nik.setText("NIK : "+ nik+ "!");
        _Nama.setText("NIK : "+ Nama+ "!");
        _Tempat_Lahir.setText("NIK : "+ Tempat_Lahir+ "!");
        _Tanggal_Lahir.setText("NIK : "+ Tanggal_Lahir+ "!");
        _Alamat.setText("NIK : "+ Alamat+ "!");
        _Jenis_Kelamin.setText("NIK : "+ Jenis_Kelamin+ "!");
        _Pekerjaan.setText("NIK : "+ Pekerjaan+ "!");
        _Status_Perkawinan.setText("NIK : "+ Status_Perkawinan+ "!");

    }
}