package com.abidnabil.nabilbuckets;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.helper.widget.Grid;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ThingsToDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_things_to_do);

        RecyclerView thingsToDoView = findViewById(R.id.recycler_view_things_to_do_list);

        BucketListItem[] thingsToDoList = {
                new BucketListItem(1, "Programming", "Want to Do More Programming", R.drawable.programming),
                new BucketListItem(2, "Networking", "Want to increase my networking skills", R.drawable.networking),
                new BucketListItem(3, "Workout", "Want to increase my fitness", R.drawable.workout),
                new BucketListItem(4, "Own Company", "Want to open my own company", R.drawable.own_company)
        };

        BucketListItemAdapter bucketListItemBucketListItemAdapter = new BucketListItemAdapter(thingsToDoList);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        thingsToDoView.setLayoutManager(gridLayoutManager);
        thingsToDoView.setAdapter(bucketListItemBucketListItemAdapter);

    }
}