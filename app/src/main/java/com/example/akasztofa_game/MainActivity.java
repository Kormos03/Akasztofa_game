package com.example.akasztofa_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends AppCompatActivity {

    private Button minusButton;
    private TextView tipptextView;
    private Button plusButton;
    private Button tippButton;
    private ImageView imageView;
    private TextView wordtextView;
    public int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        String[] words = {"asd","asdfg", "asdfgg"};
        tippButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tipptextView.setText(words[1]);
            }
        });
        String[] character = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "j", "m", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void init()
    {
        minusButton = findViewById(R.id.minusButton);
        tipptextView = findViewById(R.id.tipptextView);
        plusButton = findViewById(R.id.plusButton);
        tippButton = findViewById(R.id.tippButton);
        imageView = findViewById(R.id.imageView);
        wordtextView = findViewById(R.id.wordtextView);
    }
}