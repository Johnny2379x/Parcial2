package com.rico.pacial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ed1,ed2;
    private Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1 = (EditText) findViewById(R.id.textUser);
        ed2 = (EditText) findViewById(R.id.textPassword);
        bt1 = (Button)   findViewById(R.id.buttonLogin);
    }

    public void validar(View view){
        if(ed1.getText().toString().equals("untels") && ed2.getText().toString().equals("untels12345")){
            Intent intent = new Intent(getApplicationContext(), central.class);
            startActivity(intent);
        }else{
            Toast.makeText(this,"ingrese más de 8 caracteres", Toast.LENGTH_LONG).show();
        }
    }





}

