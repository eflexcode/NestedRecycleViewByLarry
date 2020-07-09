package com.eflexsoft.nestedrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.eflexsoft.nestedrecycleview.adapter.WallPaperAdapter;
import com.eflexsoft.nestedrecycleview.model.WallPaper;
import com.eflexsoft.nestedrecycleview.model.WallpaperItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.mainRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<WallpaperItem> wallpaperItemsSpace = new ArrayList<>();
        wallpaperItemsSpace.add(new WallpaperItem(R.drawable.space1,"good space"));
        wallpaperItemsSpace.add(new WallpaperItem(R.drawable.space2,"bad space"));
        wallpaperItemsSpace.add(new WallpaperItem(R.drawable.space3,"evil space"));
        wallpaperItemsSpace.add(new WallpaperItem(R.drawable.space4,"sad space"));
        wallpaperItemsSpace.add(new WallpaperItem(R.drawable.space5,"nice space"));

        List<WallpaperItem> wallpaperItemsForest = new ArrayList<>();
        wallpaperItemsForest.add(new WallpaperItem(R.drawable.forest1,"good forest"));
        wallpaperItemsForest.add(new WallpaperItem(R.drawable.forest2,"bad forest"));
        wallpaperItemsForest.add(new WallpaperItem(R.drawable.forest3,"evil forest"));
        wallpaperItemsForest.add(new WallpaperItem(R.drawable.forest4,"sad forest"));
        wallpaperItemsForest.add(new WallpaperItem(R.drawable.forest5,"nice forest"));

        List<WallpaperItem> wallpaperItemsCity = new ArrayList<>();
        wallpaperItemsCity.add(new WallpaperItem(R.drawable.city1,"good city"));
        wallpaperItemsCity.add(new WallpaperItem(R.drawable.city2,"bad city"));
        wallpaperItemsCity.add(new WallpaperItem(R.drawable.city3,"evil city"));
        wallpaperItemsCity.add(new WallpaperItem(R.drawable.city4,"sad city"));
        wallpaperItemsCity.add(new WallpaperItem(R.drawable.city5,"nice city"));

        List<WallpaperItem> wallpaperItemsServer = new ArrayList<>();
        wallpaperItemsServer.add(new WallpaperItem(R.drawable.server1,"good city"));
        wallpaperItemsServer.add(new WallpaperItem(R.drawable.server2,"bad city"));
        wallpaperItemsServer.add(new WallpaperItem(R.drawable.server3,"evil city"));
        wallpaperItemsServer.add(new WallpaperItem(R.drawable.server4,"sad city"));
        wallpaperItemsServer.add(new WallpaperItem(R.drawable.server5,"nice city"));

        List<WallPaper>wallPapers = new ArrayList<>();
        wallPapers.add(new WallPaper("Space",wallpaperItemsSpace));
        wallPapers.add(new WallPaper("forest",wallpaperItemsForest ));
        wallPapers.add(new WallPaper("cities",wallpaperItemsCity));
        wallPapers.add(new WallPaper("servers",wallpaperItemsServer));

        WallPaperAdapter wallPaperAdapter = new WallPaperAdapter(wallPapers,this);
        recyclerView.setAdapter(wallPaperAdapter);

    }
}
