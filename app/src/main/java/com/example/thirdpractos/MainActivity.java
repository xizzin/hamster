package com.example.thirdpractos;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private TextView score_string;
    private ImageButton hamster;
    private int score_int;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        score_string = findViewById(R.id.scoreText);
        hamster = findViewById(R.id.hamsterIMG);

        hamster.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                score_int++;
                score_string.setText("Очки: " + score_int);
            }
        });
    }
}