package it.emulk.quizcuriosity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.Window;
import android.view.WindowManager;

import com.google.analytics.tracking.android.EasyTracker;

public class MainActivity extends Activity {

	/* start song */
	//MediaPlayer song;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/* FULL SCREEN */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		/* song 
		song = MediaPlayer.create(MainActivity.this, R.raw.destination);
		song.setLooping(false);
		song.start(); */
		//assing the xml layout
		setContentView(R.layout.fragment_main);


		/*
		TextView imageview;
		imageview=(TextView) findViewById(R.id.startimage);
		Animation animation= AnimationUtils.loadAnimation(
				this, R.anim.rotate);

		imageview.startAnimation(animation); 
		*/
		
		   /*and then change activity after 7 seconds*/
		   new Handler().postDelayed(new Runnable() {
	            @Override
	            public void run() {
	                final Intent mainIntent = new Intent(MainActivity.this, Play.class);
	                startActivity(mainIntent);
	                MainActivity.this.finish();
	            }
	        }, 4000);
		   
		   
		   
		   
		}
	
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		//getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	
	
	@Override
	protected void onPause() {
		super.onPause();
		//song.release();
		/* v is for verbose */

	}
	
	@Override
	public void onStart() {
		super.onStart();

		EasyTracker.getInstance(this).activityStart(this);
	}

	@Override
	public void onStop() {
		super.onStop();

		EasyTracker.getInstance(this).activityStop(this);
	}




	

}
