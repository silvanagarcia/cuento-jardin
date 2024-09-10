package com.example.cuento;
import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class animales extends AppCompatActivity {

    private MediaPlayer caballo;
    private MediaPlayer chancho;
    private MediaPlayer elefante;
    private MediaPlayer gallo;
    private MediaPlayer gato;
    private MediaPlayer hornero;
    private MediaPlayer leon;
    private MediaPlayer lobo;
    private MediaPlayer mono;
    private MediaPlayer oveja;
    private MediaPlayer paloma;
    private MediaPlayer pavo;
    private MediaPlayer pato;
    private MediaPlayer perro;
    private MediaPlayer vaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animales);

        // Inicializa el MediaPlayer con el archivo de audio
        caballo = MediaPlayer.create(this, R.raw.caballo);
        chancho = MediaPlayer.create(this, R.raw.chancho);
        elefante = MediaPlayer.create(this, R.raw.elefante);
        gallo = MediaPlayer.create(this, R.raw.gallo);
        gato = MediaPlayer.create(this, R.raw.gato);
        hornero = MediaPlayer.create(this, R.raw.hornero);
        leon = MediaPlayer.create(this, R.raw.leon);
        lobo = MediaPlayer.create(this, R.raw.lobo);
        mono = MediaPlayer.create(this, R.raw.mono);
        oveja = MediaPlayer.create(this, R.raw.oveja);
        paloma = MediaPlayer.create(this, R.raw.paloma);
        pavo = MediaPlayer.create(this, R.raw.pavo);
        pato = MediaPlayer.create(this, R.raw.pato);
        perro = MediaPlayer.create(this, R.raw.perro);
        vaca = MediaPlayer.create(this, R.raw.vaca);

        // Configura la ImageView del Caballo
        ImageView caballoimageView = findViewById(R.id.caballo);
        caballoimageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (caballo != null) {
                    caballo.start();
                }
            }
        });

        // Configura la ImageView del Chancho
        ImageView canchoImageView = findViewById(R.id.chancho);
        canchoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chancho != null) {
                    chancho.start();
                }
            }
        });

        // Configura la ImageView del Elefante
        ImageView elefanteImageView = findViewById(R.id.elefante);
        elefanteImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (elefante != null) {
                    elefante.start();
                }
            }
        });

        // Configura la ImageView del Gallo
        ImageView galloImageView = findViewById(R.id.gallo);
        galloImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gallo != null) {
                    gallo.start();
                }
            }
        });

        // Configura la ImageView del Gato
        ImageView gatoImageView = findViewById(R.id.gato);
        gatoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (gato != null) {
                    gato.start();
                }
            }
        });


        // Configura la ImageView del Hornero
        ImageView horneroImageView = findViewById(R.id.hornero);
        horneroImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (hornero != null) {
                    hornero.start();
                }
            }
        });

        // Configura la ImageView del Leon
        ImageView leonImageView = findViewById(R.id.leon);
        leonImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (leon != null) {
                    leon.start();
                }
            }
        });

        // Configura la ImageView del Lobo
        ImageView loboImageView = findViewById(R.id.lobo);
        loboImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (lobo != null) {
                    lobo.start();
                }
            }
        });

        // Configura la ImageView del Mono
        ImageView monoImageView = findViewById(R.id.mono);
        monoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mono != null) {
                    mono.start();
                }
            }
        });

        // Configura la ImageView del Oveja
        ImageView ovejaImageView = findViewById(R.id.oveja);
        ovejaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (oveja != null) {
                    oveja.start();
                }
            }
        });

        // Configura la ImageView del Paloma
        ImageView palomaImageView = findViewById(R.id.paloma);
        palomaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (paloma != null) {
                    paloma.start();
                }
            }
        });

        // Configura la ImageView del Pavo
        ImageView pavoImageView = findViewById(R.id.pavo);
        pavoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pavo != null) {
                    pavo.start();
                }
            }
        });

        // Configura la ImageView del Pato
        ImageView patoImageView = findViewById(R.id.pato);
        patoImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pato != null) {
                    pato.start();
                }
            }
        });

        // Configura la ImageView del Perro
        ImageView perroImageView = findViewById(R.id.perro);
        perroImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (perro != null) {
                    perro.start();
                }
            }
        });

        // Configura la ImageView del Vaca
        ImageView vacaImageView = findViewById(R.id.vaca);
        vacaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (vaca != null) {
                    vaca.start();
                }
            }
        });


        //Boton Volver atras
        ImageView imageViewBack = findViewById(R.id.atras);
        imageViewBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (caballo != null) {
            caballo.release(); // Libera los recursos del MediaPlayer
            caballo = null;
        }
        if (chancho != null) {
            chancho.release();
            chancho = null;
        }
        if (elefante != null) {
            elefante.release();
            elefante = null;
        }
        if (gallo != null) {
            gallo.release();
            gallo = null;
        }
        if (gato != null) {
            gato.release();
            gato = null;
        }
        if (hornero != null) {
            hornero.release();
            hornero = null;
        }
        if (leon != null) {
            leon.release();
            leon = null;
        }
        if (lobo != null) {
            lobo.release();
            lobo = null;
        }
        if (mono != null) {
            mono.release();
            mono = null;
        }
        if (oveja != null) {
            oveja.release();
            oveja = null;
        }
        if (paloma != null) {
            paloma.release();
            paloma = null;
        }
        if (pavo != null) {
            pavo.release();
            pavo = null;
        }
        if (pato != null) {
            pato.release();
            pato = null;
        }
        if (perro != null) {
            perro.release();
            perro = null;
        }
        if (vaca != null) {
            vaca.release();
            vaca = null;
        }
    }
}


