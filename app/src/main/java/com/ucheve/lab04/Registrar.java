package com.ucheve.lab04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Registrar extends AppCompatActivity implements View.OnClickListener {

    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        btnRegresar = findViewById(R.id.btnRegresar);
        btnRegresar.setOnClickListener(this);
    }

    private void regresar() {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
        finish();
    }

    @Override
    public void onClick(View v) {
        if (v == btnRegresar) {
            regresar();
        }
    }
}