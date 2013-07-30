package layout;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ExemploCheckRadio extends Activity implements OnClickListener {

	EditText textNome;
	Button bt;
	RadioGroup radioConcordaGroup;
	RadioButton radioConcordaButton;
	CheckBox cbReceberEmail;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.check_radio_form);
		textNome = (EditText) findViewById(R.id.textNome);
		bt = (Button) findViewById(R.id.buttonEnviar);
		bt.setOnClickListener(this);
		radioConcordaGroup = (RadioGroup) findViewById(R.id.group1);
		cbReceberEmail = (CheckBox) findViewById(R.id.checkReceberEmail);
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		int selectedId = radioConcordaGroup.getCheckedRadioButtonId();
		radioConcordaButton = (RadioButton) findViewById(selectedId);
		Toast.makeText(this, "Nome: "+textNome.getText().toString()+"\n Concorda: "+radioConcordaButton.getText().toString()+"\n Receber Email: "+cbReceberEmail.isChecked(), Toast.LENGTH_SHORT).show();
	}

}
