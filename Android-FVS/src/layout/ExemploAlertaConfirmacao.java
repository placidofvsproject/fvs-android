package layout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.fvs.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class ExemploAlertaConfirmacao extends Activity implements
		OnClickListener {

	Button b;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.alert_dialog);
		b = (Button) findViewById(R.id.btAlertar);
		b.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		AlertDialog.Builder alerta = new AlertDialog.Builder(this);
		alerta.setIcon(R.drawable.android1);
		alerta.setTitle("T�tulo");
		alerta.setMessage("Por favor escolha sim ou n�o!");
		alerta.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(ExemploAlertaConfirmacao.this, "Clicou em Sim!", Toast.LENGTH_SHORT).show();
			}
		});
		alerta.setNegativeButton("N�o", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				Toast.makeText(ExemploAlertaConfirmacao.this, "Clicou em N�o!", Toast.LENGTH_SHORT).show();
			}
		});
		alerta.show();
	}

}
