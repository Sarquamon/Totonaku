package com.example.salo7.totonaku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class pronombresLevel1_3 extends AppCompatActivity {

    private Button pronombres1Level1BackBtn, pronombreswixinAudioBtn;
    private MediaPlayer pronombreswixinAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_level1_3);

        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        pronombreswixinAudioBtn = (Button) findViewById(R.id.pronombreswixinAudioBtn);

        pronombreswixinAudio = MediaPlayer.create(pronombresLevel1_3.this,R.raw.pronombreswixin);

        pronombreswixinAudio (pronombreswixinAudioBtn);
        Regresar(pronombres1Level1BackBtn);
    }

    private void pronombreswixinAudio(Button pronombreswixinAudioBtn) {
        pronombreswixinAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pronombreswixinAudio.start();
            }
        });
    }

    public void onPause(){
        super.onPause();
        pronombreswixinAudio.release();
    }

    private void Regresar (Button pronombres1Level1BackBtn){
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1_3.this, LevelsHub.class);
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
            case R.id.radio_wixin:
                if (checked)
                    Toast.makeText(getApplicationContext(),"¡Felicidades!", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1_3.this, pronombresLevel1_4.class);
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
            case R.id.radio_xlakan:
                if (checked)
                    Toast.makeText(getApplicationContext(),"Intentalo de nuevo", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
