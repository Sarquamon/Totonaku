package com.example.salo7.totonaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class numeros2Level3 extends AppCompatActivity {

    private Button numeros2Level3BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros2_level3);


        numeros2Level3BackBtn = (Button) findViewById(R.id.numeros2Level3BackBtn);

        regresar(numeros2Level3BackBtn);
    }

    private void regresar(Button numeros1Level2BackBtn) {
        numeros2Level3BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numeros2Level3.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}
