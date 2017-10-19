package com.example.arqdsis.cliente_cco;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class ListarClientesActivity extends Activity {
    ArrayList<String> clientes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_clientes);
        Intent intent = getIntent();
        String chave = (String)intent.getStringExtra(MainActivity.CHAVE);
        clientes = Data.buscaClientes(chave);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, clientes);

    }


}
