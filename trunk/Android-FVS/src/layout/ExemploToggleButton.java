package layout;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ExemploToggleButton extends Activity implements OnClickListener {

	ToggleButton toggle;
	Button b;
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.exemplo_toggle_button);
		toggle = (ToggleButton) findViewById(R.id.toggle);
		b = (Button) findViewById(R.id.btOk);
		b.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Toast.makeText(this, "Selecionado: "+toggle.isChecked(), Toast.LENGTH_LONG).show();
	}

}
