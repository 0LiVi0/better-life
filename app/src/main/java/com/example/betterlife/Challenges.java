package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Challenges extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenges);

        CardView cardView = findViewById(R.id.cardChallenge);

        TextView challengeTitle = findViewById(R.id.challengeTitle1);
        TextView challengeDeadline = findViewById(R.id.challengeDeadline1);
        TextView challengeTasks = findViewById(R.id.challengeTasks1);

        //отримання даних від екрану Create Challenge
        Intent intent = getIntent();
        String getChallengeTitle = intent.getStringExtra("challengeTitle");
        String getChallegneDeadline = intent.getStringExtra("challengeDeadline");
        String getChallengeTasks = intent.getStringExtra("challengeTasks");

        if (getChallengeTitle == null) {
            challengeTitle.setText("");
            challengeDeadline.setText("");
            challengeTasks.setText("");
            cardView.setVisibility(View.INVISIBLE);
        } else {
            challengeTitle.setText(getChallengeTitle);
            challengeDeadline.setText("To " + getChallegneDeadline);
            challengeTasks.setText(getChallengeTasks);
        }
    }

    public void goBackSelfCare(View view) {
        startActivity(new Intent(this, SelfCare.class));
    }

    public void createChallenge(View view) {
        startActivity(new Intent(this, CreateChallenge.class));
    }
}