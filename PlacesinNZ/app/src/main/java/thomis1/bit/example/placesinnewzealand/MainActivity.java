package thomis1.bit.example.placesinnewzealand;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int questionNumber = 0;
    Question[] questions;
    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = (Button) findViewById(R.id.button);
        btnNext.setOnClickListener(this);
        setUpQuestions();
        showQuestion();
    }


    public void setUpQuestions() {
        Random rand = new Random();
        questions = new Question[5];
        int num1, num2, result;
        for (int i = 0; i < questions.length; i++) {
            questions[i] = new Question();

        }
    }

    /**
     * populate each question based on the current questionNumber
     */
    public void showQuestion() {
        TextView quest = (TextView) findViewById(R.id.textViewQuestion);
        quest.setText(questions[questionNumber].equation());
        EditText etAnswer = (EditText) findViewById(R.id.editText);
        etAnswer.setText("");
    }

    @Override
    public void onClick(View v) {
        if (questionNumber < questions.length) {
            EditText etAnswer = (EditText) findViewById(R.id.editText);
            int answer = Integer.parseInt(etAnswer.getText().toString());
            if (answer == questions[questionNumber].getAnswer()) {
                score++;
            } else {
                Toast.makeText(this, "Wrong", Toast.LENGTH_LONG).show();
            }

            questionNumber++;
            if (questionNumber < questions.length) {
                showQuestion();
            }

        } else {
            //go to a new activity screen
            Intent changeActivity = new Intent(MainActivity.this, Results.class);
            changeActivity.putExtra("results", score);
            startActivity(changeActivity);
        }
    }
}