package com.rico.pacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calcula extends AppCompatActivity implements View.OnClickListener {

    EditText num1,num2 ;
    Button btnSuma,btnResta,btnMultiplicacion,btnDivi;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcula);

        num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);

        btnSuma=(Button) findViewById(R.id.btnSuma);
        btnResta=findViewById(R.id.btnResta);
        btnMultiplicacion=findViewById(R.id.btnMultiplicacion);
        btnDivi=findViewById(R.id.btnDivi);
        result=findViewById(R.id.result);

        btnSuma.setOnClickListener(this::onClick);
        btnResta.setOnClickListener(this::onClick);
        btnMultiplicacion.setOnClickListener(this::onClick);
        btnDivi.setOnClickListener(this::onClick);

    }

    @Override
    public void onClick(View v) {
        double entero1 = Double.parseDouble(num1.getText().toString());
        double entero2 = Double.parseDouble(num2.getText().toString());

        switch (v.getId()){
            case R.id.btnSuma:
            result.setText(""+ (entero1+entero2));
            break;
            case R.id.btnResta:
                result.setText(""+(entero1-entero2));
                break;
            case R.id.btnMultiplicacion:
                result.setText(""+(entero1*entero2));
                break;
            case R.id.btnDivi: result.setText(""+(entero1/entero2));
                break;
        }

    }
}