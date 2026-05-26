package com.example.bianca;

import android.graphics.Color;
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

    private ImageView imagem3, imagem4, imagem5, imagem6, imagem7, imagem8, imagem9, imagem10;
    private ArrayList<Integer> lista;
    private Handler handler;
    private int contaToque =0;
    private int imagemPrimeiroToque, imagemSegundoToque;
    private ImageView imageView11, imageView12;
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
        imagem7 = findViewById(R.id.imageView7);
        imagem8 = findViewById(R.id.imageView8);
        imagem9 = findViewById(R.id.imageView9);
        imagem10 = findViewById(R.id.imageView10);


        imagem3.setOnClickListener(this);
        imagem4.setOnClickListener(this);
        imagem5.setOnClickListener(this);
        imagem6.setOnClickListener(this);
        imagem7.setOnClickListener(this);
        imagem8.setOnClickListener(this);
        imagem9.setOnClickListener(this);
        imagem10.setOnClickListener(this);

        lista = new ArrayList<Integer>();
        lista.add(R.drawable.imagem6);
        lista.add(R.drawable.imagem6);
        lista.add(R.drawable.imagem5);
        lista.add(R.drawable.imagem5);
        lista.add(R.drawable.imagem8);
        lista.add(R.drawable.imagem8);
        lista.add(R.drawable.imagem9);
        lista.add(R.drawable.imagem9);

        Collections.shuffle(lista);

        imagem3.setImageResource(lista.get(0));
        imagem4.setImageResource(lista.get(1));
        imagem5.setImageResource(lista.get(2));
        imagem6.setImageResource(lista.get(3));
        imagem7.setImageResource(lista.get(4));
        imagem8.setImageResource(lista.get(5));
        imagem9.setImageResource(lista.get(6));
        imagem10.setImageResource(lista.get(7));

        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                imagem3.setImageResource(R.drawable.imagem7);
                imagem4.setImageResource(R.drawable.imagem7);
                imagem5.setImageResource(R.drawable.imagem7);
                imagem6.setImageResource(R.drawable.imagem7);
                imagem7.setImageResource(R.drawable.imagem7);
                imagem8.setImageResource(R.drawable.imagem7);
                imagem9.setImageResource(R.drawable.imagem7);
                imagem10.setImageResource(R.drawable.imagem7);
            }
        }, 3000);
    }

    @Override
    public void onClick(View v) {
        contaToque++;
    if (imagem3 == v){

     imagem3.setImageResource(lista.get(0));
     imagem3.setEnabled(false);
     if (contaToque==1){
         imageView11 = imagem3;
         imagemPrimeiroToque = lista.get(0);
     } else {
         imageView12 = imagem3;
         imagemSegundoToque = lista.get(0);
         compara(imagemPrimeiroToque, imagemSegundoToque);
     }
    }

    if (imagem4 == v){
    imagem4.setImageResource(lista.get(1));
    imagem4.setEnabled(false);
    if (contaToque==1){
        imageView11 = imagem4;
        imagemPrimeiroToque = lista.get(1);
    } else {
        imageView12 = imagem4;
        imagemSegundoToque = lista.get(1);
        compara(imagemPrimeiroToque, imagemSegundoToque);
    }
    }
    if (imagem5 == v) {
        imagem5.setImageResource(lista.get(2));
        imagem5.setEnabled(false);
        if (contaToque == 1) {
            imageView11 = imagem5;
            imagemPrimeiroToque = lista.get(2);
        } else {
            imageView12 = imagem5;
            imagemSegundoToque = lista.get(2);
            compara(imagemPrimeiroToque, imagemSegundoToque);
        }
    }
    if (imagem6 == v){
     imagem6.setImageResource(lista.get(3));
     imagem6.setEnabled(false);
     if (contaToque==1){
         imageView11 = imagem6;
         imagemPrimeiroToque = lista.get(3);
     } else {
         imageView12 = imagem6;
         imagemSegundoToque = lista.get(3);
         compara(imagemPrimeiroToque, imagemSegundoToque);

     }
    }
    if (imagem7 == v){
      imagem7.setImageResource(lista.get(4));
      imagem7.setEnabled(false);
      if (contaToque==1){
          imageView11 = imagem7;
          imagemPrimeiroToque = lista.get(4);
      } else {
           imageView12 = imagem7;
           imagemSegundoToque = lista.get(4);
           compara(imagemPrimeiroToque, imagemSegundoToque);
      }
    }
    if (imagem8 == v){
        imagem8.setImageResource(lista.get(5));
        imagem8.setEnabled(false);
        if (contaToque==1) {
            imageView11=imagem8;
            imagemPrimeiroToque = lista.get(5);
        }else {
            imageView12=imagem8;
            imagemSegundoToque = lista.get(5);
            compara(imagemPrimeiroToque, imagemSegundoToque);
        }
    }
    if (imagem9 == v){
        imagem9.setImageResource(lista.get(6));
        imagem9.setEnabled(false);
        if (contaToque==1){
            imageView11= imagem9;
            imagemPrimeiroToque = lista.get(6);
        }else {
            imageView12 = imagem9;
            imagemSegundoToque = lista.get(6);
            compara(imagemPrimeiroToque, imagemSegundoToque);
        }
    }
    if (imagem10 == v){
        imagem10.setImageResource(lista.get(7));
        imagem10.setEnabled(false);
        if (contaToque==1){
            imageView11= imagem10;
            imagemPrimeiroToque =lista.get(7);
        }else {
            imageView12 = imagem10;
            imagemSegundoToque = lista.get(7);
            compara(imagemPrimeiroToque, imagemSegundoToque);
        }
    }

    }

    public void compara(int imagem1, int imagem2){
        contaToque=0;
        if (imagem1 == imagem2){

            imageView11.setBackgroundColor(Color.GREEN);
            imageView12.setBackgroundColor(Color.GREEN);

        }  else
        {
            imageView11.setBackgroundColor(Color.RED);
            imageView12.setBackgroundColor(Color.RED);
            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {

                    imageView11.setEnabled(true);
                    imageView12.setEnabled(true);

                    imageView11.setImageResource(R.drawable.imagem7);

                    imageView12.setImageResource(R.drawable.imagem7);
                    imageView11.setBackgroundColor(Color.WHITE);
                    imageView12.setBackgroundColor(Color.WHITE);
                }
            }, 2000);
        }
    }
}
