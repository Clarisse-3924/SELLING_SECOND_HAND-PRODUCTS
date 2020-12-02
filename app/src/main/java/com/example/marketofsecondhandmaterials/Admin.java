package com.example.marketofsecondhandmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class Admin extends AppCompatActivity {
    CardView Clothes,furniture,electronic, choes, order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin);
        Clothes = findViewById(R.id.cloth);
        furniture= findViewById(R.id.furniture);
        electronic= findViewById(R.id.electronic);
        choes = findViewById(R.id.choes);
        order= findViewById(R.id.sold);
        Clothes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Admin.this,Product.class));
                Animatoo.animateSlideLeft(Admin.this);
                finish();
            }
        });

        furniture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Admin.this,furnitureActivity.class));

            }
        });

        electronic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Admin.this,Electronic.class));

            }
        });

        choes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Admin.this, ChoesActivity.class));

            }
        });

        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Admin.this, orderingview.class));

            }
        });

    }
}