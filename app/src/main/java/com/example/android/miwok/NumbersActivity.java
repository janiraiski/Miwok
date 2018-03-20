package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_numbers);

		ArrayList<String> words = new ArrayList<String>();
		words.add(0, "one");
		words.add(1, "two");
		words.add(2, "three");
		words.add(3, "four");
		words.add(4, "five");
		words.add(5, "six");
		words.add(6, "seven");
		words.add(7, "eight");
		words.add(8, "nine");
		words.add(9, "ten");

        ArrayAdapter<String> itemsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

		// Makes a variable from the activity_numbers.xml root view
		LinearLayout rootView = findViewById(R.id.rootView);


		int index = 0;

		while (index < words.size())
		{
			TextView wordView = new TextView(this);
			wordView.setText(words.get(index));

			// Adding wordView as a child of rootView
			rootView.addView(wordView);

			index++;
		}
	}
}
