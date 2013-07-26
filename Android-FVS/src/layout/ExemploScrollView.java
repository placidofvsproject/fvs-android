package layout;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.fvs.R;
import android.graphics.Color;
import android.os.Bundle;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ExemploScrollView extends Activity {

	public void onCreate(Bundle ex){
		super.onCreate(ex);
		setContentView(R.layout.exemplo_scrollview);
		LinearLayout layout = (LinearLayout) findViewById(R.id.layout1);
		for(int i=0; i<100; i++){
			TextView tv = new TextView(this);
			tv.setLayoutParams(new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
			tv.setText("Texto: "+i);
			tv.setTextColor(Color.BLUE);
			layout.addView(tv);
		}
	}
}
