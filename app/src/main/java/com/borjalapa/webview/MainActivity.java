package com.borjalapa.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    WebView mwebview;
    final String urlGoogle = "https://google.es";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mwebview = (WebView)findViewById(R.id.webView);

        //habilitar las opciones de la pagina web
        WebSettings webSettings = mwebview.getSettings();

        //habilitar los scripts de javascript de la pagina web
        webSettings.setJavaScriptEnabled(true);
    }

    //onclick del boton para cargar la web en el WebView
    public void cargarWeb(View view) {
        mwebview.loadUrl(urlGoogle);
    }

    //tienes que habilitar el internet en el manifest.xml para que carge la pagina
}