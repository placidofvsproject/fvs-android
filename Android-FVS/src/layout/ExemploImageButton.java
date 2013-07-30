package layout;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.Toast;

public class ExemploImageButton extends Activity implements OnClickListener {

	ImageButton btImg1, btImg2;
	public void onCreate(Bundle icicle){
		super.onCreate(icicle);
		setContentView(R.layout.exemplo_image_button);
		btImg1 = (ImageButton) findViewById(R.id.img1);
		btImg1.setOnClickListener(this);
		btImg2 = (ImageButton) findViewById(R.id.img2);
		btImg2.setOnClickListener(this);
		btImg2.setImageResource(R.drawable.android2);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v==btImg1){
			Toast.makeText(this, "Imagem 1 OK", Toast.LENGTH_SHORT).show();
		}
		if(v==btImg2){
			Toast.makeText(this, "Imagem 2 OK", Toast.LENGTH_SHORT).show();
		}
	}
	
}
