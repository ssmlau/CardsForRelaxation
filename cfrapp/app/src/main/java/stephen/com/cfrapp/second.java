package june.com.blissapp;
import android.os.CountDownTimer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import java.util.Random;


public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // set layout to second activity
        setContentView(R.layout.activity_second);

        // create variables
        final Button pick_activity;
        final TextView activitytext;

        // set variables to widgets on the the layout
        activitytext = (TextView) findViewById(R.id.newact);
        pick_activity = (Button) findViewById(R.id.pick);

        // create a list of potential activities the user can do
        final String[] listofoptions = new String[]{"Smile", "Laugh", "Giggle", "Grin"};

        // checks if input is valid then if button is clicked
        assert pick_activity != null;
        pick_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (activitytext != null) {

                    // picks a random number
                    Random rand = new Random();
                    int rand_num = rand.nextInt((3) + 1);

                    // picks a random word from the list of options
                    activitytext.setText(listofoptions[rand_num]);

                }
            }
        });

        // create variables
        final Button button;
        final TextView text1;

        // set variables to widgets on the the layout
        text1 = (TextView) findViewById(R.id.timer);
        button = (Button) findViewById(R.id.startbutton);

        // checks if input is valid then if button is clicked
        if (button != null) {
            button.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {

                    // create a new countdown timer (lasts 10 seconds)
                    new CountDownTimer(10000, 100) {
                        public void onTick(long millisUntilFinished) {
                            if (text1 != null) {

                                // allow the numbers of the countdown appear on the screen
                                text1.setText(String.valueOf(millisUntilFinished / 1000));

                            }
                        }

                        // when the countdown is finished, set it back to 10
                        public void onFinish() {
                            if (text1 != null) {
                                String string = getString(R.string.ten1);
                                text1.setText(string);
                            }
                        }

                        // start the countdown
                    }.start();
                }
            });
        }
    }
}