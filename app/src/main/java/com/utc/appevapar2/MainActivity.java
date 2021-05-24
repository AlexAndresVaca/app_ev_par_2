package com.utc.appevapar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // Buscar
    public void buscar(View vista)
    {
        //Creando un Intent para invocar a la ventana de Registro
        Intent pantallaBuscar = new Intent(getApplicationContext(), BuscadorActivity.class);
        //Iniciando la pantalla de registro
        startActivity(pantallaBuscar);
    }
}