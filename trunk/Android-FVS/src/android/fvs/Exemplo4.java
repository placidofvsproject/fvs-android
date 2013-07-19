package android.fvs;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Exemplo4 extends Activity {
	EditText textNome;
	TextView textResultado;
	Button button;
	
	public void onCreate(Bundle ex4){
		super.onCreate(ex4);
		//abre a tela.xml
		setContentView(R.layout.layout_exemplo4_listener);
		textNome = (EditText) findViewById(R.exemplo4.campoNome);
		textResultado = (TextView) findViewById(R.exemplo4.campoResultado);
		button = (Button) findViewById(R.exemplo4.botaoOk);
		button.setOnClickListener(new Button.OnClickListener(){
			@Override
			public void onClick(View arg0){
				// TODO Auto-generated method stub
				String nome = textNome.getText().toString();
				//Atualiza o texto
				textResultado.setText(nome);
			}
		});
	}
}