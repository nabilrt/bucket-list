package com.abidnabil.nabilbuckets;

import androidx.annotation.DrawableRes;

public class BucketListItem {
    int itemId;
    String itemName;
    String itemDescription;
    int itemImage;

    BucketListItem(int itemId, String itemName, String itemDescription, @DrawableRes int itemImage) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemImage = itemImage;
    }

}
