package it.emulk.quizcuriosity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class Science extends Activity{
	
	/*per il debug, mi indica l'activity in esecuzione*/
	private static final String TAG="Database";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		/* FULL SCREEN */
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
				WindowManager.LayoutParams.FLAG_FULLSCREEN);
		//assing the xml layout
		setContentView(R.layout.science);
		
		Log.d(TAG, "dopo il layout");
	}

}
