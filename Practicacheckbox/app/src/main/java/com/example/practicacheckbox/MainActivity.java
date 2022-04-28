package com.example.practicacheckbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1, et2;
    private CheckBox chb1, chb2;
    private TextView tw1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.ntxt1);
        et2 = (EditText) findViewById(R.id.ntxt2);
        chb1 = (CheckBox) findViewById(R.id.ch1);
        chb2 = (CheckBox) findViewById(R.id.ch2);
        tw1 = (TextView) findViewById(R.id.twResultado);
    }

    public void calcular(View view)
    {
        String valor1Str = et1.getText().toString();
        String valor2Str = et2.getText().toString();
        int valor1Int = Integer.parseInt(valor1Str);
        int valor2Int = Integer.parseInt(valor2Str);

        String resultado = "";
        if (chb1.isChecked() == true)
        {
            int suma = valor1Int + valor2Int;
            resultado = "La suma es: " + suma + "/";
        }
        if (chb2.isChecked() == true)
        {
            int resta = valor1Int - valor2Int;
            resultado = resultado + "La resta es: " + resta;
        }
        tw1.setText(resultado);
    }
}