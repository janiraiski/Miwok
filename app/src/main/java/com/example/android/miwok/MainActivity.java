package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.example.android.miwok.R.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(layout.activity_main);

        // Find every View for every category
        TextView numbers = findViewById(R.id.numbers);
        TextView family = findViewById(R.id.family);
        TextView colors = findViewById(R.id.colors);
        TextView phrases = findViewById(R.id.phrases);

        // Set a click listener on that View
        numbers.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                // In this case, intent is used to launch another activity
                Intent numbersIntent = new Intent(MainActivity.this,
                        NumbersActivity.class);
                startActivity(numbersIntent);
            }
        });

        // Set a click listener on that View
        family.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family View is clicked on.
            @Override
            public void onClick(View view) {
                // In this case, intent is used to launch another activity
                Intent familyIntent = new Intent(MainActivity.this,
                        FamilyActivity.class);
                startActivity(familyIntent);
            }
        });

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors View is clicked on.
            @Override
            public void onClick(View view) {
                // In this case, intent is used to launch another activity
                Intent colorsIntent = new Intent(MainActivity.this,
						ColorsActivity.class);
                startActivity(colorsIntent);
            }
        });

        // Set a click listener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases View is clicked on.
            @Override
            public void onClick(View view) {
                // In this case, intent is used to launch another activity
                Intent phrasesIntent = new Intent(MainActivity.this,
						PhrasesActivity.class);
                startActivity(phrasesIntent);
            }
        });



    }
}
