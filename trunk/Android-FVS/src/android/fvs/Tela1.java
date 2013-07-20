package android.fvs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tela1 extends Activity implements OnClickListener{
	
	Button btChamaTela;
	
	public void onCreate(Bundle ex){
		super.onCreate(ex);
		setContentView(R.layout.tela1);
		
		btChamaTela = (Button) findViewById(R.tela1.btChamaTela);
		btChamaTela.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		if(arg0 == btChamaTela){
			Intent in = new Intent(this,Tela2.class);
			startActivity(in);
		}
	}
}