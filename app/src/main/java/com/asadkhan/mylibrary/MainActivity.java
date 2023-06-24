package com.asadkhan.mylibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Button button,button2,button3,button4,button5;
    LottieAnimationView cityAnim1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        cityAnim1 = findViewById(R.id.cityAnim1);

        /*
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        */

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityAnim1.setAnimation(R.raw.dance);
            cityAnim1.playAnimation();}
        });

        /*
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get()
                        .load("https://e1.pxfuel.com/desktop-wallpaper/489/826/desktop-wallpaper-ben-10-force-scream-ben-10-aliens.jpg")
                        .into(imageView);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get()
                        .load("https://e0.pxfuel.com/wallpapers/408/992/desktop-wallpaper-ben-10-alien-force-big-chill-ben-ten-aliens.jpg")
                        .into(imageView);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get()
                        .load("https://e0.pxfuel.com/wallpapers/76/123/desktop-wallpaper-ben-10-ben-10-ultimate-alien-humungousaur-figure-ben-10-alien-cartoon.jpg")
                        .into(imageView);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Picasso.get()
                        .load("https://e1.pxfuel.com/desktop-wallpaper/425/821/desktop-wallpaper-ben-10-alien-force-chromastone.jpg")
                        .into(imageView);
            }
        });*/
    }
}