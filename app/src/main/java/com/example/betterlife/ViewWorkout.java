package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.ArrayList;

public class ViewWorkout extends AppCompatActivity {

    @SuppressLint({"ResourceType", "MissingInflatedId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_workout);

        VideoView videoView = findViewById(R.id.videoView);

        //запуск відео після натискання
        videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.backvideo;
                Uri uri = Uri.parse(videoPath);
                videoView.setVideoURI(uri);
                videoView.start();
            }
        });
    }

    public void goBackToWorkouts(View view) {
        startActivity(new Intent(this, Workouts.class));
    }
}