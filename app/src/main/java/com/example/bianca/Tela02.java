package com.example.bianca;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela02 extends AppCompatActivity implements View.OnClickListener {

    private Button button4;
    private String nome;
    private String idade;

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

        button4 = findViewById(R.id.button4);

        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == button4)
        {




            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);

        }

    }
}