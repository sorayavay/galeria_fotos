package es.sorayavay.listado;

import java.util.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ArrayCategoriaAdapter extends ArrayAdapter<DatoCategoria> {

	private final List<DatoCategoria> categorias;

	public ArrayCategoriaAdapter(final Context context,
			final List<DatoCategoria> categoria) {
		super(context, R.layout.item_categoria, categoria);
		this.categorias = categoria;

	}

	@Override
	public View getView(final int position, final View convertView,
			final ViewGroup parent) {
		View row = convertView;
		if (row == null) {
			final LayoutInflater vi = (LayoutInflater) getContext()
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			row = vi.inflate(R.layout.item_categoria, null);
		}
		final DatoCategoria dato = categorias.get(position);
		if (dato != null) {
			final TextView nombre = (TextView) row
					.findViewById(R.id.nombre_categoria);
			nombre.setText(dato.getNombre());
			final TextView descripcion = (TextView) row
					.findViewById(R.id.descripcion_categoria);
			descripcion.setText(dato.getDescripcion());
		}
		return row;
	}
}
