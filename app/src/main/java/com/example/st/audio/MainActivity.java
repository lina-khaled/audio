package com.example.st.audio;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

// initilize MediaPlayer for audio
MediaPlayer audio;
// this variable avoids user to pause the audio before play it first
boolean run = false;

    // run the audio
    public void play(View view){

        audio.start();
    }
    // stop the audio
    public void pause(View view){
        if(run) {
            audio.pause();
            run = false;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Create MediaPlayer for audio
        audio = MediaPlayer.create(this, R.raw.my_audio);

    }
}
