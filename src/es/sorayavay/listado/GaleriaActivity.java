package es.sorayavay.listado;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.Menu;

public class GaleriaActivity extends ListActivity {

	private final List<DatoCategoria> categorias = new ArrayList<DatoCategoria>();

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_galeria);

		categorias.add(new DatoCategoria("Cabeceros de cama",
				"Es la descripción del cabecero de cama"));
		categorias.add(new DatoCategoria("Espejos",
				"Es la descripción de los espejos"));
		categorias.add(new DatoCategoria("Veletas",
				"Es la descripción de las veletas"));
		categorias.add(new DatoCategoria("Aperos",
				"Es la descripción de los aperos"));

		setListAdapter(new ArrayCategoriaAdapter(this, categorias));

	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		getMenuInflater().inflate(R.menu.activity_galeria, menu);
		return true;
	}

}
