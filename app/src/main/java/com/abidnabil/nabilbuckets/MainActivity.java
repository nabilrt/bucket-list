package com.abidnabil.nabilbuckets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView thingsToDoCard = findViewById(R.id.card_view_things_to_do);
        CardView placesToVisitCard = findViewById(R.id.card_view_places_to_visit);

        thingsToDoCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent thingsToDoCardIntent = new Intent(MainActivity.this, ThingsToDoActivity.class);
                startActivity(thingsToDoCardIntent);
            }
        });

        placesToVisitCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent placesToVisitCardIntent = new Intent(MainActivity.this, PlacesToVisitActivity.class);
                startActivity(placesToVisitCardIntent);
            }
        });


    }
}