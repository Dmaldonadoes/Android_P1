package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textoMostrado;
    private EditText textoIntroducido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoMostrado = (TextView) findViewById(R.id.textView);
        textoIntroducido = (EditText) findViewById(R.id.editTextTextPersonName);
        //Log.d("Saludo","Holiwis");
    }
    public void ContarLetras (View quien ){
        Log.d("P1", "El botón se ha pulsado: ");

        textoMostrado.setText("La palabra tiene: " + String.valueOf(textoIntroducido.getText()).length() + " letras");
        //Log.d("P2", String.valueOf(textoIntroducido.getText()));


    }
}