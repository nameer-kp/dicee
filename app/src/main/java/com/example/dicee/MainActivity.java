package com.example.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.media.audiofx.DynamicsProcessing;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

import com.example.Dicee.R;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.Dicee.R.layout.activity_main);
        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollbutton);
        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftdice);
        final ImageView rightDice = (ImageView) findViewById(com.example.Dicee.R.id.image_rightdice);
        final int dicearray [] = {com.example.Dicee.R.drawable.dice1,com.example.Dicee.R.drawable.dice2,com.example.Dicee.R.drawable.dice3,
                com.example.Dicee.R.drawable.dice4,
                com.example.Dicee.R.drawable.dice5,
                com.example.Dicee.R.drawable.dice6};
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tag="hello";
                Log.d(tag,"button pressed");
                Random randomnumberGen = new Random();          //Random number Generator
                int number = randomnumberGen.nextInt(6);
                int number1 = randomnumberGen.nextInt(6);//getting Number the random numbers
                Log.d("dice", "ran number is: " +number);
                leftDice.setImageResource(dicearray[number]);
                rightDice.setImageResource(dicearray[number1]);

            }
        });
    }
}
