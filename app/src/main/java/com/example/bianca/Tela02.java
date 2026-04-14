package com.example.bianca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela02 extends AppCompatActivity implements View.OnClickListener {

    private Button button4;
    private String nome;
    private String idade;
    private TextView Nome, Idade;
    private ImageView imagem1, imagem3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela02);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Intent i = getIntent();
        if (i != null){
            Bundle b = new Bundle();
            b = i.getExtras();
            if (b!= null){
            nome = b.getString("nome");
            idade = b.getString("idade");
            }
        }
        Nome = findViewById(R.id.textView7);
        Nome.setText(nome);
        Idade = findViewById(R.id.textView8);
        Idade.setText(idade);
        button4 = findViewById(R.id.button4);
        imagem1 = findViewById(R.id.imageView);
        imagem3 = findViewById(R.id.imageView2);

        imagem3.setOnClickListener(this);
        imagem1.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == button4)
        {




            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }
        {
        if (v == imagem1);
            {
                imagem1.setImageResource(R.drawable.imagem2);
            }
            {
                if (v == imagem3);
                {
                    imagem3.setImageResource(R.drawable.imagem4);
                }
            }
        }
    }
}