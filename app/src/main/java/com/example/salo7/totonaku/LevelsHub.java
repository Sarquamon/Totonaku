package com.example.salo7.totonaku;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class LevelsHub extends AppCompatActivity {

    private Button numeros1Btn2;
    private Button numeros2Btn3;
    private Button pronombresBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_hub);


        pronombresBtn1 = (Button) findViewById(R.id.pronombresBtn1);
        numeros1Btn2 = (Button) findViewById(R.id.numeros1Btn2);
        numeros2Btn3 = (Button) findViewById(R.id.numeros2Btn3);

        //Set Event
        pronombresLevel1 (pronombresBtn1);
        numeros1Level2 (numeros1Btn2);
        numeros2Level3 (numeros2Btn3);
    }

    private void pronombresLevel1(Button pronombresBtn1) {
        pronombresBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, pronombresLevel1.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
    private void numeros1Level2(Button numeros1Btn2) {
        numeros1Btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, numero1Level2.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
    private void numeros2Level3(Button numeros2Btn3) {
        numeros2Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, numeros2Level3.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}