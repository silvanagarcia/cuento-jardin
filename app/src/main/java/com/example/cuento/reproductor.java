package com.example.cuento;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class reproductor extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    private boolean isPlaying = false;
    private ImageView playPauseButton;
    private ImageView loopButton;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.reproductor);

        playPauseButton = findViewById(R.id.PlayPause);
        loopButton = findViewById(R.id.Loop);

        // Inicializa el MediaPlayer con la canción
        mediaPlayer = MediaPlayer.create(this, R.raw.yosoypanguitruz);

        // Listener para cuando el audio termina de reproducirse
        mediaPlayer.setOnCompletionListener(mp -> resetMediaPlayer());
    }

    // Método para reproducir o pausar la canción
    public void playPause(View view) {
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

    // Método para detener la reproducción y resetear el MediaPlayer
    public void stop(View view) {
        if (isPlaying) {
            mediaPlayer.stop();
            resetMediaPlayer();
        }
    }

    // Método para activar o desactivar el modo de repetición
    public void toggleLoop(View view) {
        boolean isLooping = mediaPlayer.isLooping();
        mediaPlayer.setLooping(!isLooping);
        loopButton.setBackgroundResource(isLooping ? R.drawable.no_repetir : R.drawable.repetir);
    }

    // Método para resetear el MediaPlayer después de detener o terminar la canción
    private void resetMediaPlayer() {
        mediaPlayer.reset();
        mediaPlayer = MediaPlayer.create(this, R.raw.yosoypanguitruz);
        playPauseButton.setBackgroundResource(R.drawable.reproducir);
        isPlaying = false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
