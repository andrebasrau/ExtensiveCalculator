package com.example.extensivecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void square(View v){
        Intent intent = new Intent(MainActivity.this, Square.class);
        startActivity (intent);
    }

    public void triangle (View v){
        Intent intent = new Intent (MainActivity.this, Triangle.class);
        startActivity(intent);

    }

    public void trapesium (View v){
        Intent intent = new Intent (MainActivity.this, Trapesium.class);
        startActivity(intent);
    }
    public void circle (View v){
        Intent intent = new Intent (MainActivity.this, Circle.class);
        startActivity (intent);
    }

    public void pal (View v ){
        Intent intent = new Intent (MainActivity.this, Pal.class);
        startActivity (intent);
    }

    public void rec (View v){
        Intent intent = new Intent (MainActivity.this, Rec.class);
        startActivity(intent);
    }
    public void diamond (View v){
        Intent intent = new Intent (MainActivity.this, Diamond.class);
        startActivity(intent);
    }
}
