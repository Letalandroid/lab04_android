package com.ucheve.lab04;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Listar extends AppCompatActivity implements View.OnClickListener {

    Button btnRegresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        btnRegresar = findViewById(R.id.btnRegresar2);
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