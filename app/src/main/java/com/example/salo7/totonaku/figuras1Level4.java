package com.example.salo7.totonaku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class figuras1Level4 extends AppCompatActivity {

    private Button figuras1Level4BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras1_level4);

        figuras1Level4BackBtn = (Button) findViewById(R.id.figuras1Level4BackBtn);

        regresar(figuras1Level4BackBtn);
    }
    private void regresar(Button figuras1Level4BackBtn) {
        figuras1Level4BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(figuras1Level4.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}
