package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class CreateChallenge extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_challenge);

        CalendarView calendarView = findViewById(R.id.calendarView2);
        calendarView.setMinDate(System.currentTimeMillis() - 1000); //встановлення попередніх днів неактивними
        long selectedDate = calendarView.getDate();
        String formattedDate = formatDate(selectedDate);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) EditText challengeTitle = findViewById(R.id.challengeTitle);
        EditText challengeTasks = findViewById(R.id.challengeTasks);

        Button btnAddChallenge = findViewById(R.id.addChallenge);
        //додавання челенджу
        btnAddChallenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateChallenge.this, Challenges.class);
                intent.putExtra("challengeTitle", challengeTitle.getText().toString());
                intent.putExtra("challengeTasks", challengeTasks.getText().toString());
                intent.putExtra("challengeDeadline", formattedDate);
                startActivity(intent);
            }
        });
    }

    //функція, яка перетворить дату з календаря у формат дд.мм.рррр
    private String formatDate(long dateInMillis) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date date = new Date(dateInMillis);
        return dateFormat.format(date);
    }

    public void goBackChallenges(View view) {
        startActivity(new Intent(this, Challenges.class));
    }
}