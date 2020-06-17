package thomis1.bit.example.placesinnewzealand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
/**
 * @author Isaac Thomas
 * @date 17/6/2020
 * The Results activity shows the user their score and thanks them for playing.
 * The score is passed through from the main activity.
 */
public class Results extends AppCompatActivity {
    /**
     * Shows the results screen including textview and
     * displays the score that the user received
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        //get the intent
        Intent howIgotHere = getIntent();
        int score = howIgotHere.getIntExtra("results", -1);
        TextView tv = (TextView) findViewById(R.id.textViewResult);
        tv.setText(score + " out of 10");
    }

}
