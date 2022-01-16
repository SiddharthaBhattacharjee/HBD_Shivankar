package com.example.sosshivankar;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MediaController;
import android.widget.ScrollView;
import android.widget.VideoView;

public class MainActivity13 extends AppCompatActivity {
    ScrollView sv;
    @RequiresApi(api = Build.VERSION_CODES.P)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main13);
        sv = findViewById(R.id.endscroll);
        VideoView videoView = (VideoView) findViewById(R.id.videoView);  //casting to VideoView is not Strictly required above API level 26
        videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.videoclip); //set the path of the video that we need to use in our VideoView
        videoView.start();  //start() method of the VideoView class will start the video to play
        MediaController mediaController = new MediaController(this);//link mediaController to videoView
        mediaController.setAnchorView(videoView);//allow mediaController to control our videoView
        videoView.setMediaController(mediaController);
        videoView.pause();
        videoView.seekTo(5);
        sv.smoothScrollTo(0,0);


    }
}