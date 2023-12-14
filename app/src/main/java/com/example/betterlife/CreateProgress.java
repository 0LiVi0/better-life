package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_progress);


    }

    public void goBackProgress(View view) {
        startActivity(new Intent(this, Progress.class));
    }

    //створення нового прогресу та передача даних екрану Progress
    public void addNewProgress(View view) {
        EditText progressTitle = findViewById(R.id.progressTitleInput);
        EditText progressCategory = findViewById(R.id.progressCategoryInput);

        String getProgressTitle = progressTitle.getText().toString();
        String getProgressCategory = progressCategory.getText().toString();

        Intent intent = new Intent(this, Progress.class);
        intent.putExtra("progressTitle", getProgressTitle);
        intent.putExtra("progressCategory", getProgressCategory);

        startActivity(intent);
    }
}