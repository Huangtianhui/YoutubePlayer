package com.example.tianhuihuang.youtubeplayer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class StandaloneActivity extends AppCompatActivity
                implements View.OnClickListener
{

    //get API key
    private String GOOGLE_API_KEY="AIzaSyC1amRYc4qKR8VhXR9GiKg39I5aCYgXmUc"; //to be added
    //get Youtube ID,copy的部分就是=后面的内容
    private String YOUTUBE_VIDEO_ID="pI-c91ccndg";
    private String YOUTUBE_PLAYLIST="韩顺平";
    private Button btnplayVideo;
    private Button btnplayplaylist;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnplayVideo=(Button) findViewById(R.id.btnPlayVideo);
        btnplayplaylist=(Button)findViewById(R.id.btnPlayList);

//        btnplayVideo.setOnClickListener(new View.OnClickListener()
//        @Override
//        public void onClick(View v){
//
//        );

        //will automatically use the click method
        btnplayVideo.setOnClickListener(this);
        btnplayplaylist.setOnClickListener(this);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    //implement method 也是override
    @Override
    public void onClick(View v) {

        Intent intent=null;
        switch(v.getId()){

            case R.id.btnPlayVideo:
                intent= YouTubeStandalonePlayer.createVideoIntent(this,GOOGLE_API_KEY,YOUTUBE_VIDEO_ID);
                break;

            case R.id.btnPlayList:
                intent= YouTubeStandalonePlayer.createPlaylistIntent(this,GOOGLE_API_KEY,YOUTUBE_PLAYLIST);
                break;

            default:
        }

        if (intent!=null){
            startActivity(intent);
        }
    }
}
