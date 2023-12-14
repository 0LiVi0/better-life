package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateNutrition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_nutrition);

    }

    public void goBackNutrition(View view) {
        startActivity(new Intent(this, Nutrition.class));
    }

    //створення нового харчування та передача даних екрану Nutrition
    public void addNewMeal(View view) {
        EditText mealName = findViewById(R.id.mealName);
        EditText mealWeight = findViewById(R.id.mealWeight);
        EditText mealCalories = findViewById(R.id.mealCalories);
        EditText mealProts = findViewById(R.id.mealProts);
        EditText mealCarbs = findViewById(R.id.mealCarbs);
        EditText mealFats = findViewById(R.id.mealFats);

        String getMealName = mealName.getText().toString();
        String getMealWeight = mealWeight.getText().toString();
        String getMealCalories = mealCalories.getText().toString();
        String getMealProts = mealProts.getText().toString();
        String getMealCarbs = mealCarbs.getText().toString();
        String getMealFats = mealFats.getText().toString();

        Intent intent = new Intent(CreateNutrition.this, Nutrition.class);
        intent.putExtra("mealName", getMealName);
        intent.putExtra("mealWeight", getMealWeight);
        intent.putExtra("mealCalories", getMealCalories);
        intent.putExtra("mealProts", getMealProts);
        intent.putExtra("mealCarbs", getMealCarbs);
        intent.putExtra("mealFats", getMealFats);

        startActivity(intent);
    }
}