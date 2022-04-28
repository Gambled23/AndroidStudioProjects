package com.example.appradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private TextView tv1;
    private RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.txtValor1); //Asignar al objeto et1 el valor que guarda el editText grafico
        et2 = (EditText) findViewById(R.id.txtValor2);
        tv1 = (TextView) findViewById(R.id.twResultado);
        rb1 = (RadioButton) findViewById(R.id.rbSumar);
        rb2 = (RadioButton) findViewById(R.id.rbRestar);
        rb3 = (RadioButton) findViewById(R.id.rbMultiplicar);
        rb4 = (RadioButton) findViewById(R.id.rbDividir);
    }

    //Metodo para el boton calcular
    public  void calcular(View view ) {
    String valor1Str = et1.getText().toString();
    String valor2Str = et2.getText().toString();

    int valor1Int = Integer.parseInt(valor1Str);
    int valor2Int = Integer.parseInt(valor2Str);

    if (rb1.isChecked()) {
        int suma = valor1Int + valor2Int;
        String resultado = String.valueOf(suma); //Convertir el int a string para poder mostrarlo en el text view
        tv1.setText(resultado);
        } else if (rb2.isChecked()){
        int resta = valor1Int - valor2Int;
        String resultado = String.valueOf(resta);
        tv1.setText(resultado);
        } else if (rb3.isChecked()){
        int multiplicacion = valor1Int * valor2Int;
        String resultado = String.valueOf(multiplicacion);
        tv1.setText(resultado);
        } else if (rb4.isChecked()){
            if (valor2Int != 0){
                int division = valor1Int / valor2Int;
                String resultado = String.valueOf(division);
                tv1.setText(resultado);
            } else{
                Toast.makeText(this,"El segundo valor debe de ser diferente a 0", Toast.LENGTH_LONG).show();
            }
        }
    }
}