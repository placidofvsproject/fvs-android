package bd;

import java.util.ArrayList;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class ExemploBD extends Activity {

	private ArrayList<String> serv = new ArrayList<String>();
	
	RadioGroup rGroup;
	RadioButton radioB;// TODO radioB not used
	EditText editTEmail;
	Spinner sServidor;
	CheckBox cEmail;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.layout_db);
		
		rGroup = (RadioGroup) findViewById(R.id.rGroup);
		editTEmail = (EditText) findViewById(R.id.editTEmail);
		sServidor = (Spinner) findViewById(R.id.sServidor);
		cEmail = (CheckBox) findViewById(R.id.cEmail);
		
		serv.add("-- SELECIONE --");
		serv.add("YAHOO");
		serv.add("HOTMAIL");
		serv.add("GMAIL");
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, serv);
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_item);
		sServidor.setAdapter(adaptador);
	}
}