package com.rico.pacial;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class autoridad extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autoridad);
    }//menu para mosrar y ocultar
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menucito,menu);
        return true;
    }

    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
// Detalle de la ejecución según cada opción
        switch (item.getItemId()){
            case R.id.menu1:
                Intent intent = new Intent(this, datosPersonales.class);
                startActivity(intent);
                break;
            case R.id.menu2:
                Intent intent2 = new Intent(this, videin.class);
                startActivity(intent2);
                break;
            case R.id.menu5:
                Intent intent4 = new Intent(this, EscuelaUntels.class);
                startActivity(intent4);
                break;
            case R.id.menu6:
                Intent intent6 = new Intent(this, autoridad.class);
                startActivity(intent6);
                break;

            case R.id.menu7:
                Intent intent7 = new Intent(this, mensaje.class);
                startActivity(intent7);
                break;
            //case R.id.menu3:
            //  Toast.makeText(this, "Cambiar parámetros del Aplicativo",Toast.LENGTH_LONG).show();
            //break;
        }
        return super.onOptionsItemSelected(item);
    }
}