package com.example.android.fullscreen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class AppHomeActivity extends Activity {

	/**
	 * Log tag for logcat.
	 */
	private static final String LOG_TAG = AppHomeActivity.class.getSimpleName();

	private static final String PLAYABLE_CONTENT_URL = "http://mirror.cessen.com/blender.org/peach/trailer/trailer_iphone.m4v";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_app_home);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.app_home, menu);
		return true;
	}

	public void onViewClicked(View view) {
		switch (view.getId()) {
		case R.id.btn_launch_player:
			Log.d(LOG_TAG, "onViewClicked() : btn_launch_player.");
			// Launch the player activity
			Intent intent = new Intent(this, MyPlayerActivity.class);
			intent.putExtra(MyPlayerActivity.BUNDLE_KEY_CONTENT_URL, PLAYABLE_CONTENT_URL);
			startActivity(intent);
			break;

		default:
			Log.d(LOG_TAG, "onViewClicked() : Not handled.");
			break;
		}
	}
}
