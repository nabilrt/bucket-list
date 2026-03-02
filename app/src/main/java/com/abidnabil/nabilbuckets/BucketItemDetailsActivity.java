package com.abidnabil.nabilbuckets;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class BucketItemDetailsActivity extends AppCompatActivity {

    ImageView itemImage;
    TextView itemName;
    TextView itemDescription;
    ImageView backButtonToList;
    BucketListItem bucketItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bucket_item_details);
        findViews();

        BucketListItem[] totalBucketList = {
                new BucketListItem(1, "Thailand", "Want to Visit Pharita and Lisa's Hometown", R.drawable.thailand),
                new BucketListItem(2, "Indonesia", "Want to Visit Carmen's Hometown", R.drawable.indonesia),
                new BucketListItem(3, "Australia", "Want to Visit Danielle and Hanni's Hometown", R.drawable.australia),
                new BucketListItem(4, "South Korea", "Want to Attend a KPOP Concert", R.drawable.south_korea),
                new BucketListItem(5, "Programming", "Want to Do More Programming", R.drawable.programming),
                new BucketListItem(6, "Networking", "Want to increase my networking skills", R.drawable.networking),
                new BucketListItem(7, "Workout", "Want to increase my fitness", R.drawable.workout),
                new BucketListItem(8, "Own Company", "Want to open my own company", R.drawable.own_company)
        };

        Intent intent = getIntent();
        int itemId = intent.getIntExtra("ITEM_ID", 1);

        for (BucketListItem bucketListItem : totalBucketList) {
            if (bucketListItem.itemId == itemId) {
                bucketItem = bucketListItem;
                break;
            }

        }
        displayDetails(bucketItem);
        backButtonToList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public void findViews() {
        itemImage = findViewById(R.id.image_view_item_image);
        itemName = findViewById(R.id.text_view_item_name);
        itemDescription = findViewById(R.id.text_view_item_description);
        backButtonToList = findViewById(R.id.button_back_to_list);
    }

    public void displayDetails(BucketListItem b) {
        if (b != null) {
            itemImage.setImageResource(b.itemImage);
            itemName.setText(b.itemName);
            itemDescription.setText(b.itemDescription);
        }
    }
}