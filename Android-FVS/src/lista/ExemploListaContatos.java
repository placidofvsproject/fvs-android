package lista;

import android.app.ListActivity;
import android.database.Cursor;
import android.fvs.R;
import android.net.Uri;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;

public class ExemploListaContatos extends ListActivity {

	private ListAdapter adaptador;
	public void onCreate(Bundle ex){
		super.onCreate(ex);
		//Uri para buscar os contatos
		Uri uri = ContactsContract.Contacts.CONTENT_URI;
		//Recupera o Cursor dos Contatos
		Cursor c = getContentResolver().query(uri, null, null, null, null);
		startManagingCursor(c);
		//Listar o neme do contato
		String[] colunas = new String[]
				{ContactsContract.Contacts.DISPLAY_NAME};
		int[] campos = new int[]{R.id.nome};
		//informe o adapter para ligar os valores ao XML View
		adaptador = new SimpleCursorAdapter(this, R.layout.layout_contatos, c, colunas, campos);
		setListAdapter(adaptador);
	}
}
