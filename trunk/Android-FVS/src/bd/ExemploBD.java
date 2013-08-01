package bd;

import java.util.ArrayList;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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
		
		serv.add("SELECIONE");
		serv.add("YAHOO");
		serv.add("HOTMAIL");
		serv.add("GMAIL");
		ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, serv);
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_item);
		sServidor.setAdapter(adaptador);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		menu.add(0,0,0,"Salvar");
		menu.add(0,1,0,"Sair");
		return true;
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		switch (item.getItemId()) {
		case 0:
			// TODO "Salvar" code here
			break;
		case 1:
			finish();
			break;
		}
		return true;
	}
}
