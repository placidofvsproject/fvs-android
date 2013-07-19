package android.fvs;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class Exemplo5 extends Activity {

	private static final String CATEGORIA="fvs";
	public void onCreate(Bundle ex5){
		super.onCreate(ex5);
		setContentView(R.layout.main);
		Log.v(CATEGORIA, "log de verbose");
		Log.d(CATEGORIA, "log de debug");
		Log.i(CATEGORIA, "log de info");
		Log.w(CATEGORIA, "log de warning");
		Log.e(CATEGORIA, "log de erro");
	}
}
