package es.sorayavay.listado;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MenuActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(final Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);

		final ImageButton galeria = (ImageButton) findViewById(R.id.botonGaleria);
		galeria.setOnClickListener(this);

		final ImageButton contacta = (ImageButton) findViewById(R.id.botonContacta);
		contacta.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(final Menu menu) {
		getMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
	}

	@Override
	public void onClick(final View view) {
		final Intent intent = new Intent(this, GaleriaActivity.class);
		switch (view.getId()) {
		case R.id.botonGaleria:
			startActivity(intent);
			break;
		case R.id.botonContacta:
			final Intent intentContacta = new Intent(Intent.ACTION_SEND);
			intentContacta.setType("plain/text");
			intentContacta.putExtra(Intent.EXTRA_EMAIL,
					new String[] { "soraya.vay@luceit.es" });
			intentContacta
					.putExtra(Intent.EXTRA_SUBJECT, "Galería de imágenes");
			intentContacta.putExtra(Intent.EXTRA_TEXT,
					"Hola, mensaje enviado desde la aplicación de Galeria");
			startActivity(Intent.createChooser(intentContacta, ""));
			break;
		default:
			break;
		}

	}

}
