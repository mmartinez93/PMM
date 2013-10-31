package com.android.componentes;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class TiposYEfectos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tipos_yefectos);
		
	//LLAMAR A LA PANTALLA TIPOS
	Button botonTipos = (Button)findViewById(R.id.tipos);
	botonTipos.setOnClickListener(new OnClickListener() {	
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(TiposYEfectos.this, Tipos.class);
			startActivity(intent);
		}
	});
	//LLAMAR A LA PANTALLA EFECTOS
	Button botonEfectos = (Button)findViewById(R.id.efectos);
	botonEfectos.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent intent = new Intent(TiposYEfectos.this, Efectos.class);
			startActivity(intent);	
		}
	});
	}
}
