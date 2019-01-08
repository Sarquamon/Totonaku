package com.example.salo7.totonaku;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

public class LevelsHub extends AppCompatActivity {

    //GridLayout mainGrid;
    //CardView pronombresCard1;
    //CardView numeros1Card2;
    //CardView numeros2Card3;
    private Button pronombresBtn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels_hub);

        //mainGrid = (GridLayout) findViewById(R.id.mainGrid);
        pronombresBtn1 = (Button) findViewById(R.id.pronombresBtn1);
        //numeros1Btn2 = (Button) findViewById(R.id.numeros1Btn2);
        //numeros2Btn3 = (Button) findViewById(R.id.numeros2Btn3);

        //Set Event
        pronombresLevel (pronombresBtn1);
        //setSingleEvent (mainGrid);
        //setToggleEvent (mainGrid);
    }

    private void pronombresLevel(Button pronombresBtn1) {
        pronombresBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Funciona", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(LevelsHub.this, profileActivity.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }

/*private void setToggleEvent(GridLayout mainGrid) {
    //ciclar childs de mainGrid
    for (int i=0;i<mainGrid.getChildCount();i++){
        final CardView cardView = (CardView) mainGrid.getChildAt(i);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cardView.getCardBackgroundColor().getDefaultColor() ==
-1){
                    //Cambia el color

cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                    Toast.makeText(LevelsHub.this,"State:
true",Toast.LENGTH_SHORT).show();
                }else{

cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                    Toast.makeText(LevelsHub.this,"State:
false",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}*/

/*private void setSingleEvent(GridLayout mainGrid) {
    //ciclar childs de mainGrid
    for (int i=0;i<mainGrid.getChildCount();i++){
        CardView cardView = (CardView) mainGrid.getChildAt(i);
        final int finalI = i;
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(LevelsHub.this,"Cliqueado en index " +
finalI,Toast.LENGTH_SHORT).show();
                if (finalI == 0){
                    Toast.makeText(LevelsHub.this,"Clicado
pronombres",Toast.LENGTH_SHORT).show();
                    Intent accountIntent = new Intent(LevelsHub.this,
profileActivity.class);
                    startActivity(accountIntent);
                    finish();
                }
            }
        });
    }
 }*/
}