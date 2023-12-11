package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class SleepTracking extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sleep_tracking);

        CardView cardView = findViewById(R.id.cardView);

        Button startButton = findViewById(R.id.startButton);
        Button finishButton = findViewById(R.id.finishButton);
        Chronometer chronometer = findViewById(R.id.sleepTimer);

        TextView sleepTitle = findViewById(R.id.sleepTitle);
        TextView sleepDescription = findViewById(R.id.sleepDescription);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.start();
            }
        });

        finishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                chronometer.stop();
                sleepTitle.setText("Сон сьогодні");
                sleepDescription.setText(chronometer.getText() + "  хвилин сну");
                chronometer.setBase(SystemClock.elapsedRealtime());
                cardView.setVisibility(View.VISIBLE);
            }
        });
    }

    public void goBackSelfCare(View view) {
        startActivity(new Intent(this, SelfCare.class));
    }
}