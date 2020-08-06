package com.example.activitylerarasiverialma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    String kAdi,kSifre,kCinsiyet;
    TextView txtAdi,txtSoyadi,txtCinsiyeti;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tanimla();
        al();
    }

    private void tanimla() {
        txtAdi = findViewById(R.id.txtAd);
        txtSoyadi = findViewById(R.id.txtSoyad);
        txtCinsiyeti = findViewById(R.id.txtCinsiyet);
    }

    private void al(){
        Bundle intent = getIntent().getExtras();
        kAdi = intent.getString("kullaniciAdi");
        kSifre = intent.getString("kullaniciSifre");
        kCinsiyet = intent.getString("kullaniciCinsiyet");

        txtAdi.setText(txtAdi.getText() + " " + kAdi);
        txtSoyadi.setText(txtSoyadi.getText()+ " "+kSifre);
        txtCinsiyeti.setText(txtCinsiyeti.getText()+ " "+kCinsiyet);
    }

}