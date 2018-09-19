package com.example.santi.scorecounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WinnerActivity extends AppCompatActivity {

    String a;
    TextView teamA;
    TextView teamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);


        teamA = (TextView) findViewById(R.id.winnerPoints);
        Bundle b1 = getIntent().getExtras();
        Integer s1 = Integer.parseInt(b1.getString("A"));

    //////////////////////////////////////////////////////

        teamB = (TextView) findViewById(R.id.winnerPoints);
        Bundle b2 = getIntent().getExtras();
        Integer s2 = Integer.parseInt(b2.getString("B"));

    ////////////////////////////////////////////
        int s3 = s1 - s2;
        int s4 = s2 - s1;

    //////////////////////////////////////////////////////////
        if (s1 == 5) {
            if ((s1 - s2) > 1) {

                teamA.setText("Team A has won by " + s3 + " points");

            } else {
                teamA.setText("Team A has won by " + s3 + " point");
            }
        } else {
            if ((s2 - s1) > 1) {
                teamB.setText("Team B has won by " + s4 + " points");
            } else {
                teamB.setText("Team B has won by " + s4 + " point");
            }
        }

    }

    ///////////////////////////////////////////////////////////
        public void button (View view){

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        }



    }
