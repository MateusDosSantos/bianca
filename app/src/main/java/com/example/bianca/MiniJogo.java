package com.example.bianca;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Collections;

public class MiniJogo extends AppCompatActivity implements View.OnClickListener{

    private ImageView imagem3, imagem4, imagem5, imagem6;
    private ArrayList<Integer> lista;
    private Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_mini_jogo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        imagem3 = findViewById(R.id.imageView3);
        imagem4 = findViewById(R.id.imageView4);
        imagem5 = findViewById(R.id.imageView5);
        imagem6 = findViewById(R.id.imageView6);

        imagem3.setOnClickListener(this);
        imagem4.setOnClickListener(this);
        imagem5.setOnClickListener(this);
        imagem6.setOnClickListener(this);

        lista = new ArrayList<Integer>();
        lista.add(R.drawable.imagem6);
        lista.add(R.drawable.imagem6);
        lista.add(R.drawable.imagem5);
        lista.add(R.drawable.imagem5);

        Collections.shuffle(lista);

        imagem3.setImageResource(lista.get(0));
        imagem4.setImageResource(lista.get(1));
        imagem5.setImageResource(lista.get(2));
        imagem6.setImageResource(lista.get(3));

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imagem3.setImageResource(R.drawable.imagem7);
                imagem4.setImageResource(R.drawable.imagem7);
                imagem5.setImageResource(R.drawable.imagem7);
                imagem6.setImageResource(R.drawable.imagem7);
            }
        }, 3000);
    }

    @Override
    public void onClick(View v) {

    }
}