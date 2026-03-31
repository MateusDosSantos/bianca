package com.example.bianca;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView TextView, TextView2;
    private Button Button, Button2;
    private EditText texto;
    private EditText texto2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView = findViewById(R.id.textView);
        TextView2 = findViewById(R.id.textView2);
        Button = findViewById(R.id.button);
        Button2 = findViewById(R.id.button2);

        texto = findViewById(R.id.texto);
        texto2 = findViewById(R.id.texto2);

        Button.setOnClickListener(this);
        Button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == Button) {
            TextView.setBackgroundColor(Color.GREEN);
            TextView2.setBackgroundColor(Color.BLUE);
        }
        if (v == Button2) {
            TextView.setTextColor(Color.RED);
            TextView2.setTextColor(Color.RED);

            String nomeCapturado;
            nomeCapturado = texto.getText().toString();
            TextView2.setText(nomeCapturado);

            String nomeCapturado2;
            nomeCapturado2 = texto2.getText().toString();
                    TextView.setText(nomeCapturado2);
        }
    }
}
