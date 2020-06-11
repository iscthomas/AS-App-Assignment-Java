package thomis1.bit.example.placesinnewzealand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Results extends AppCompatActivity {

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
