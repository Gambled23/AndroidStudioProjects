package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    private Spinner spinnerUno;
    private EditText etUno, etDos;
    private TextView tvUno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUno = (EditText) findViewById(R.id.et1);
        etDos = (EditText) findViewById(R.id.et2);
        tvUno = (TextView) findViewById(R.id.tvResultado);
        spinnerUno = (Spinner) findViewById(R.id.spinner);

        //Hacer que el spinner tenga las 4 opciones del array
        String [] opciones = {"sumar", "restar", "multiplicar", "dividir"};
        ArrayAdapter <String> adapter = new ArrayAdapter <String> (this, android.R.layout.simple_spinner_dropdown_item, opciones );
        spinnerUno.setAdapter(adapter);
    }
    //Metodo del boton
    public  void Calcular(View view)
    {
        String valor1Str = etUno.getText().toString();
        String valor2Str = etDos.getText().toString();

        int valor1Int = Integer.parseInt(valor1Str);
        int valor2Int = Integer.parseInt(valor2Str);

        String seleccion = spinnerUno.getSelectedItem().toString();
        if (seleccion.equals("sumar"))
        {
            int suma = valor1Int + valor2Int;
            String resultado = String.valueOf(suma);
            tvUno.setText(resultado);
        }
        else if (seleccion.equals("restar"))
        {
            int resta = valor1Int - valor2Int;
            String resultado = String.valueOf(resta);
            tvUno.setText(resultado);
        }
        else if (seleccion.equals("multiplicar"))
        {
            int multiplicacion = valor1Int * valor2Int;
            String resultado = String.valueOf(multiplicacion);
            tvUno.setText(resultado);
        }
        else if (seleccion.equals("dividir"))
        {
            if (valor2Int == 0)
            {
                tvUno.setText("El valor dos no puede ser cero");
            }
            else
            {
                int division = valor1Int / valor2Int;
                String resultado = String.valueOf(division);
                tvUno.setText(resultado);
            }
        }
    }
}