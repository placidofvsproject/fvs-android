package ligacao;

import android.app.Activity;
import android.content.Intent;
import android.fvs.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ExemploFazLigacao extends Activity implements OnClickListener{

	EditText campoNumero;
	Button botaoLigar;
	public void onCreate(Bundle ex){
		super.onCreate(ex);
		setContentView(R.layout.form_fazligacao);
		campoNumero = (EditText) findViewById(R.id.campoNumero);
		botaoLigar = (Button) findViewById(R.id.botaoLigar);
		botaoLigar.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==botaoLigar){
			Uri uri = Uri.parse("tel:"+campoNumero);
			Intent intent = new Intent(Intent.ACTION_CALL, uri);
			startActivity(intent);
		}
	}

}
