package com.example.miapp2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private EditText et3;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt1); //Asigna a et1 el ediText1
        et2 = (EditText)findViewById(R.id.txt2);
        et3 = (EditText)findViewById(R.id.txt3);
        tv1 = (TextView)findViewById(R.id.tvEstatus);
    }

    public void estatus (View view) {
        String cal1_string = et1.getText().toString();
        String cal2_string = et2.getText().toString();
        String cal3_string = et3.getText().toString();

        int cal1_int = Integer.parseInt(cal1_string);
        int cal2_int = Integer.parseInt(cal2_string);
        int cal3_int = Integer.parseInt(cal3_string);
        int promedio = (cal1_int + cal2_int + cal3_int)/3;
        if (promedio >= 6) {
            tv1.setText("Estatus aprobado con " + promedio);
        }
        else{
            tv1.setText("Estatus reprobado con " + promedio);
        }
    }
}