package thomis1.bit.example.placesinnewzealand;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
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
    TextView iv1;
    TextView iv2;
    TextView iv3;
    TextView iv4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnNext = (Button) findViewById(R.id.button);
        btnNext.setOnClickListener(this);
        setUpQuestions();
        showQuestion();
        setContentView(R.layout.activity_main);
        iv1 = (TextView) findViewById(R.id.textView1);
        iv1.setOnClickListener(this);
        iv2 = (TextView) findViewById(R.id.textView2);
        iv2.setOnClickListener(this);
        iv3 = (TextView) findViewById(R.id.textView3);
        iv3.setOnClickListener(this);
        iv4 = (TextView) findViewById(R.id.textView4);
        iv4.setOnClickListener(this);
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
        ////
        if (v.getId()==R.id.textView1) {
            iv1.setGravity(Gravity.CENTER);
            iv1.setBackground(null);
            iv1.setText("Wrong\nbeef\nCarne de res");
        }
        else   if (v.getId()==R.id.textView2)
        {
            iv2.setGravity(Gravity.CENTER);
            iv2.setBackground(null);
            iv2.setText("Wrong\nchicken\nRoasted");
        }
        else   if (v.getId()==R.id.textView3)
        {
            iv3.setGravity(Gravity.CENTER);
            iv3.setBackground(null);
            iv3.setText("Wrong\nlamb");
        }
        else   if (v.getId()==R.id.textView4)
        {
            iv4.setGravity(Gravity.CENTER);
            iv4.setBackground(null);
            iv4.setText("Correct\nGuinea Pig");
        }
    }
}