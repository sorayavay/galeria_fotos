package es.sorayavay.listado;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;


public class ArrayCategoriaAdapter extends ArrayAdapter<DatoCategoria>{
	
	private final List<DatoCategoria> categorias;
	
	public ArrayCategoriaAdapter(Context context, List<DatoCategoria> categoria) {
		 	super(context, R.layout.item_categoria, categoria);
			this.categorias = categoria;
		 	
	}
	
	
	
	 @Override
	    public View getView(int position, View convertView, ViewGroup parent) {
	        View v = convertView;
	        if (v == null) {
	        	LayoutInflater vi = (LayoutInflater) getContext().getSystemService(
	        			Context.LAYOUT_INFLATER_SERVICE);	            
	            v = vi.inflate(R.layout.item_categoria, null);
	        }
	        DatoCategoria dato = categorias.get(position);
	        if (dato != null) {
	            TextView tnombre = (TextView) v.findViewById(R.id.nombre_categoria);
	            TextView tdescripcion = (TextView) v.findViewById(R.id.descripcion_categoria);
	            if (tnombre != null) {
	                tnombre.setText(dato.getNombre());
	            }
	            if (tdescripcion != null) {
	            	tdescripcion.setText(dato.getDescripcion());
	            }
	        }
	        return v;
	    }
}
