package june.com.blissapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class first extends AppCompatActivity {

    // create variables
    public android.widget.ImageButton timerbutton;
    public android.widget. ImageButton songsbutton;
    public android.widget.ImageButton imagebutton;

    // create new init method
    public void init() {

        // assign variables to widgets on layout
        timerbutton = (ImageButton) findViewById(R.id.timer);
        songsbutton = (ImageButton) findViewById(R.id.songs);
        imagebutton = (ImageButton) findViewById(R.id.image);

        // checks if the button named timerbutton is clicked
        timerbutton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                // open to a new screen (second)
                Intent open_second = new Intent(first.this, second.class);
                startActivity(open_second);

            }
        });

        // checks if button named songsbutton is clicked
        songsbutton.setOnClickListener(new View.OnClickListener() {

            // open to a new screen (third)
            @Override
            public void onClick(View v) {
                Intent open_third = new Intent(first.this, third.class);
                startActivity(open_third);
            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set layout
        setContentView(R.layout.activity_first);

        // call init method
        init();


    }
}