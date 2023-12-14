package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    // TODO: add a splash screen
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Відкрити тренування, натиснувши на карточку
        CardView cardWorkouts = findViewById(R.id.card_workouts);
        cardWorkouts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), Workouts.class));
            }
        });

        //Відкрити харчування, натиснувши на карточку
        CardView cardNutrition = findViewById(R.id.card_nutrition);
        cardNutrition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.getContext().startActivity(new Intent(v.getContext(), Nutrition.class));
            }
        });
    }

    //Відкрити тренування
    public void openWorkouts(View view) {
        startActivity(new Intent(this, Workouts.class));
    }

    //Відкрити харчування
    public void openNutrition(View view) {
        startActivity(new Intent(this, Nutrition.class));
    }

    //Відкрити профіль
    public void openProfile(View view) {
        startActivity(new Intent(this, Profile.class));
    }

    //Відкрити прогрес
    public void openProgress(View view) {
        startActivity(new Intent(this, Progress.class));
    }

    //Відкрити добробут
    public void openSelfCare(View view) {
        startActivity(new Intent(this, SelfCare.class));
    }
}