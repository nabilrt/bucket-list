package com.abidnabil.nabilbuckets;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BucketListItemAdapter extends RecyclerView.Adapter<BucketListItemAdapter.BucketListItemViewHolder> {

    BucketListItem[] bucketListItems;

    BucketListItemAdapter(BucketListItem[] bucketListItems) {
        this.bucketListItems = bucketListItems;
    }

    @NonNull
    @Override
    public BucketListItemAdapter.BucketListItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_bucket, parent, false);
        return new BucketListItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BucketListItemAdapter.BucketListItemViewHolder holder, int position) {

        holder.bind(bucketListItems[position]);
    }

    @Override
    public int getItemCount() {
        return bucketListItems.length;
    }

    public class BucketListItemViewHolder extends RecyclerView.ViewHolder {

        ImageView bucketListItemImage;
        TextView bucketListItemName;
        TextView bucketListItemDescription;

        public BucketListItemViewHolder(@NonNull View itemView) {
            super(itemView);
            bucketListItemImage = itemView.findViewById(R.id.image_view_bucket_item_image);
            bucketListItemName = itemView.findViewById(R.id.text_view_bucket_item_name);
            bucketListItemDescription = itemView.findViewById(R.id.text_view_bucket_item_description);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int adapterPosition = getBindingAdapterPosition();
                    if (adapterPosition == RecyclerView.NO_POSITION) return;
                    Intent intent = new Intent(v.getContext(), BucketItemDetailsActivity.class);
                    intent.putExtra("ITEM_ID", bucketListItems[adapterPosition].itemId);
                    v.getContext().startActivity(intent);

                }
            });
        }

        public void bind(BucketListItem bucketListItem) {
            bucketListItemImage.setImageResource(bucketListItem.itemImage);
            bucketListItemName.setText(bucketListItem.itemName);
            bucketListItemDescription.setText(bucketListItem.itemDescription);
        }
    }
}
