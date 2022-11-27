package com.example.davaleba;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView nameTextView,mobileTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);

        nameTextView = findViewById(R.id.nameText);
        mobileTextView = findViewById(R.id.mobileText);

        String username = getIntent().getStringExtra("nameUser");
        String usermobile = getIntent().getStringExtra("mobileUser");

        nameTextView.setText(username);
        mobileTextView.setText(usermobile);
    }
}