package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Open workouts by tapping the card
        CardView cardWorkouts = findViewById(R.id.card_workouts);
        cardWorkouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), Workouts.class));
            }
        });

        //Open nutrition by tapping the card
        CardView cardNutrition = findViewById(R.id.card_nutrition);
        cardNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), Nutrition.class));
            }
        });
    }

    public void openWorkouts(View view) {
        startActivity(new Intent(this, Workouts.class));
    }

    public void openNutrition(View view) {
        startActivity(new Intent(this, Nutrition.class));
    }

    public void openProfile(View view) {
        startActivity(new Intent(this, Profile.class));
    }

    public void openProgress(View view) {
        startActivity(new Intent(this, Progress.class));
    }

    public void openSelfCare(View view) {
        startActivity(new Intent(this, SelfCare.class));
    }
}