package android.fvs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class ExemploCicloVida extends Activity {

	private static final String CATEGORIA="fvs";
	@Override
	public void onCreate(Bundle ex){
		super.onCreate(ex);
		setContentView(R.layout.main);
		Log.i(CATEGORIA, ". onCreate() chamado");
	}
	
	public void onStart(){
		super.onStart();
		Log.i(CATEGORIA, ". onStart() chamado");
	}
	
	public void onRestart(){
		super.onStart();
		Log.i(CATEGORIA, ". onRestart() chamado");
	}
	
	public void onResume(){
		super.onStart();
		Log.i(CATEGORIA, ". onResume() chamado");
	}
	
	public void onPause(){
		super.onPause();
		Log.i(CATEGORIA, ". onPause() chamado");
	}
	
	public void onStop(){
		super.onStop();
		Log.i(CATEGORIA, ". onStop() chamado");
	}
	
	public void onDestroy(){
		super.onDestroy();
		Log.i(CATEGORIA, ". onDestroy() chamado");
	}
}
