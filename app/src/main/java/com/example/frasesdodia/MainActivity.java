package com.example.frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {
        String[] frases = {
                "frase 1",
                "frase 2",
                "frase 3",
                "frase 4"
        };

        int random = new Random().nextInt(4);

        TextView tvFrase = findViewById(R.id.tv_frase);

        tvFrase.setText(frases[random]);
    }
}
