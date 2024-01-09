package com.example.demo0801;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int x;
    ImageView iv;
    Random rnd = new Random();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = findViewById(R.id.imageView);
        iv.setImageResource(R.drawable.ic_launcher_background);
        btn = findViewById(R.id.button);
    }


    public void clicked(View view) {
        x = rnd.nextInt(3) + 1;
        btn.setText("This is picture number: " + x);

        if (x == 1)
        {
            iv.setImageResource(R.drawable.androidone);
        }
        else if (x == 2)
        {
            iv.setImageResource(R.drawable.pokemontwo);
        }
        else if (x == 3)
        {
            iv.setImageResource(R.drawable.minionsthree);
        }
    }

}