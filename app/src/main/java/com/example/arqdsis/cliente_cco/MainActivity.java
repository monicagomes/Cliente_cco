package com.example.arqdsis.cliente_cco;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text;
    public static final String CHAVE = "com.example.arqdsis.cliente_cco.chave";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = (EditText)findViewById(R.id.buscar_clientes); //tranformar em um objeto java
    }

    public void buscarCliente(View view){
        Intent intent = new Intent(this, ListarClientesActivity.class);
        String texto = text.getText().toString();
        intent.putExtra(CHAVE, texto);0
        startActivity(intent);
    }
}
