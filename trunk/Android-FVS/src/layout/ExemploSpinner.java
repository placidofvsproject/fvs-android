package layout;

import java.util.ArrayList;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ExemploSpinner extends Activity {

	private ArrayList<String> planetas = new ArrayList<String>();
	
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.exemplo_spinner);
		Spinner sp = (Spinner) findViewById(R.id.comboPlanetas);
		planetas.add("-- SELECIONE --");
		planetas.add("MERCÚRIO");
		planetas.add("VÊNUS");
		planetas.add("TERRA");
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, planetas);
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_item);
		sp.setAdapter(adaptador);
	}
}
