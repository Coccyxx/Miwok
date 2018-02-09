package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

      //Using Array for storing number words
        String[] words=new String[10];
        words[0]="one";
        words[1]="two";
        words[2]="three";
        words[3]="four";
        words[4]="five";
        words[5]="six";
        words[6]="seven";
        words[7]="eight";
        words[8]="nine";
        words[9]="ten";

//        for (int i=0;i<10;i++) {
//            Log.v("NumbersActivity", "Word at index " + i + ": " + words[i]);
//        }

    // Using an ArrayList

        ArrayList<String> numberWords=new ArrayList<>();

        for (int i=0;i<words.length;i++) {
            numberWords.add(words[i]);
            Log.i("NumberActivity", "Word at index " + i + " of the ArrayList: " + numberWords.get(i));
        }

        //Find the root view of the whole layout
        LinearLayout rootView= (LinearLayout) findViewById(R.id.rootView);

        //Create a new {@link TextView} that displayed the word at the
        TextView wordView;

        //Setup counter variable. Create a variable to keep track of the current index position
//        int index=0;

        //using a while loop
/*
        while (index<numberWords.size()) {
            wordView=new TextView(this);
            wordView.setText(numberWords.get(index));
            //add the TextView as a child to the rootView
            rootView.addView(wordView);
            //Updating the counter variable
            index++;
        }
*/

        //using a for loop

        for (int index=0;index<numberWords.size();index++) {
            wordView=new TextView(this);
            wordView.setText(numberWords.get(index));
            rootView.addView(wordView);
        }


    }
}
