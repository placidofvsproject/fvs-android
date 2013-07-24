package browser;

import android.app.Activity;
import android.content.Intent;
import android.fvs.R;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class ExemploAbrirBrowser extends Activity implements OnClickListener{

	Button botaoOk2;
	EditText campoEndereco;
	public void onCreate(Bundle ex){
		super.onCreate(ex);
		setContentView(R.layout.form_browser);
		botaoOk2 = (Button) findViewById(R.id.botaoOk2);
		campoEndereco = (EditText) findViewById(R.id.campoEndereco);
		botaoOk2.setOnClickListener(this);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==botaoOk2){
			String endereco = campoEndereco.getText().toString();
			//Representa oenreço que desejamos abrir
			Uri uri = Uri.parse("http://"+endereco);
			//Cria a intent com o endereço
			Intent intent = new Intent(Intent.ACTION_VIEW, uri);
			startActivity(intent);
		}
	}
}
