package com.ucheve.lab04;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    ArrayList<String> listaop;
    ArrayAdapter<String> adaptador;
    ListView lstOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstOpciones = findViewById(R.id.lstOpciones);
        lstOpciones.setOnItemClickListener(this);

        listaop = cargar();
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listaop);
        lstOpciones.setAdapter(adaptador);
    }

    public ArrayList<String> cargar() {
        listaop = null;
        listaop = new ArrayList<>();
        String obj = new String("Registrar");
        listaop.add(obj);

        String obj2 = new String("Listar");
        listaop.add(obj2);

        return listaop;

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String mensaje = lstOpciones.getItemAtPosition(position).toString();
        Toast.makeText(getApplicationContext(), mensaje, Toast.LENGTH_LONG).show();
    }
}