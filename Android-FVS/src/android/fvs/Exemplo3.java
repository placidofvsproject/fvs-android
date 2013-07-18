package android.fvs;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;

public class Exemplo3 extends Activity {
	
	public void onCreate(Bundle ex3){
		super.onCreate(ex3);
		//abre a tela layout_exemplo3.xml
		setContentView(R.layout.layout_exemplo3);
		//Busca a imagem pelo id
		ImageView img2 = (ImageView) findViewById(R.id.imagem2);
		img2.setImageResource(R.drawable.android2);
	}
}