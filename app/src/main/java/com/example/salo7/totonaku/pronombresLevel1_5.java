package com.example.salo7.totonaku;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class pronombresLevel1_5 extends AppCompatActivity {

    private Button pronombres1Level1BackBtn, pronombresxlakanAudioBtn;
    private MediaPlayer pronombresxlakanAudio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronombres_level1_5);

        //Button Asign
        pronombres1Level1BackBtn = (Button) findViewById(R.id.pronombres1Level1BackBtn);
        pronombresxlakanAudioBtn = (Button) findViewById(R.id.pronombresxlakanAudioBtn);

        pronombresxlakanAudio = MediaPlayer.create(pronombresLevel1_5.this,R.raw.pronombresxlakan);

        ponerpronombresakitAudio (pronombresxlakanAudioBtn);
        Regresar(pronombres1Level1BackBtn);
    }

    private void ponerpronombresakitAudio(Button pronombresxlakanAudioBtn) {
        pronombresxlakanAudioBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pronombresxlakanAudio.start();
            }
        });
    }

    public void onPause(){
        super.onPause();
        pronombresxlakanAudio.release();
    }

    private void Regresar (Button pronombres1Level1BackBtn){
        pronombres1Level1BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1_5.this, LevelsHub.class);
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
            case R.id.radio_xlakan:
                if (checked)
                    Toast.makeText(getApplicationContext(),"¡Felicidades!", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(pronombresLevel1_5.this, pronombresLevel1_6.class);
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
