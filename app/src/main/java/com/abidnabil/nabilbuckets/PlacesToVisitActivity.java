package com.abidnabil.nabilbuckets;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PlacesToVisitActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places_to_visit);

        RecyclerView thingsToDoView = findViewById(R.id.recycler_view_places_to_visit_list);

        BucketListItem[] placesToVisitList = {
                new BucketListItem(1, "Thailand", "Want to Visit Pharita and Lisa's Hometown", R.drawable.thailand),
                new BucketListItem(2, "Indonesia", "Want to Visit Carmen's Hometown", R.drawable.indonesia),
                new BucketListItem(3, "Australia", "Want to Visit Danielle and Hanni's Hometown", R.drawable.australia),
                new BucketListItem(4, "South Korea", "Want to Attend a KPOP Concert", R.drawable.south_korea)
        };

        BucketListItemAdapter bucketListItemBucketListItemAdapter = new BucketListItemAdapter(placesToVisitList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        thingsToDoView.setLayoutManager(gridLayoutManager);
        thingsToDoView.setAdapter(bucketListItemBucketListItemAdapter);

    }
}