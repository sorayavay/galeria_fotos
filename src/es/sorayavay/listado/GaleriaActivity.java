package es.sorayavay.listado;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.ListActivity;
import android.view.Menu;

public class GaleriaActivity extends ListActivity {
	
	private List<DatoCategoria> categorias = new ArrayList<DatoCategoria>();
	DatoCategoria categoria1 = new DatoCategoria();
	DatoCategoria categoria2 = new DatoCategoria();
	DatoCategoria categoria3 = new DatoCategoria();
	DatoCategoria categoria4 = new DatoCategoria();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_galeria);
		
		categoria1.setNombre("Cabeceros de cama");
		categoria1.setDescripcion("Es la descripción del cabecero de cama");
		categorias.add(categoria1);		
		
		categoria2.setNombre("Espejos");
		categoria2.setDescripcion("Es la descripción de los espejos");
		categorias.add(categoria2);
		
		categoria3.setNombre("Veletas");
		categoria3.setDescripcion("Es la descripción de las veletas");
		categorias.add(categoria3);
		
		categoria4.setNombre("Aperos");
		categoria4.setDescripcion("Es la descripción de los aperos");
		categorias.add(categoria4);
		
		setListAdapter(new ArrayCategoriaAdapter (this,categorias));
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_galeria, menu);
		return true;
	}
	

}
