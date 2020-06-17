package thomis1.bit.example.placesinnewzealand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * @author Isaac Thomas
 * @date 17/6/2020
 * The Menu class is used to show a menu screen before the app starts,
 * to allow the user some time to learn the rules of the application before they play it.
 * There is a start button to move to the mainactivity class.
 */
public class Menu extends AppCompatActivity implements View.OnClickListener {

    /**
     * creates the menu activity and assigns the start button to move to the main activity
     * when it is pressed.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button buttonStart = findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener() {

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

