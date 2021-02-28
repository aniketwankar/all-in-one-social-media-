package com.example.webstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView fb, inta , twitter , youtube , google ,flipkart ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fb = findViewById(R.id.fb);
        inta =findViewById(R.id.inta);
        twitter=findViewById(R.id.twitter);
        youtube =findViewById(R.id.youtube);
        google =findViewById(R.id.google);
        flipkart =findViewById(R.id.flipkart);

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,facebook.class);
                startActivity(intent);

            }
        });


        inta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,intagram.class);
                startActivity(intent);

            }






        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,twitter.class);
                startActivity(intent);

            }
        });


        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,youtube.class);
                startActivity(intent);

            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,google.class);
                startActivity(intent);

            }
        });

        flipkart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,flipkart.class);
                startActivity(intent);

            }
        });






    }
}