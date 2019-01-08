package com.example.salo7.totonaku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class numero1Level2 extends AppCompatActivity {
    private Button pronombres1Level1BackBtn, numeros1TumAudioBtn ;
    private MediaPlayer numero1Level2tumAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numero1_level2);

        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        numeros1TumAudioBtn = (Button) findViewById(R.id.numeros1TumAudioBtn);

        numero1Level2tumAudio = MediaPlayer.create(numero1Level2.this,R.raw.numeros1tum);

        numeros1TumAudioBtn (numeros1TumAudioBtn);
        Regresar(pronombres1Level1BackBtn);
    }

    private void numeros1TumAudioBtn(Button numeros1TumAudioBtn) {
        numeros1TumAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numero1Level2tumAudio.start();
            }
        });
    }

    public void onPause(){
        super.onPause();
        numero1Level2tumAudio.release();
    }

    private void Regresar(Button pronombres1Level1BackBtn) {
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numero1Level2.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_tum:
                if (checked)
                    Toast.makeText(getApplicationContext(),"¡Felicidades!", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(numero1Level2.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
                break;
            case R.id.radio_tutu:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_tuy:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_akit:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
