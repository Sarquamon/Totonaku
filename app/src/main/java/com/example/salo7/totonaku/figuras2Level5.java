package com.example.salo7.totonaku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class figuras2Level5 extends AppCompatActivity {

    private Button figuras2Level5BackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_figuras2_level5);

        figuras2Level5BackBtn = (Button) findViewById(R.id.figuras2Level5BackBtn);

        regresar(figuras2Level5BackBtn);
    }

    private void regresar(Button figuras2Level5BackBtn) {
        figuras2Level5BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(figuras2Level5.this, LevelsHub.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }
}
