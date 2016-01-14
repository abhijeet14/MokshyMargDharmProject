package com.jain.mokshymargdharm;

import android.app.Activity;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.MediaController;
import android.media.MediaPlayer.OnPreparedListener;
import android.widget.VideoView;

public class MediaDisplayActivity extends Activity{

    ProgressDialog pDialog ;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.media_display);

        videoView =(VideoView)findViewById(R.id.videoView1);

        pDialog = new ProgressDialog(MediaDisplayActivity.this);
        // Set progressbar title
        pDialog.setTitle("जय जिनेंद्र");

        // Set progressbar message
        pDialog.setMessage("जियो और जीने दो ");
        pDialog.setIndeterminate(false);
        pDialog.setCancelable(false);
        // Show progressbar
        pDialog.show();

        try {
        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        //specify the location of media file

            //https://drive.google.com/open?id=0B4GsJIYxshtmajdBeDZSMHA5SWM

      //  String UrlPath = "android.resource://" + getPackageName() + "/"        + R.raw.gomateshwarabahubali;
        // Uri video_uri = Uri.parse("https://www.dropbox.com/s/f1busm6rqqpdp0r/gomateshwarabahubali.mp4?dl=0");

String path = "https://vid.me/e/vfEM";
          //  http://www.ooklnet.com/files/381/381489/video.mp4
           //  https://www.dropbox.com/home/Apps/AbhiShaili?preview=gomateshwarabahubali.mp4
        //Setting MediaController and URI, then starting the videoView
        /*mediaController.setEnabled(true);
        mediaController.show();
        */videoView.setMediaController(mediaController);


        // videoView.setVideoURI(video_uri);
            videoView.setVideoPath(path);
        } catch (Exception e) {
           // Log.e("Error", e.getMessage());
            e.printStackTrace();
        }

        videoView.requestFocus();

        videoView.setOnPreparedListener(new OnPreparedListener() {
            // Close the progress bar and play the video
            public void onPrepared(MediaPlayer mp) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                pDialog.dismiss();
                videoView.start();
            }
        });
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                finish();
            }
        });


    }

    @Override
    protected void onPause()
    {

        super.onPause();
        this.videoView.pause();
        this.videoView.setVisibility(View.GONE);
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        if (pDialog!=null && pDialog.isShowing()){
            pDialog.dismiss();
        }

    }

    @Override
    protected void onResume()
    {
        super.onResume();
        this.videoView.resume();
    }
}
