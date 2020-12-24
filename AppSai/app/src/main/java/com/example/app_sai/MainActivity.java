package com.example.app_sai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab_add, fab_eye, fab_level, fab_checkerboard, fab_othello;
    Animation fabOpen, fabClose, fabRClockwise, fabRAntiClockwise;
    boolean isOpen = false;
//fuck
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_add = findViewById(R.id.add_button);
        fab_eye = findViewById(R.id.eye_button);
        fab_level = findViewById(R.id.level_button);
        fab_checkerboard = findViewById(R.id.checkerboard_button);
        fab_othello = findViewById(R.id.othello_button);

        fabOpen = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fabClose = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        fabRClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_clockwise);
        fabRAntiClockwise = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_anticlockwise);

        fab_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isOpen){
                    fab_add.startAnimation(fabRClockwise);
                    fab_eye.startAnimation(fabClose);
                    fab_level.startAnimation(fabClose);
                    fab_checkerboard.startAnimation(fabClose);
                    fab_othello.startAnimation(fabClose);

                    fab_eye.setClickable(false);
                    fab_level.setClickable(false);
                    fab_checkerboard.setClickable(false);
                    fab_othello.setClickable(false);

                    isOpen = false;
                }

                else{
                    fab_add.startAnimation(fabRAntiClockwise);
                    fab_eye.startAnimation(fabOpen);
                    fab_level.startAnimation(fabOpen);
                    fab_checkerboard.startAnimation(fabOpen);
                    fab_othello.startAnimation(fabOpen);

                    fab_eye.setClickable(true);
                    fab_level.setClickable(true);
                    fab_checkerboard.setClickable(true);
                    fab_othello.setClickable(true);

                    isOpen = true;
                }
            }
        });

        fab_eye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked on eye", Toast.LENGTH_SHORT).show();
            }
        });

        fab_level.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked on level", Toast.LENGTH_SHORT).show();
            }
        });

        fab_checkerboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked on checkerboard", Toast.LENGTH_SHORT).show();
            }
        });

        fab_othello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You clicked on othello", Toast.LENGTH_SHORT).show();
            }
        });
    }

}

