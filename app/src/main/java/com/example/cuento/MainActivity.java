package com.example.cuento;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inicializa el MediaPlayer con la música de fondo
        mediaPlayer = MediaPlayer.create(this, R.raw.race);
        mediaPlayer.setLooping(true); // Reproduce la música en bucle
        mediaPlayer.start();

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) ImageView imageView = findViewById(R.id.inicio);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Detén la música y avanza a la siguiente actividad
                mediaPlayer.stop();
                mediaPlayer.release();
                mediaPlayer = null;

                //Inicia la actividad del cuento
                Intent intent = new Intent(MainActivity.this, menucuento.class);
                startActivity(intent);
                finish(); // Finaliza la actividad actual
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Asegúrate de liberar el MediaPlayer si aún está en uso
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}