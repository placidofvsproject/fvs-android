package layout;

import java.text.BreakIterator;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class ExemploMenu extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		menu.add(0,0,0,"Novo");
		menu.add(0,1,0,"Salvar");
		menu.add(0,2,0,"Excluir");
		return true;
	}
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		super.onMenuItemSelected(featureId, item);
		switch (item.getItemId()) {
		case 0:
			Toast.makeText(this, "Novo!", Toast.LENGTH_SHORT).show();
			break;
		case 1:
			Toast.makeText(this, "Salvar!", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			Toast.makeText(this, "Excluir!", Toast.LENGTH_SHORT).show();
			break;
		}
		return true;
	}
}
