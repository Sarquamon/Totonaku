package com.example.salo7.totonaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class numero1Level2 extends AppCompatActivity {

    private Button numeros1Level2BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero1_level2);

        numeros1Level2BackBtn = (Button) findViewById(R.id.numeros1Level2BackBtn);

        regresar(numeros1Level2BackBtn);
    }

    private void regresar(Button numeros1Level2BackBtn) {
        numeros1Level2BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numero1Level2.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}
