package com.example.practicacalificada01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultadoIMC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_i_m_c);

        double imc = getIntent().getDoubleExtra(MainActivity.NUMBER,0);

        String texto_bajo = getString(R.string.desc_1) + " " + imc + " " + getString(R.string.texto_bajo);

        String texto_normal = getString(R.string.desc_1) + " " + imc + " " + getString(R.string.texto_normal);

        String texto_sobrepeso = getString(R.string.desc_1) + " " + imc + " " + getString(R.string.texto_sobrepeso);

        String texto_obesidad = getString(R.string.desc_1)+ " " + imc + " " +getString(R.string.texto_obesidad);

        if(imc < 18.5)
        {
            TextView txt_saludo = (TextView)findViewById(R.id.txt_resultado);
            txt_saludo.setText(texto_bajo);
        }
        else if(imc >= 18.5 && imc <=24.9)
        {
            TextView txt_saludo = (TextView)findViewById(R.id.txt_resultado);
            txt_saludo.setText(texto_normal);
        }
        else if(imc >= 25 && imc <=29.9)
        {
            TextView txt_saludo = (TextView)findViewById(R.id.txt_resultado);
            txt_saludo.setText(texto_sobrepeso);
        }
        else if(imc >= 30)
        {
            TextView txt_saludo = (TextView)findViewById(R.id.txt_resultado);
            txt_saludo.setText(texto_obesidad);
        }

    }
}