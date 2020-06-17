package thomis1.bit.example.placesinnewzealand;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    int questionNumber = 0;
    ArrayList<Question> questions = new ArrayList<Question>();
    int score = 0;
    TextView iv1;
    TextView iv2;
    TextView iv3;
    TextView iv4;
    TextView question;
    Boolean correct = true;
    TextView textWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        iv1 = (TextView) findViewById(R.id.textView1);
        iv1.setOnClickListener(this);
        iv2 = (TextView) findViewById(R.id.textView2);
        iv2.setOnClickListener(this);
        iv3 = (TextView) findViewById(R.id.textView3);
        iv3.setOnClickListener(this);
        iv4 = (TextView) findViewById(R.id.textView4);
        iv4.setOnClickListener(this);
        question = (TextView) findViewById(R.id.textViewQuestion);
        textWrong = (TextView) findViewById(R.id.textViewWrong);

        setUpQuestions();
        showQuestion();
    }


    public void setUpQuestions() {
        questions.add(new Question(R.drawable.townhall, R.drawable.anglican, R.drawable.larnarch, R.drawable.firstchurch, R.id.textView2, "Click on the Picture of the Anglican Church", "Town Hall", "Anglican Church", "Larnarch Castle", "First Church"));
        questions.add(new Question(R.drawable.octagon, R.drawable.stkilda, R.drawable.stclair, R.drawable.baldwinst, R.id.textView4, "Click on the Picture of Baldwin Street", "Octagon", "St Kilda Beach", "St Clair Beach", "Baldwin Street"));
        questions.add(new Question(R.drawable.anglican, R.drawable.otagouni, R.drawable.firstchurch, R.drawable.larnarch, R.id.textView3, "Click on the Picture of the First Church", "Anglican Church", "Otago University", "First Church", "Larnarch Castle"));
        questions.add(new Question(R.drawable.otagouni, R.drawable.firstchurch, R.drawable.larnarch, R.drawable.townhall, R.id.textView3, "Click on the Picture of the Larnarch Castle", "Otago University", "First Church", "Larnarch Castle", "Town Hall"));
        questions.add(new Question(R.drawable.octagon, R.drawable.baldwinst, R.drawable.trainstation, R.drawable.stclair, R.id.textView1, "Click on the Picture of the Octagon", "Octagon", "Baldwin Street", "Train Station", "St Clair Beach"));
        questions.add(new Question(R.drawable.townhall, R.drawable.otagouni, R.drawable.larnarch, R.drawable.trainstation, R.id.textView2, "Click on the Picture of Otago University", "Town Hall", "Otago University", "Larnarch Castle", "Train Station"));
        questions.add(new Question(R.drawable.baldwinst, R.drawable.stkilda, R.drawable.octagon, R.drawable.stclair, R.id.textView4, "Click on the Picture of St Clair Beach", "Baldwin Street", "St Kilda Beach", "Octagon", "St Clair Beach"));
        questions.add(new Question(R.drawable.stclair, R.drawable.baldwinst, R.drawable.stkilda, R.drawable.octagon, R.id.textView3, "Click on the Picture of St Kilda Beach", "St Clair Beach", "Baldwin Street", "St Kilda Beach", "The Octagon"));
        questions.add(new Question(R.drawable.anglican, R.drawable.townhall, R.drawable.otagouni, R.drawable.trainstation, R.id.textView2, "Click on the Picture of the Town Hall", "Anglican Church", "Town Hall", "Otago University", "Train Station"));
        questions.add(new Question(R.drawable.trainstation, R.drawable.anglican, R.drawable.otagouni, R.drawable.octagon, R.id.textView1, "Click on the Picture of the Dunedin Train Station", "Train Station", "Anglican Church", "Otago University", "Octagon"));
        Collections.shuffle(questions);

    }

    /**
     * populate each question based on the current questionNumber
     */
    public void showQuestion() {
        iv1.setBackgroundResource(questions.get(questionNumber).getPicture1());
        iv2.setBackgroundResource(questions.get(questionNumber).getPicture2());
        iv3.setBackgroundResource(questions.get(questionNumber).getPicture3());
        iv4.setBackgroundResource(questions.get(questionNumber).getPicture4());
        textWrong.setText("");
        question.setText(questions.get(questionNumber).getQuestion());
        correct = true;
    }

    @Override
    public void onClick(View v) {
        if (questionNumber < 10) {
            if (v.getId() == R.id.textView1) {
                if (R.id.textView1 == questions.get(questionNumber).getAnswer()) {
                    if (correct) {
                        score++;
                    }
                    questionNumber++;
                    if (questionNumber < 10) {
                        showQuestion();
                    }
                } else {
                    iv1.setGravity(Gravity.CENTER);
                    iv1.setBackgroundResource(R.drawable.wrong);
                    textWrong.setText("Wrong, that was the " + questions.get(questionNumber).getResponse1());
                    correct = false;
                }
            } else if (v.getId() == R.id.textView2) {
                if (R.id.textView2 == questions.get(questionNumber).getAnswer()) {
                    if (correct) {
                        score++;
                    }
                    questionNumber++;
                    if (questionNumber < 10) {
                        showQuestion();
                    }
                } else {
                    iv2.setGravity(Gravity.CENTER);
                    iv2.setBackgroundResource(R.drawable.wrong);
                    textWrong.setText("Wrong, that was the " + questions.get(questionNumber).getResponse2());
                    correct = false;
                }
            } else if (v.getId() == R.id.textView3) {
                if (R.id.textView3 == questions.get(questionNumber).getAnswer()) {
                    if (correct) {
                        score++;
                    }
                    questionNumber++;
                    if (questionNumber < 10) {
                        showQuestion();
                    }
                } else {
                    iv3.setGravity(Gravity.CENTER);
                    iv3.setBackgroundResource(R.drawable.wrong);
                    textWrong.setText("Wrong, that was the " + questions.get(questionNumber).getResponse3());
                    correct = false;
                }
            } else if (v.getId() == R.id.textView4) {
                if (R.id.textView4 == questions.get(questionNumber).getAnswer()) {
                    if (correct) {
                        score++;
                    }
                    questionNumber++;
                    if (questionNumber < 10) {
                        showQuestion();
                    }
                } else {
                    iv4.setGravity(Gravity.CENTER);
                    iv4.setBackgroundResource(R.drawable.wrong);
                    textWrong.setText("Wrong, that was the " + questions.get(questionNumber).getResponse4());
                    correct = false;
                }
            }
        } else {
            //go to a new activity screen
            Intent changeActivity = new Intent(MainActivity.this, Results.class);
            changeActivity.putExtra("results", score);
            startActivity(changeActivity);
        }
    }
}