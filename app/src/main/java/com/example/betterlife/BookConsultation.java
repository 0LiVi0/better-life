package com.example.betterlife;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BookConsultation extends AppCompatActivity {

    Button btnDialogYes, btnDialogCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_consultation);

        CalendarView calendarView = findViewById(R.id.calendarView);
        calendarView.setMinDate(System.currentTimeMillis() - 1000); //make past days unavailable
        long selectedDate = calendarView.getDate();
        String formattedDate = formatDate(selectedDate);

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog);
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.curve_shape));

        btnDialogYes = dialog.findViewById(R.id.btn_yes);
        btnDialogCancel = dialog.findViewById(R.id.btn_no);

        btnDialogCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btnDialogYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BookConsultation.this, SelfCare.class);
                startActivity(intent);
                Toast.makeText(BookConsultation.this, "Successfully booked on " + formattedDate, Toast.LENGTH_SHORT).show();
                dialog.dismiss();
            }
        });

        Button bookConsultation = findViewById(R.id.bookConsultation);
        bookConsultation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });

    }

    private String formatDate(long dateInMillis) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault());
        Date date = new Date(dateInMillis);
        return dateFormat.format(date);
    }

    public void goBackSelfCare(View view) {
        startActivity(new Intent(this, SelfCare.class));
    }
}