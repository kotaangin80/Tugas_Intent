package com.example.tugas_intent;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Intent1 =
                findViewById(R.id.btn_ayo_jaga_diri);
        Intent1.setOnClickListener(this);

        Button Intent2 =
                findViewById(R.id.btn_cuci_tangan);
        Intent2.setOnClickListener(this);

        Button Intent3 =
                findViewById(R.id.btn_pakai_masker);
        Intent3.setOnClickListener(this);

        Button Intent4 =
                findViewById(R.id.btn_pola_sehat);
        Intent4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_ayo_jaga_diri:
                Intent Intent1 = new Intent(MainActivity.this, intent1.class);
                startActivity(Intent1);
                break;

            case R.id.btn_cuci_tangan:
                Intent Intent2 = new Intent(MainActivity.this, Intent2.class);
                startActivity(Intent2);
                break;

            case R.id.btn_pakai_masker:
                Intent Intent3 = new Intent(MainActivity.this, Intent3.class);
                startActivity(Intent3);
                break;

            case R.id.btn_pola_sehat:
                Intent Intent4 = new Intent(MainActivity.this, Intent4.class);
                startActivity(Intent4);
                break;

        }
    }
}