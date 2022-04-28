package com.example.memeaplicacion;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et1; //Para el primer campo de texto
    private EditText et2; //Para el 2do campo de texto
    private TextView tv1; //Para el textview (Resultado)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        //Asignar a et1 la parte grafica, pues la grafica es un textview, y et1 es edittext
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.txt_resultado);
    }

    //Metodo para sumar (Se ejecuta cuando lo indicamos en la parte grafica)
    public void sumarNumeros(View view)
    {
        String valor1 = et1.getText().toString(); //Guarda en un string el valor de et1
        String valor2 = et2.getText().toString(); //Guarda en string el valor de et2
        int num1 = Integer.parseInt(valor1); //Convierte el string a int
        int num2 = Integer.parseInt(valor2); //Convierte el string a int
        int resultado = num1 + num2;
        //String valorFinal = resultado + ""; //Convierte el int a string
        String valorFinal = String.valueOf(resultado); //Forma mas profecional de cambiar de int a string
        tv1.setText(valorFinal); //Pasa a la parte grafica el valor calculado
    }
}