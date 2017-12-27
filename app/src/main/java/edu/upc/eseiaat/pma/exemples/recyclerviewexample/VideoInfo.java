package edu.upc.eseiaat.pma.exemples.recyclerviewexample;

import android.net.Uri;

/**
 * Created by Jordi on 27/12/17.
 */

class VideoInfo {
    private String title;
    private Uri videoUri;

    public VideoInfo(String title, Uri videoUri) {
        this.title = title;
        this.videoUri = videoUri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Uri getVideoUri() {
        return videoUri;
    }

    public void setVideoUri(Uri videoUri) {
        this.videoUri = videoUri;
    }
}
