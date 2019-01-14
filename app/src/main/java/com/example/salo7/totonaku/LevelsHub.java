package com.example.salo7.totonaku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;

public class LevelsHub extends AppCompatActivity {

    //private CardView pronombresCard1, numeros1Card2, figuras1Card3, numeros2Card4, figuras2Card5;
    private Button pronombresBtn1, numeros1Btn2, figuras1Btn3, numeros2Btn4, figuras2Btn5;
    private Button CerrarSesion;
    FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_hub);

        //Assing Buttons
        /*pronombresCard1 = (CardView) findViewById(R.id.pronombresCard1);
        numeros1Card2 = (CardView) findViewById(R.id.numeros1Card2);
        figuras1Card3 = (CardView) findViewById(R.id.figuras1Card3);
        numeros2Card4 = (CardView) findViewById(R.id.numeros2Card4);
        figuras2Card5 = (CardView) findViewById(R.id.figuras2Card5);*/
        pronombresBtn1 = (Button) findViewById(R.id.pronombresBtn1);
        numeros1Btn2 = (Button) findViewById(R.id.numeros1Btn2);
        figuras1Btn3 = (Button) findViewById(R.id.figuras1Btn3);
        numeros2Btn4 = (Button) findViewById(R.id.numeros2Btn4);
        figuras2Btn5 = (Button) findViewById(R.id.figuras2Btn5);

        //Set Event
        pronombresLevel1 (pronombresBtn1);
        numeros1Level2 (numeros1Btn2);
        figuras1Level3 (figuras1Btn3);
        numeros2Level4 (numeros2Btn4);
        figuras2Level5 (figuras2Btn5);


        mAuth = FirebaseAuth.getInstance();

        CerrarSesion = findViewById(R.id.CerrarSesion);


        CerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                LoginManager.getInstance().logOut();
                Toast.makeText(getApplicationContext(),"Cerrado de sesion correcto", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, MainActivity.class);
                startActivity(accountIntent);
                finish();
            }
        });

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
    private void figuras1Level3(Button figuras1Btn3) {
        figuras1Btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, numero1Level2.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
    private void numeros2Level4(Button numeros2Btn4) {
        numeros2Btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, numeros2Level4.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
    private void figuras2Level5(Button figuras2Btn5) {
        figuras2Btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, numeros2Level4.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}