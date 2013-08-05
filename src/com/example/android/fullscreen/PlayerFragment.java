package com.example.android.fullscreen;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

/**
 * A simple generic player fragment to show player view.
 */
public class PlayerFragment extends Fragment {

    private VideoView mVideoView;
    private MediaController mMediaController;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_player, container, false);
        mVideoView = (VideoView) rootView.findViewById(R.id.videoView);
        mMediaController = (MediaController) rootView.findViewById(R.id.mediaController);

        return rootView;
    }
}