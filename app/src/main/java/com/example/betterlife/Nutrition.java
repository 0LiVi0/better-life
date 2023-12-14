package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Nutrition extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);

        CardView cardView = findViewById(R.id.cardView);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView mealName = findViewById(R.id.mealTitle);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView mealDescription = findViewById(R.id.mealDescription);

        //отримання даних від екрану Create Nutrition
        Intent intent = getIntent();
        String getMealName = intent.getStringExtra("mealName");
        String getMealDescription = intent.getStringExtra("mealCalories") + " cal / " +
                intent.getStringExtra("mealProts") + " prots / " + intent.getStringExtra("mealCarbs")
                + " carbs / " + intent.getStringExtra("mealFats") + " fats";

        if (getMealName == null) {
            mealName.setText("");
            mealDescription.setText("");
            cardView.setVisibility(View.INVISIBLE);
        } else {
            mealName.setText(getMealName);
            mealDescription.setText(getMealDescription);
        }
    }

    public void openHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void createNutrition (View view) {
        startActivity(new Intent(this, CreateNutrition.class));
    }
}