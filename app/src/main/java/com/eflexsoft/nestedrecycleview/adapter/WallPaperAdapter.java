package com.eflexsoft.nestedrecycleview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.eflexsoft.nestedrecycleview.R;
import com.eflexsoft.nestedrecycleview.model.WallPaper;
import com.eflexsoft.nestedrecycleview.model.WallpaperItem;

import java.util.List;

public class WallPaperAdapter extends RecyclerView.Adapter<WallPaperAdapter.WallPaperAdapterViewHolder> {

    List<WallPaper> wallPaperList;

    Context context;

    public WallPaperAdapter(List<WallPaper> wallPaperList, Context context) {
        this.wallPaperList = wallPaperList;
        this.context = context;
    }

    @NonNull
    @Override
    public WallPaperAdapterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new WallPaperAdapterViewHolder(LayoutInflater.from(parent.getContext()).inflate(
                R.layout.wallpaper,parent,false
        ));
    }

    @Override
    public void onBindViewHolder(@NonNull WallPaperAdapterViewHolder holder, int position) {
        WallPaper wallPaper = wallPaperList.get(position);
        holder.wallpaper.setText(wallPaper.getCategoryName());
        innerRecycleView(holder.wallpaperItem,wallPaper.getWallpaperItemList());
    }

    @Override
    public int getItemCount() {
        return wallPaperList.size();
    }

    static class WallPaperAdapterViewHolder extends RecyclerView.ViewHolder {

        TextView wallpaper;
        RecyclerView wallpaperItem;

      WallPaperAdapterViewHolder(@NonNull View itemView) {
          super(itemView);

          wallpaper = itemView.findViewById(R.id.item_cat_name);
          wallpaperItem = itemView.findViewById(R.id.item_recycler_view);

      }
  }

  public void innerRecycleView(RecyclerView recyclerView, List<WallpaperItem> wallpaperItems){
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false));
        WallpaperItemAdapter wallpaperItemAdapter = new WallpaperItemAdapter(wallpaperItems);
        recyclerView.setAdapter(wallpaperItemAdapter);
  }
}
