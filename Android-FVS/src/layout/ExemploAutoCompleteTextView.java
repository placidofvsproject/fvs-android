package layout;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class ExemploAutoCompleteTextView extends Activity {

	private static final String[] ESTADOS = new String[] {"Acre","Alagoas","Amapá","Amazonas","Bahia","Ceará","Distrito Federal","Goiás","Espírito Santo"};
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.auto_complete_textview);
		initEstados();
	}
	private void initEstados(){
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, ESTADOS);
		AutoCompleteTextView estados = (AutoCompleteTextView) findViewById(R.id.estados);
		estados.setAdapter(adaptador);
	}
}
