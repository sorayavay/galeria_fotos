package es.sorayavay.listado;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MenuActivity extends Activity implements OnClickListener  {

	ImageButton btnGaleria;
	ImageButton btnContacta;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
		
		btnGaleria = (ImageButton) findViewById(R.id.botonGaleria);
		btnGaleria.setOnClickListener(this);
		
		btnContacta = (ImageButton) findViewById(R.id.botonContacta);
		btnContacta.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_menu, menu);
		return true;
	}

	@Override
	public void onClick(View arg0) {
		Intent intent = new Intent(this,GaleriaActivity.class);
		Intent intentContacta = new Intent(Intent.ACTION_SEND);
		switch (arg0.getId()) {
		case R.id.botonGaleria:
			startActivity(intent);
			break;
		case R.id.botonContacta:			
			intentContacta.setType("plain/text");
			intentContacta.putExtra(Intent.EXTRA_EMAIL, new String[] { "soraya.vay@luceit.es" });
			intentContacta.putExtra(Intent.EXTRA_SUBJECT, "Galería de imágenes");
			intentContacta.putExtra(Intent.EXTRA_TEXT, "Hola, mensaje enviado desde la aplicación de Galeria");
			startActivity(Intent.createChooser(intentContacta, ""));
			break;
		default:
			break;
		}
		
	}


}
