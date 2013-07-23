package lista;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ExemploListActivity1 extends ListActivity {

	public void onCreate(Bundle ex){
		super.onCreate(ex);
		//Array de Strings para visualizar na lista
		String[] itens =
				new String[] {"Nome 1", "Nome 2", "Nome 3", "Sair"};
		//Utiliza o adaptador ArrayAdapter, para exibir
		//o array de Strings na tela
		ArrayAdapter<String> arrayAdapter =
				new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, itens);
		setListAdapter(arrayAdapter);
	}
	
	public void onListItemClick(ListView l, View v, int position, long id){
		super.onListItemClick(l, v, position, id);
		//Pega o item naquela posição
		Object o = this.getListAdapter().getItem(position);
		String item = o.toString();
		//Exibi um Alerta
		Toast.makeText(this, "Voçê selecionou: "+item, Toast.LENGTH_SHORT).show();
		//se a posição selecionada for sair
		if(position==3){
			finish();
		}
	}
}
