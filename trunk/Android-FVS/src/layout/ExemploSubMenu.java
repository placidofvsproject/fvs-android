package layout;

import android.app.Activity;
import android.fvs.R;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Toast;

public class ExemploSubMenu extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuItem item = menu.add(0,0,0,"Novo");
		item = menu.add(0,1,0,"Salvar");
		item.setIcon(R.drawable.ic_launcher);
		item = menu.add(0,2,0,"Excluir");
		item.setIcon(R.drawable.ic_launcher);
		
		SubMenu subMenu = menu.addSubMenu(0,3,0,"Outros");
		item = subMenu.add(0,4,0,"Pesquisar");
		item = subMenu.add(0,5,0,"Limpar");
		item = subMenu.add(0,6,0,"Sair");
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		// TODO Auto-generated method stub
		super.onMenuItemSelected(featureId, item);
		switch (item.getItemId()) {
		case 0:
			Toast.makeText(ExemploSubMenu.this, "Novo!", Toast.LENGTH_SHORT).show();
			break;
		case 1:
			Toast.makeText(ExemploSubMenu.this, "Salvar!", Toast.LENGTH_SHORT).show();
			break;
		case 2:
			Toast.makeText(ExemploSubMenu.this, "Excluir!", Toast.LENGTH_SHORT).show();
			break;
		case 3:
			Toast.makeText(ExemploSubMenu.this, "Outros!", Toast.LENGTH_SHORT).show();
			break;
		case 4:
			Toast.makeText(ExemploSubMenu.this, "Pesquisar!", Toast.LENGTH_SHORT).show();
			break;
		case 5:
			Toast.makeText(ExemploSubMenu.this, "Limpar!", Toast.LENGTH_SHORT).show();
			break;
		case 6:
			Toast.makeText(ExemploSubMenu.this, "Sair!", Toast.LENGTH_SHORT).show();
			break;
		}
		return true;
	}
}
