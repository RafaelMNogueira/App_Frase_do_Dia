package com.cursoandroid.frasesdodia;

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

    public void gerarNovaFrase (View view) {

        String[] frases = {
                "Mensagem 01",
                "Mensagem 02",
                "Mensagem 03",
                "Mensagem 04",
                "Mensagem 05",
                "Mensagem 06",
                "Mensagem 07",
                "Mensagem 08",
                "Mensagem 09"
        };
        int numero = new Random().nextInt(9);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText( frases[numero] );

    }

}
