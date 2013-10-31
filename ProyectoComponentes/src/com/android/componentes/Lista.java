package com.android.componentes;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Lista extends Activity {

	private PokemonIniciales[] datos = new PokemonIniciales[]{
			new PokemonIniciales(R.drawable.bulbasaur, "Bulbasaur", "Planta-Veneno"),
			new PokemonIniciales(R.drawable.charmander, "Charmander", "Fuego"),
			new PokemonIniciales(R.drawable.squirtle, "Squirtle", "Agua"),
			new PokemonIniciales(R.drawable.chikorita, "Chikorita", "Planta"),
			new PokemonIniciales(R.drawable.cyndaquil, "Cyndaquil", "Fuego"),
			new PokemonIniciales(R.drawable.totodile, "Totodile", "Agua")
	};
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lista);
		
		AdaptadorPokemon adaptador = new AdaptadorPokemon(this);
        ListView listaOpciones = (ListView)findViewById(R.id.listaPokemon);
        listaOpciones.setAdapter(adaptador);
        
        listaOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, android.view.View arg1, int position,long id) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(Lista.this, OtraPantallaLista.class);
				
				Bundle b = new Bundle();
				//datos para bundle
				int foto=((PokemonIniciales)parent.getAdapter().getItem(position)).getImagen();
				String nombre=((PokemonIniciales)parent.getAdapter().getItem(position)).getNombre();
				String tipo=((PokemonIniciales)parent.getAdapter().getItem(position)).getTipo();
				//a–adir datos al bundle
				b.putInt("FOTO", foto);
				b.putString("NOMBRE", nombre);
				b.putString("TIPO", tipo);
				
				intent.putExtras(b);
				startActivity(intent);
			}
        	
        });
	}

	 class AdaptadorPokemon extends ArrayAdapter<PokemonIniciales> {
         
         Activity context;
         
         AdaptadorPokemon(Activity context) {
                 super(context, R.layout.listiitem_pokemon, datos);
                 this.context = context;
         }
         //lista con holder
         public View getView(int position, View convertView, ViewGroup parent) {
        	 View item = convertView;
        	 ViewHolder holder;
        	 
        	 if(item == null){
                     LayoutInflater inflater = context.getLayoutInflater();
                     item = inflater.inflate(R.layout.listiitem_pokemon, null);
                     
                     holder = new ViewHolder();
                     holder.imagen = (ImageView)item.findViewById((R.id.Imagen));
                     holder.nombre = (TextView)item.findViewById(R.id.Nombre);
                     holder.tipo = (TextView)item.findViewById(R.id.Tipo);
                     
                     item.setTag(holder);
        	 } else {
        		 	holder = (ViewHolder)item.getTag();
        	 }
                    
                     holder.imagen.setImageResource(datos[position].getImagen());
                     holder.nombre.setText(datos[position].getNombre());
                     holder.tipo.setText(datos[position].getTipo());
                     return(item);
             }
	 }
	 //holder
	 static class ViewHolder {
         ImageView imagen;
		 TextView nombre;
         TextView tipo;
	 }
}
