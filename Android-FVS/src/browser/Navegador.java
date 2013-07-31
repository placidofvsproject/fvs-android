package browser;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class Navegador extends Activity implements OnClickListener {

	EditText campoEndereco;
	Button btIr;
	WebView wv;
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.navegador);
		campoEndereco = (EditText) findViewById(R.id.campoEndereco);
		btIr = (Button) findViewById(R.id.btIr);
		btIr.setOnClickListener(this);
		wv = (WebView) findViewById(R.id.wv);
	}
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		wv.getSettings().setJavaScriptEnabled(true);
		wv.getSettings().setSupportZoom(true);
		wv.loadUrl("http://"+campoEndereco.getText().toString());
		if(wv.canGoBack())
			wv.goBack();
	}

}
