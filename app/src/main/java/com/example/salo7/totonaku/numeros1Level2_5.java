package com.example.salo7.totonaku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class numeros1Level2_5 extends AppCompatActivity {

    private Button pronombres1Level1BackBtn, checarRespuesta;
    private EditText respuestaUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros1_level2_5);


        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        checarRespuesta = (Button) findViewById(R.id.checarRespuesta);
        respuestaUsuario = findViewById(R.id.respuestaUsuario);

        checarRespuestaUsuario(checarRespuesta);
        Regresar(pronombres1Level1BackBtn);
    }

    private void checarRespuestaUsuario(Button checarRespuesta) {
        checarRespuesta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String respuestaNivel = "tutu", respuestaNivel2 = "Tutu";

                if (respuestaUsuario.getText().toString().trim().equals(respuestaNivel)) {
                    Toast.makeText(getApplicationContext(), "Funciona", Toast.LENGTH_SHORT).show();
                    Intent accountIntent = new Intent(numeros1Level2_5.this, numeros1Level2_6.class);
                    startActivity(accountIntent);
                    finish();
                } else if (respuestaUsuario.getText().toString().trim().equals(respuestaNivel2)) {
                    Toast.makeText(getApplicationContext(), "Funciona", Toast.LENGTH_SHORT).show();
                    Intent accountIntent = new Intent(numeros1Level2_5.this, numeros1Level2_6.class);
                    startActivity(accountIntent);
                    finish();
                } else {
                    Toast.makeText(getApplicationContext(), "Ingrese la respuesta correcta ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void Regresar(Button pronombres1Level1BackBtn) {
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numeros1Level2_5.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}
