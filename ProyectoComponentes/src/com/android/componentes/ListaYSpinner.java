package com.android.componentes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ListaYSpinner extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista_yspinner);
		
		//LLAMAR A LA PANTALLA TIPOS
		Button botonIniciales = (Button)findViewById(R.id.iniciales);
		botonIniciales.setOnClickListener(new OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(ListaYSpinner.this, Lista.class);
				startActivity(intent);
			}
		});
		
		Button botonEvolucion = (Button)findViewById(R.id.iniciales_con_evoluciones);
		botonEvolucion.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(ListaYSpinner.this, Spinner.class);
				startActivity(intent);
			}
			
		});

	}

}
