package ie.ul.dave.hellobutton;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mMessageTextView;
    private int mCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        //Called when app launches
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Code to be added
        mMessageTextView = findViewById(R.id.message_textview);
        //mMessageTextView.setText("Dave is cool");
        //Log.d( "HelloButton", "Hello Button Log");
    }

        public void handleDecrement(View view){
            mCounter -= 1;
            updateView();
        }

        public void handleIncrement(View view){
            mCounter += 1;
            updateView();
        }
        public void handleReset(View view){
            mCounter = 0;
            updateView();
        }

        private void updateView(){
            mMessageTextView.setText(getString(R.string.message_format, mCounter));

            if (mCounter > 10) {
                mMessageTextView.setVisibility(View.INVISIBLE);
            }else {
                mMessageTextView.setVisibility(View.VISIBLE);
            }

        }


    }


