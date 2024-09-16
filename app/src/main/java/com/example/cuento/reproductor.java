package com.example.cuento;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class reproductor extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private boolean isPlaying = false;
    private ImageView playPauseButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reproductor);

        playPauseButton = findViewById(R.id.PlayPause);

        // Inicializa el MediaPlayer con la canción
        mediaPlayer = MediaPlayer.create(this, R.raw.yosoypanguitruz);

        // Listener para cuando el audio termina de reproducirse
        mediaPlayer.setOnCompletionListener(mp -> resetMediaPlayer());

        //Metodo para Play y pausa
        ImageView playimageView = findViewById(R.id.PlayPause);
        playimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isPlaying) {
                    mediaPlayer.start();
                    playPauseButton.setBackgroundResource(R.drawable.pausa);
                    isPlaying = true;
                } else {
                    mediaPlayer.pause();
                    playPauseButton.setBackgroundResource(R.drawable.reproducir);
                    isPlaying = false;
                }
            }
        });

        // Método para detener la reproducción y resetear el MediaPlayer
        ImageView stopimageView = findViewById(R.id.Stop);
        stopimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isPlaying) {
                    mediaPlayer.stop();
                    resetMediaPlayer();
                }
            }
        });

        //Boton Volver atras
        ImageView imageViewBack = findViewById(R.id.atras3);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(reproductor.this, menucuento.class);
                startActivity(intent);
                mediaPlayer.stop();
                resetMediaPlayer();
                finish(); // Finaliza la actividad actual
            }
        });


    }

    // Método para resetear el MediaPlayer después de detener o terminar la canción
    private void resetMediaPlayer() {
        mediaPlayer.reset();
        mediaPlayer = MediaPlayer.create(this, R.raw.yosoypanguitruz);
        playPauseButton.setBackgroundResource(R.drawable.reproducir);
        isPlaying = false;
    }
}
