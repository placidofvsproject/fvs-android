package browser;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class ExemploWebView extends Activity {

	public void onCreate(Bundle ex){
		super.onCreate(ex);
		WebView web = new WebView(this);
		WebSettings webS = web.getSettings();
		webS.setSavePassword(false);
		webS.setSaveFormData(false);
		webS.setJavaScriptEnabled(true);
		webS.setSupportZoom(false);
		web.loadUrl("http://www.google.com.br");
		setContentView(web);
	}
}
