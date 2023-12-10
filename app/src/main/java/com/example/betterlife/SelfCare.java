package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelfCare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_self_care);
    }

    public void openHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void openBookConsultation(View view) {
        startActivity(new Intent(this, BookConsultation.class));
    }

    public void openChallenges(View view) {
        startActivity(new Intent(this, Challenges.class));
    }

    public void openSleepTracking(View view) {
        startActivity(new Intent(this, SleepTracking.class));
    }
}