package com.example.practicacalificada01;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    public static String NUMBER = "0";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_calculo = (Button)findViewById(R.id.btn_calcular);

        btn_calculo.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                EditText edt_peso = (EditText)findViewById(R.id.txt_peso);
                EditText edt_talla = (EditText)findViewById(R.id.txt_talla);
                double peso = Double.parseDouble(edt_peso.getText().toString());
                double talla = Double.parseDouble(edt_talla.getText().toString());

                double imc_sf = peso / ((talla*talla));
                DecimalFormat df = new DecimalFormat("#.00");
                double imc = Double.parseDouble((df.format(imc_sf)));

                if(edt_peso.equals("") || edt_talla.equals("") )
                {
                    Toast.makeText(getApplicationContext(),"Ambos campos son obligatorios",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent intent = new Intent(getApplicationContext(),ResultadoIMC.class);
                    intent.putExtra(NUMBER,imc);
                    startActivity(intent);
                }

            }
        });
    }
}