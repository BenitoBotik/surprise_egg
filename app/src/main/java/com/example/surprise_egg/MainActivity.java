package com.example.surprise_egg;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counter = 10;
    }

    public void knock(View view) {
        if (counter > 0) {
            counter--;
            TextView counterTextView = findViewById(R.id.textview_counter);
            counterTextView.setText(String.valueOf(counter));
            if (counter == 0) {
                ImageView eggImageView = findViewById(R.id.imageview_egg);
                eggImageView.setImageResource(R.drawable.rick);
                counterTextView.setText("Rick Rolled!");
            }
        }
    }

    public void reset(View view) {
        counter = 10;
        TextView counterTextView = findViewById(R.id.textview_counter);
        counterTextView.setText(String.valueOf(counter));
        ImageView eggImageView = findViewById(R.id.imageview_egg);
        eggImageView.setImageResource(R.drawable.egg);
    }
}