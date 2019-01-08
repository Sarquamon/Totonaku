package com.example.salo7.totonaku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class pronombresLevel1 extends AppCompatActivity {
    private Button pronombres1Level1BackBtn, pronombresakinAudioBtn, pronombresakitAudioBtn;
    private MediaPlayer pronombresakinAudio, pronombresakitAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_level1);

        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        pronombresakinAudioBtn = (Button) findViewById(R.id.pronombresakinAudioBtn);
        pronombresakitAudioBtn = (Button) findViewById(R.id.pronombresakitAudioBtn);

        pronombresakinAudio = MediaPlayer.create(pronombresLevel1.this,R.raw.pronombresakin);
        pronombresakitAudio = MediaPlayer.create(pronombresLevel1.this,R.raw.pronombresakit);

        ponerpronombresakinAudio (pronombresakinAudioBtn);
        ponerpronombresakitAudio (pronombresakitAudioBtn);
        Regresar(pronombres1Level1BackBtn);
    }

    private void ponerpronombresakitAudio(Button pronombresakitAudioBtn) {
        pronombresakitAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pronombresakitAudio.start();
            }
        });
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
        pronombresakitAudio.release();
    }

    private void Regresar (Button pronombres1Level1BackBtn){
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
