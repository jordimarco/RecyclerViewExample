package edu.upc.eseiaat.pma.exemples.recyclerviewexample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private VideoInfoAdapter adapter;
    private List<VideoInfo> videoList;
    private String[] videosURLs = {"http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_20mb.mp4","http://www.sample-videos.com/video/mp4/720/big_buck_bunny_720p_30mb.mp4"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoList = new ArrayList<VideoInfo>();
        for (int i = 0; i < 10; i++) {
            videoList.add(new VideoInfo("Video " + i + ": " + videosURLs[i%videosURLs.length],Uri.parse(videosURLs[i%videosURLs.length])));
        }

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        adapter = new VideoInfoAdapter(this,videoList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(adapter);

    }
}
