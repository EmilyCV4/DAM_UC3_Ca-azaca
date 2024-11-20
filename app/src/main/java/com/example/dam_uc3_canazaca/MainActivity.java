package com.example.dam_uc3_canazaca;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Encuentra el botón por su ID
        Button btnProcurarVoos = findViewById(R.id.btn_procurar_voos);

        // Configura el evento onClick
        btnProcurarVoos.setOnClickListener(v -> {
            // Muestra un mensaje Toast
            Toast.makeText(MainActivity.this, "Se envió sus datos", Toast.LENGTH_SHORT).show();
        });
    }
}
