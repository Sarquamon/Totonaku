package com.example.salo7.totonaku;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.facebook.login.LoginManager;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class profileActivity extends AppCompatActivity {

    FirebaseAuth mAuth;
    FirebaseUser user;
    private Button profileBackBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        mAuth = FirebaseAuth.getInstance();
        user = mAuth.getCurrentUser();
        profileBackBtn = (Button) findViewById(R.id.profileBackBtn);

        profileBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                LoginManager.getInstance().logOut();
                Toast.makeText(getApplicationContext(),"Cerrado de sesion correcto", Toast.LENGTH_SHORT).show();
                Intent accountIntent = new Intent(profileActivity.this, MainActivity.class);
                startActivity(accountIntent);
                finish();
            }
        });
    }


    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser == null){
            updateUI();
        }else{
            // Name, email address, and profile photo Url
            String name = user.getDisplayName();
            String email = user.getEmail();
            Uri photoUrl = user.getPhotoUrl();
        }
    }
    private void updateUI() {
        Toast.makeText(getApplicationContext(),"Cerrado de sesion correcto", Toast.LENGTH_SHORT).show();
        Intent accountIntent = new Intent(profileActivity.this, MainActivity.class);
        startActivity(accountIntent);
        finish();
    }

    public void signOut(View v) {
        mAuth.signOut();
        LoginManager.getInstance().logOut();
        updateUI();
    }


}
