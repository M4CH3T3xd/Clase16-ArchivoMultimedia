package com.example.archivomultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView miVideito = findViewById(R.id.videoView);
        String videito = "android.resource://"+getPackageName()+"/"+R.raw.sttomas;
        Uri uri = Uri.parse(videito);
        miVideito.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        miVideito.setMediaController(mediaController);
        mediaController.setAnchorView(miVideito);
    }
}