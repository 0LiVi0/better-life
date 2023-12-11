package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MyInfo extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_info);

        Button updateProfileInfo = findViewById(R.id.updateProfileInfo);
        EditText userFirstName = findViewById(R.id.userFirstName);
        EditText userLastName = findViewById(R.id.userLastName);

        updateProfileInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyInfo.this, Profile.class);
                String getUserFirstName = userFirstName.getText().toString();
                String getUserLastName = userLastName.getText().toString();
                intent.putExtra("userFirstName", getUserFirstName);
                intent.putExtra("userLastName", getUserLastName);
                startActivity(intent);
                Toast.makeText(MyInfo.this, "Профіль оновлений успішно!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goBackProfile(View view) {
        startActivity(new Intent(this, Profile.class));
    }
}