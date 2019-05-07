package june.com.blissapp;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.ImageButton;

public class third extends AppCompatActivity {

    // defines variables
    public android.widget.ImageButton passenger_button;
    public android.widget.ImageButton adele_button;
    public android.widget.ImageButton viva_button;
    public android.widget.ImageButton maroon_button;

    // create init method
    public void init() {

        // set variables to existing widgets
        passenger_button = (ImageButton) findViewById(R.id.passenger);
        adele_button = (ImageButton) findViewById(R.id.adele);
        viva_button = (ImageButton) findViewById(R.id.viva);
        maroon_button = (ImageButton) findViewById(R.id.maroon);

        // when this button is clicked, launch the youtube link
        // this is the same for all the buttons
        passenger_button.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.youtube.com/watch?v=RBumgq5yVrA");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        adele_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.youtube.com/watch?v=hLQl3WQQoQ0");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        viva_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.youtube.com/watch?v=dvgZkm1xWPE");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);


            }
        });

        maroon_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("https://www.youtube.com/watch?v=cL4uhaQ58Rk");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set the layout to third activity
        setContentView(R.layout.activity_third);

        // call the init method
        init();


    }
}