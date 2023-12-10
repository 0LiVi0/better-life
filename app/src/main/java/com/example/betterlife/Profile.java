package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Profile extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        CardView myInfoCard = findViewById(R.id.myInfoCard);
        CardView upgradePremiumCard = findViewById(R.id.upgradePremiumCard);

        TextView userName = findViewById(R.id.userName);

        Intent intent = getIntent();
        String getUserFirstName = intent.getStringExtra("userFirstName");
        String getUserLastName = intent.getStringExtra("userLastName");

        if (getUserFirstName == null) {
            userName.setText("User\nName");
        } else {
            userName.setText(getUserFirstName + "\n" + getUserLastName);
        }


        myInfoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MyInfo.class));
            }
        });

        upgradePremiumCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, UpgradeToPremium.class));
            }
        });
    }

    public void openHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void openProgress(View view) {
        startActivity(new Intent(this, Progress.class));
    }
}