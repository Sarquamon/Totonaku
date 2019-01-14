package com.example.salo7.totonaku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class numeros1Level2_4 extends AppCompatActivity {

    private Button pronombres1Level1BackBtn, numeros1TutuAudioBtn;
    private MediaPlayer numero1Level2_4tutuAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numeros1__level2_4);

        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        numeros1TutuAudioBtn = (Button) findViewById(R.id.numeros1TumAudioBtn);

        numero1Level2_4tutuAudio = MediaPlayer.create(numeros1Level2_4.this, R.raw.numeros1tutu);

        numeros1TumAudioBtn(numeros1TutuAudioBtn);
        Regresar(pronombres1Level1BackBtn);
    }

    private void numeros1TumAudioBtn(Button numeros1TumAudioBtn) {
        numeros1TumAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1Level2_4tutuAudio.start();
            }
        });
    }

    public void onPause() {
        super.onPause();
        numero1Level2_4tutuAudio.release();
    }

    private void Regresar(Button pronombres1Level1BackBtn) {
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numeros1Level2_4.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_tutu:
                if (checked)
                    Toast.makeText(getApplicationContext(), "¡Felicidades!", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numeros1Level2_4.this, numeros1Level2_5.class);
                startActivity(accountIntent);
                finish();
                break;
            case R.id.radio_wixin:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_wix:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_tum:
                if (checked)
                    Toast.makeText(getApplicationContext(), "Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
