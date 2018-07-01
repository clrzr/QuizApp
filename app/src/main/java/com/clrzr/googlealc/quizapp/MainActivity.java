package com.clrzr.googlealc.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startQuiz(View view) {
        Intent toQuiz = new Intent(this, AppActivity.class);
        EditText usernameText = findViewById(R.id.input_name);
        name = usernameText.getText().toString();
        toQuiz.putExtra("id", name);

        if (name.matches("")) {
            Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
    }
            else
                startActivity(toQuiz);
    }

}
