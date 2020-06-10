package thomis1.bit.example.placesinnewzealand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button buttonOne = findViewById(R.id.buttonStart);
        buttonOne.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent changeActivity = new Intent(Menu.this, MainActivity.class);
                startActivity(changeActivity);
            }
        });
    }

    @Override
    public void onClick(View v) {

    }
}

