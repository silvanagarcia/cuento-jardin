package com.example.cuento;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class menucuento extends AppCompatActivity {

    private boolean button1Pressed = false;
    private boolean button2Pressed = false;
    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cuento);

        Button cuento = findViewById(R.id.cuento);
        Button animales = findViewById(R.id.animales);

        mediaPlayer = MediaPlayer.create(this, R.raw.yosoypanguitruz);

        cuento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menucuento.this, reproductor.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual
            }
        });

        animales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menucuento.this, animales.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual
            }
        });

        //Boton Volver atras
        ImageView imageViewBack = findViewById(R.id.atras2);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(menucuento.this, MainActivity.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual
            }
        });
    }

    //private void checkButtonsPressed() {
        //if (button1Pressed && button2Pressed) {
            // Si ambos botones han sido presionados, lanzar la nueva actividad
            //Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            //startActivity(intent);
       // }
    //}
}
