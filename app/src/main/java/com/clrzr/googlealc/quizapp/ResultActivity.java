package com.clrzr.googlealc.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String namE = intent.getStringExtra("id");
        String score = intent.getStringExtra("score");

        // Capture the layout's TextView and set the string as its text
        TextView name_textView = findViewById(R.id.name_text_view);
        name_textView.setText(namE);

        TextView score_textView = findViewById(R.id.score_text_view);
        score_textView.setText(score);
    }
}




