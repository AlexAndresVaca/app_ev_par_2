package com.utc.appevapar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText buscadorMain;
    private CheckBox checkBoxMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buscadorMain = (EditText) findViewById(R.id.txtBuscadorMain);
        checkBoxMain = (CheckBox) findViewById(R.id.checkBoxMain);

        // Inicializamos SharePreferences

        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        buscadorMain.setText(preferences.getString("ciudad", ""));


        // Comprobar si tiene datos almacenados para mantener activado el checkbox caso contrario desactivar
        if (buscadorMain.getText().toString().isEmpty()) {
            this.checkBoxMain.setChecked(false);
        } else {
            this.checkBoxMain.setChecked(true);
        }

    }

    // Buscar
    public void buscar(View vista) {
        //Guardar SharePreferences
        SharedPreferences preferencias = getSharedPreferences("datos", Context.MODE_MULTI_PROCESS);
        SharedPreferences.Editor editor = preferencias.edit();
        // Almacenamos si checkbox eactivado caso contrario no
        if (checkBoxMain.isChecked()) {
            // Colocar valores
            editor.putString("ciudad", buscadorMain.getText().toString());
        } else {
            // Borrar valores
            editor.putString("ciudad", "");
        }
        // Confirmar cambios del share prerences
        editor.commit();

        //Creando un Intent para invocar a la ventana de Registro
        Intent pantallaBuscar = new Intent(getApplicationContext(), BuscadorActivity.class);
        //Iniciando la pantalla de registro
        startActivity(pantallaBuscar);
    }
}