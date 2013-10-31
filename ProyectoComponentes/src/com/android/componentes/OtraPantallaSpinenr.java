package com.android.componentes;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

public class OtraPantallaSpinenr extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_otra_pantalla_spinenr);
		
		final TextView nombre = (TextView)findViewById(R.id.NombreSpinner);
		final TextView tipo = (TextView)findViewById(R.id.TipoSpinner);
		final ImageView imagen = (ImageView)findViewById(R.id.ImagenSpinner);
		
		Bundle bundle = getIntent().getExtras();
		nombre.setText(bundle.getString("NOMBRE"));
		tipo.setText(bundle.getString("TIPO"));
		imagen.setImageResource(bundle.getInt("FOTO"));
	}

}
