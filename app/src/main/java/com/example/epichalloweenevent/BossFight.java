package com.example.epichalloweenevent;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.Random;

public class BossFight extends AppCompatActivity {

Button uciekaj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss_fight);

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("O nie! Zostałeś zaatakowany przez poteżnego czaszkownika! Zabrał wszystkie twoje dynie!")
                .setCancelable(false)
                .setPositiveButton("Uciekaj!!!", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
        AlertDialog alert = builder.create();
        alert.show();


        uciekaj = findViewById(R.id.uciekaj);
        uciekaj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(BossFight.this, MainActivity.class);
                BossFight.this.startActivity(intent);
            }
        });









    }
}