package com.utc.appevapar2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class BuscadorActivity extends AppCompatActivity {
    //Entrada
    EditText txtBarraBuscador; //Definicion de variable para capturar lo que el usuario va a busccar
    WebView wvResultadosBuscador; //Definicion de variable para mostrar el lugar solicitado por el usuario


    // Prepara un string para recibir los datos del preference

    String ciudad;

    //Proceso 1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscador);
        // Recuperamos datos del share preferences
        SharedPreferences preferences = getSharedPreferences("datos", Context.MODE_PRIVATE);
        // Asignar a la variable el valor del preference
        ciudad = preferences.getString("ciudad", "");

        //Mapeo de elementos
        txtBarraBuscador = (EditText) findViewById(R.id.txtBarraBuscador); //Mapear el elemento txtBarraBuscador
        wvResultadosBuscador = (WebView) findViewById(R.id.wvResultadosBuscador); //Mapear el elemento WebView


    }
    //Proceso 2

    public void buscarSitio(View vista) {
        String lugarIngresado = "https://www.google.com.ec/maps/search/" + this.txtBarraBuscador.getText().toString() + "+" + this.ciudad; //Capturar el valor ingresado por el usuario en el txtBarraBuscador y almacenamos en la variable ingresada lugarIngresado
        wvResultadosBuscador.setWebViewClient(new WebViewClient()); //Creando un navegador nuevo cada ves que el usuario ingrese un sitio a buscar
        wvResultadosBuscador.getSettings().setJavaScriptEnabled(true); //Habilitando JavaScript dentro de las paginas que se esten buscando
        wvResultadosBuscador.getSettings().setDomStorageEnabled(true); //Habilitando todos los elementos del Doom del sitio solicitado
        wvResultadosBuscador.loadUrl(lugarIngresado); //Cargando en el navegador el sitio ingresado por el usuario
        Toast.makeText(getApplicationContext(), "Cargando el sitio, porfavor espere....", Toast.LENGTH_LONG).show(); //Mostrando en pantalla un mensaje de información
    }

    public void buscarSugerencia1(View vista) {
        String lugarIngresado = "https://www.google.com.ec/maps/search/cafeterias+" + this.ciudad; //Capturar el valor ingresado por el usuario en el txtBarraBuscador y almacenamos en la variable ingresada lugarIngresado
        wvResultadosBuscador.setWebViewClient(new WebViewClient()); //Creando un navegador nuevo cada ves que el usuario ingrese un sitio a buscar
        wvResultadosBuscador.getSettings().setJavaScriptEnabled(true); //Habilitando JavaScript dentro de las paginas que se esten buscando
        wvResultadosBuscador.getSettings().setDomStorageEnabled(true); //Habilitando todos los elementos del Doom del sitio solicitado
        wvResultadosBuscador.loadUrl(lugarIngresado); //Cargando en el navegador el sitio ingresado por el usuario
        Toast.makeText(getApplicationContext(), "Cargando el sitio, porfavor espere....", Toast.LENGTH_LONG).show(); //Mostrando en pantalla un mensaje de información
    }

    public void buscarSugerencia2(View vista) {
        String lugarIngresado = "https://www.google.com.ec/maps/search/bares+" + this.ciudad; //Capturar el valor ingresado por el usuario en el txtBarraBuscador y almacenamos en la variable ingresada lugarIngresado
        wvResultadosBuscador.setWebViewClient(new WebViewClient()); //Creando un navegador nuevo cada ves que el usuario ingrese un sitio a buscar
        wvResultadosBuscador.getSettings().setJavaScriptEnabled(true); //Habilitando JavaScript dentro de las paginas que se esten buscando
        wvResultadosBuscador.getSettings().setDomStorageEnabled(true); //Habilitando todos los elementos del Doom del sitio solicitado
        wvResultadosBuscador.loadUrl(lugarIngresado); //Cargando en el navegador el sitio ingresado por el usuario
        Toast.makeText(getApplicationContext(), "Cargando el sitio, porfavor espere....", Toast.LENGTH_LONG).show(); //Mostrando en pantalla un mensaje de información
    }

    public void buscarSugerencia3(View vista) {
        String lugarIngresado = "https://www.google.com.ec/maps/search/comidas+" + this.ciudad; //Capturar el valor ingresado por el usuario en el txtBarraBuscador y almacenamos en la variable ingresada lugarIngresado
        wvResultadosBuscador.setWebViewClient(new WebViewClient()); //Creando un navegador nuevo cada ves que el usuario ingrese un sitio a buscar
        wvResultadosBuscador.getSettings().setJavaScriptEnabled(true); //Habilitando JavaScript dentro de las paginas que se esten buscando
        wvResultadosBuscador.getSettings().setDomStorageEnabled(true); //Habilitando todos los elementos del Doom del sitio solicitado
        wvResultadosBuscador.loadUrl(lugarIngresado); //Cargando en el navegador el sitio ingresado por el usuario
        Toast.makeText(getApplicationContext(), "Cargando el sitio, porfavor espere....", Toast.LENGTH_LONG).show(); //Mostrando en pantalla un mensaje de información
    }

    public void buscarSugerencia4(View vista) {
        String lugarIngresado = "https://www.google.com.ec/maps/search/gasolineras+" + this.ciudad; //Capturar el valor ingresado por el usuario en el txtBarraBuscador y almacenamos en la variable ingresada lugarIngresado
        wvResultadosBuscador.setWebViewClient(new WebViewClient()); //Creando un navegador nuevo cada ves que el usuario ingrese un sitio a buscar
        wvResultadosBuscador.getSettings().setJavaScriptEnabled(true); //Habilitando JavaScript dentro de las paginas que se esten buscando
        wvResultadosBuscador.getSettings().setDomStorageEnabled(true); //Habilitando todos los elementos del Doom del sitio solicitado
        wvResultadosBuscador.loadUrl(lugarIngresado); //Cargando en el navegador el sitio ingresado por el usuario
        Toast.makeText(getApplicationContext(), "Cargando el sitio, porfavor espere....", Toast.LENGTH_LONG).show(); //Mostrando en pantalla un mensaje de información
    }

    public void cerrarBuscador(View vista) {
        finish(); //Cerrando la pantalla de registro
    }
}