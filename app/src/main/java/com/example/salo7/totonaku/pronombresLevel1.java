package com.example.salo7.totonaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pronombresLevel1 extends AppCompatActivity {

    private Button pronombres1Level1BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_level1);

        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);

        regresar(pronombres1Level1BackBtn);
    }

    private void regresar(Button numeros1Level2BackBtn) {
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}
