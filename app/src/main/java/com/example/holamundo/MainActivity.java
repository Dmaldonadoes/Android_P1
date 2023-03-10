package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textoMostrado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textoMostrado = (TextView) findViewById(R.id.editTextTextPersonName);
        //Log.d("Saludo","Holiwis");
    }
    public void ContarLetras (View quien ){
        Log.d("P1", "El botón se ha pulsado: ");
        //textoMostrado.setText("Holi");

    }
}