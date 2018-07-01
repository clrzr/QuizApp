package com.clrzr.googlealc.quizapp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class AppActivity extends AppCompatActivity {

    Intent intent = getIntent();
    Intent toResult = new Intent(this, ResultActivity.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app);
        Button ans = findViewById(R.id.submit_button);
        ans.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view) {

                int Score = 0;

                //Statement to check answers, displays correct_icon if correct and
                //wrong_icon if wrong in each Question

                if (checkQuestionOneAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question1Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question1Status));

                }

                if (checkQuestionTwoAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question2Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question2Status));

                }

                if (checkQuestionThreeAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question3Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question3Status));

                }

                if (checkQuestionFourAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question4Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question4Status));

                }

                if (checkQuestionFiveAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question5Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question5Status));

                }

                if (checkQuestionSixAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question6Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question6Status));

                }

                if (checkQuestionSevenAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question7Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question7Status));

                }

                if (checkQuestionEightAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question8Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question8Status));

                }

                if (checkQuestionNineAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question9Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question9Status));

                }

                if (checkQuestionTenAnswer()) {
                    Score += 10;
                    displayStatus(getDrawable(R.drawable.correct_icon), findViewById(R.id.question10Status));

                } else {
                    displayStatus(getDrawable(R.drawable.wrong_icon), findViewById(R.id.question10Status));

                }


                if (Score >= 70) {
                    String pass = getString(R.string.goodResult1) + " " + Score;
                    pass = pass + getString(R.string.goodResult2);
                    intent.putExtra("score", pass);
                    startActivity(toResult);


                } else {
                    String fail = getString(R.string.badResult1) + " " + Score;
                    fail = fail + getString(R.string.badResult2);
                    intent.putExtra("score", fail);
                    startActivity(toResult);

                }
            }
        });
    }
    // Method display's question marking icon
    private void displayStatus(Drawable img, View statusID) {
        ImageView statusTextView = (ImageView) statusID;
        statusTextView.setImageDrawable(img);
    }


    //  Methods for all questions.
    //  The methods checks if answer enter are correct or wrong.

    /**
     * Question One answer, returns a boolean data type.
     */

    private boolean checkQuestionOneAnswer() {
        EditText questionOneOption = findViewById(R.id.question1A);
        return getString(R.string.questionOneAnswer).equals(questionOneOption.getText().toString());
    }

    /**
     * Question Two answer, returns a boolean data type.
     */

    private boolean checkQuestionTwoAnswer() {
        CheckBox questionTwoA = findViewById(R.id.question2A);
        CheckBox questionTwoB = findViewById(R.id.question2B);
        CheckBox questionTwoC = findViewById(R.id.question2C);
        CheckBox questionTwoD = findViewById(R.id.question2D);
        /*
         * Return Value checks if Check Box for Option A and D is Checked (Answer for Question Two)
         * and checks if Option C and D are "NOT" checked
         */
        return (questionTwoA.isChecked() && questionTwoD.isChecked()) && !(questionTwoC.isChecked() || questionTwoB.isChecked());

    }

    /**
     * Question Three answer, returns a boolean data type.
     */
    private boolean checkQuestionThreeAnswer() {
        RadioButton questionThreeC = findViewById(R.id.question3C);
        /*
         * Return Value checks if the correct answer is Option C
         */
        return questionThreeC.isChecked();
    }

    /**
     * Question Four answer, returns a boolean data type.
     */
    private boolean checkQuestionFourAnswer() {
        RadioButton questionFourA = findViewById(R.id.question4A);
        /*
         * Return Value checks if the correct answer is Option A
         */
        return questionFourA.isChecked();
    }

    /**
     * Question Five answer, returns a boolean data type.
     */

    private boolean checkQuestionFiveAnswer() {
        CheckBox questionFiveA = findViewById(R.id.question5A);
        CheckBox questionFiveB = findViewById(R.id.question5B);
        CheckBox questionFiveC = findViewById(R.id.question5C);
        CheckBox questionFiveD = findViewById(R.id.question5D);
        /*
         * Return Value checks if Check Box for Option B 'and' C is Checked (Answer for Question Five)
         * 'and' checks if Option A 'or' D are "not' checked
         */
        return (questionFiveB.isChecked() && questionFiveC.isChecked()) && !(questionFiveA.isChecked() || questionFiveD.isChecked());

    }


    /**
     * Question Six answer, returns a boolean data type.
     */
    private boolean checkQuestionSixAnswer() {
        RadioButton questionSixB = findViewById(R.id.question6B);
        /*
         * Return Value checks if the correct answer is Option B
         */
        return questionSixB.isChecked();
    }


    /**
     * Question Seven answer, returns a boolean data type.
     */
    private boolean checkQuestionSevenAnswer() {
        RadioButton questionSevenD = findViewById(R.id.question7D);
        /*
         * Return Value checks if the correct answer is Option D
         */
        return questionSevenD.isChecked();
    }

    /**
     * Question Eight answer, returns a boolean data type.
     */
    private boolean checkQuestionEightAnswer() {
        RadioButton questionEightB = findViewById(R.id.question8B);
        /*
         * Return Value checks if the correct answer is Option B
         */
        return questionEightB.isChecked();
    }

    /**
     * Question Nine answer, returns a boolean data type.
     */

    private boolean checkQuestionNineAnswer() {
        EditText questionNineOption = findViewById(R.id.question9A);
        // The return value makes sure that user input is not case sensitive
        return getString(R.string.questionNineAnswer).equalsIgnoreCase(questionNineOption.getText().toString());
    }

    /**
     * Question Ten answer, returns a boolean data type.
     */
    private boolean checkQuestionTenAnswer() {
        RadioButton questionTenC = findViewById(R.id.question10C);
        /*
         * Return Value checks if the correct answer is Option C
         */
        return questionTenC.isChecked();
    }

}
