package com.example.unicorniofeliz;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText)findViewById(R.id.txt_num1);
        et2 = (EditText)findViewById(R.id.txt_num2);
        tv1 = (TextView)findViewById(R.id.text_resultado);

    }



    //este metodo realiza la suma
    public void Sumar(View view){
        String valor1 = et1.getText().toString();
        String valor2 = et2.getText().toString();

        int num1 = Integer.parseInt(valor1);
        int num2 = Integer.parseInt(valor2);

        int suma = num1 + num2;

        String result = String.valueOf(suma);

        tv1.setText(result);


    }
    public void Restar(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        int resta = num1 - num2;

        String result = String.valueOf(resta);
        tv1.setText(result);

    }
    public void Multi(View view){
        int num1 = Integer.parseInt(et1.getText().toString());
        int num2 = Integer.parseInt(et2.getText().toString());

        int multi = num1 * num2;

        String result = String.valueOf(multi);
        tv1.setText(result);
    }
    public void Div(View view){
        float num1 = Float.parseFloat(et1.getText().toString());
        float num2 = Float.parseFloat(et2.getText().toString());

        float div = num1 / num2;

        String result = String.valueOf(div);
        tv1.setText(result);

    }

}
