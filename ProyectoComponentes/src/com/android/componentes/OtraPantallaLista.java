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
			datos.setText("Charmander es un Pokémon de tipo fuego introducido en la primera generación. Es uno de los Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región Kanto, excepto en Pokémon Amarillo.");
		}
		if (nameSelected.equals("Bulbasaur")){
			datos.setText("Bulbasaur es un Pokémon tipo planta/veneno introducido en la primera generación. Es uno de los Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región Kanto, excepto en Pokémon Amarillo. Se destaca por ser el primer Pokémon de la Pokédex Nacional.");
		}
		if (nameSelected.equals("Squirtle")){
			datos.setText("Squirtle es un Pokémon de tipo agua introducido en la primera generación. Es uno de los Pokémon iniciales que pueden elegir los entrenadores que empiezan su aventura en la región Kanto, excepto en Pokémon Amarillo.");
		}
		if (nameSelected.equals("Chikorita")){
			datos.setText("Chikorita es un Pokémon de tipo planta introducido en la segunda generación. Es uno de los tres Pokémon iniciales que se pueden elegir al comenzar la aventura en la región Johto.");
		}
		if (nameSelected.equals("Cyndaquil")){
			datos.setText("Cyndaquil es un Pokémon de tipo fuego introducido en la segunda generación. Es uno de los Pokémon que pueden elegir los entrenadores que empiezan su aventura en la región Johto, junto con Totodile y Chikorita.");
		}
		if (nameSelected.equals("Totodile")){
			datos.setText("Totodile es un Pokémon del tipo agua introducido en la segunda generación y es uno de los Pokémon iniciales que puedes elegir al iniciar tu aventura en la región de Johto.");
		}
	}

}