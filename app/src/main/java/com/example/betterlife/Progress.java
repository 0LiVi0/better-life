package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Progress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        CardView cardView = findViewById(R.id.cardView1);
        View div1 = findViewById(R.id.myDivider);
        View div2 = findViewById(R.id.myDivider2);
        TextView myText = findViewById(R.id.myText);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView progressTitle = findViewById(R.id.progressTitle);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView progressDescription = findViewById(R.id.progressDescription);

        //отримання даних від екрану Create Progress
        Intent intent = getIntent();
        String getProgressTitle = intent.getStringExtra("progressTitle");
        String getProgressDescription = intent.getStringExtra("progressCategory");

        if (getProgressTitle == null) {
            progressTitle.setText("");
            progressDescription.setText("");
            cardView.setVisibility(View.INVISIBLE);
            div1.setVisibility(View.INVISIBLE);
            div2.setVisibility(View.INVISIBLE);
            myText.setVisibility(View.INVISIBLE);
        } else {
            progressTitle.setText(getProgressTitle);
            progressDescription.setText(getProgressDescription);
        }
    }

    public void openHome(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void createProgress(View view) {
        startActivity(new Intent(this, CreateProgress.class));
    }

    public void openProfile(View view) {
        startActivity(new Intent(this, Profile.class));
    }
}