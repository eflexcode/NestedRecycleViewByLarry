package com.eflexsoft.nestedrecycleview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eflexsoft.nestedrecycleview.R;
import com.eflexsoft.nestedrecycleview.model.WallpaperItem;

import java.util.List;

public class WallpaperItemAdapter extends RecyclerView.Adapter<WallpaperItemAdapter.WallpaperItemAdapterViewHolder> {

    List<WallpaperItem> wallpaperItemList;

    public WallpaperItemAdapter(List<WallpaperItem> wallpaperItemList) {
        this.wallpaperItemList = wallpaperItemList;
    }

    @NonNull
    @Override
    public WallpaperItemAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WallpaperItemAdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.wallpaperitem, parent, false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull WallpaperItemAdapterViewHolder holder, int position) {
        WallpaperItem wallpaperItem = wallpaperItemList.get(position);
        holder.itemImageName.setText(wallpaperItem.getImageName());
        holder.itemImage.setImageResource(wallpaperItem.getImage());

    }

    @Override
    public int getItemCount() {
        return wallpaperItemList.size();
    }

    static class WallpaperItemAdapterViewHolder extends RecyclerView.ViewHolder {

        ImageView itemImage;
        TextView itemImageName;

        public WallpaperItemAdapterViewHolder(@NonNull View itemView) {
            super(itemView);

            itemImage = itemView.findViewById(R.id.image_item);
            itemImageName = itemView.findViewById(R.id.item_image_name);

        }
    }
}
