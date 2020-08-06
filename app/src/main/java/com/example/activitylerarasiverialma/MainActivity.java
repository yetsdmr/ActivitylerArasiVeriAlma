package com.example.activitylerarasiverialma;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    EditText kAdi;
    EditText kSifre;
    RadioGroup radioGroup;
    Button btn;
    String kullaniciAdi,kullaniciSifre,kullaniciCinsiyet;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        tiklaGec();
    }

    private void tanimla() {
        kAdi = findViewById(R.id.editTextKullanici);
        kSifre = findViewById(R.id.editTextSifre);
        radioGroup = findViewById(R.id.rGrupCinsiyet);
        btn = findViewById(R.id.btnGonder);
    }
    private void degerAl(){
       kullaniciAdi = kAdi.getText().toString();
       kullaniciSifre = kSifre.getText().toString();
       kullaniciCinsiyet = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId())).getText().toString();
    }
    private void tiklaGec(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degerAl();
                Intent intent = new Intent(getApplicationContext(),Activity2.class);
                intent.putExtra("kullaniciAdi",kullaniciAdi);
                intent.putExtra("kullaniciSifre",kullaniciSifre);
                intent.putExtra("cinsiyet",kullaniciCinsiyet);
                startActivity(intent);
            }
        });
    }

}