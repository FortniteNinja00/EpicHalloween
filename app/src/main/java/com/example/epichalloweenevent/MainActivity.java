package com.example.epichalloweenevent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.vcn.VcnUnderlyingNetworkTemplate;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button main;
    TextView score;
    int dynie = 0;
    int moc = 1;
    Random random;
    Intent intent;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        main = findViewById(R.id.button);
        score = findViewById(R.id.textView);


        main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int rng = rand.nextInt((100 - 1) + 1) + 1;

                if(rng == 100){
                    Intent intent = new Intent(MainActivity.this, BossFight.class);
                    MainActivity.this.startActivity(intent);
                }

                dynie += moc;
                score.setText(dynie + "🎃");


            }
        });



    }
}