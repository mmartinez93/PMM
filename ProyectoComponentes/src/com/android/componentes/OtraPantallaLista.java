package com.android.componentes;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

public class OtraPantallaLista extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_otra_pantalla_lista);
		
		ImageView imagen = (ImageView)findViewById(R.id.Imagen);
		TextView nombre = (TextView)findViewById(R.id.Nombre);
		TextView tipo = (TextView)findViewById(R.id.Tipo);
		
		Bundle bundle = this.getIntent().getExtras();
		
		imagen.setImageResource(bundle.getInt("FOTO"));
		nombre.setText(bundle.getString("NOMBRE"));
		tipo.setText(bundle.getString("TIPO"));

		TextView datos = (TextView)findViewById(R.id.Datos);

		//pasamos el nombre seleccinado a String para poder trabajar con el.
		String nameSelected = nombre.getText().toString();
		
		if (nameSelected.equals("Charmander")){
			datos.setText("Charmander es un Pok�mon de tipo fuego introducido en la primera generaci�n. Es uno de los Pok�mon iniciales que pueden elegir los entrenadores que empiezan su aventura en la regi�n Kanto, excepto en Pok�mon Amarillo.");
		}
		if (nameSelected.equals("Bulbasaur")){
			datos.setText("Bulbasaur es un Pok�mon tipo planta/veneno introducido en la primera generaci�n. Es uno de los Pok�mon iniciales que pueden elegir los entrenadores que empiezan su aventura en la regi�n Kanto, excepto en Pok�mon Amarillo. Se destaca por ser el primer Pok�mon de la Pok�dex Nacional.");
		}
		if (nameSelected.equals("Squirtle")){
			datos.setText("Squirtle es un Pok�mon de tipo agua introducido en la primera generaci�n. Es uno de los Pok�mon iniciales que pueden elegir los entrenadores que empiezan su aventura en la regi�n Kanto, excepto en Pok�mon Amarillo.");
		}
		if (nameSelected.equals("Chikorita")){
			datos.setText("Chikorita es un Pok�mon de tipo planta introducido en la segunda generaci�n. Es uno de los tres Pok�mon iniciales que se pueden elegir al comenzar la aventura en la regi�n Johto.");
		}
		if (nameSelected.equals("Cyndaquil")){
			datos.setText("Cyndaquil es un Pok�mon de tipo fuego introducido en la segunda generaci�n. Es uno de los Pok�mon que pueden elegir los entrenadores que empiezan su aventura en la regi�n Johto, junto con Totodile y Chikorita.");
		}
		if (nameSelected.equals("Totodile")){
			datos.setText("Totodile es un Pok�mon del tipo agua introducido en la segunda generaci�n y es uno de los Pok�mon iniciales que puedes elegir al iniciar tu aventura en la regi�n de Johto.");
		}
	}

}