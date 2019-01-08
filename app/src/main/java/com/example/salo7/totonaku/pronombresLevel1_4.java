package com.example.salo7.totonaku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class pronombresLevel1_4 extends AppCompatActivity {

    private Button pronombres1Level1BackBtn, pronombresakinAudioBtn;
    private MediaPlayer pronombresakinAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_level1_4);


        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        pronombresakinAudioBtn = (Button) findViewById(R.id.pronombresakinAudioBtn);


        pronombresakinAudio = MediaPlayer.create(pronombresLevel1_4.this,R.raw.pronombresakin);


        ponerpronombresakinAudio (pronombresakinAudioBtn);
        Regresar(pronombres1Level1BackBtn);
    }
        private void ponerpronombresakinAudio(Button pronombresakinAudioBtn) {
        pronombresakinAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pronombresakinAudio.start();
            }
        });
    }

    public void onPause(){
        super.onPause();
        pronombresakinAudio.release();
    }

    private void Regresar (Button pronombres1Level1BackBtn){
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1_4.this, LevelsHub.class);
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
            case R.id.radio_akin:
                if (checked)
                    Toast.makeText(getApplicationContext(),"¡Felicidades!", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1_4.this, pronombresLevel1_5.class);
                startActivity(accountIntent);
                finish();
                break;
            case R.id.radio_akit:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_xla:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radio_wixin:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
        }
    }


}
