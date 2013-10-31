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
import android.widget.TextView;

public class Spinner extends Activity {
	private PokemonIniciales[] datos =new PokemonIniciales[]{
			new PokemonIniciales(R.drawable.interrogante , "Selecciona una opci—n:", null),
			new PokemonIniciales(R.drawable.bulbasaur, "Bulbasaur", "Planta-Veneno"),
			new PokemonIniciales(R.drawable.charmander, "Charmander", "Fuego"),
			new PokemonIniciales(R.drawable.squirtle, "Squirtle", "Agua"),
			new PokemonIniciales(R.drawable.chikorita, "Chikorita", "Planta"),
			new PokemonIniciales(R.drawable.cyndaquil, "Cyndaquil", "Fuego"),
			new PokemonIniciales(R.drawable.totodile, "Totodile", "Agua")
	};
class AdaptadorPersona extends ArrayAdapter<PokemonIniciales> {
	
	Activity a;
	AdaptadorPersona(Activity b) {
	super(b, R.layout.listiitem_pokemon, datos);
	this.a = b;
	}
	
	public View getDropDownView (int position,View convertView,ViewGroup parent) {
	//if(item==null)
		return getView (position, convertView, parent);
	}
	
	public View getView(int position,View convertView,ViewGroup parent) {
	LayoutInflater inflater = a.getLayoutInflater();
		
	View item = inflater.inflate(R.layout.listiitem_pokemon, null);
	 	 	 
	final TextView lblNombre = (TextView)item.findViewById(R.id.Nombre);
	final TextView lblTipo = (TextView)item.findViewById(R.id.Tipo);
	ImageView lblImagen=(ImageView)item.findViewById(R.id.Imagen);
	
	lblNombre.setText(datos[position].getNombre());
	lblTipo.setText(datos[position].getTipo());;
	lblImagen.setImageResource(datos[position].getImagen());
	return(item);
	}
}
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        AdaptadorPersona adaptador =new AdaptadorPersona(this);
		//problemas al hacer la llamada (?)
        final android.widget.Spinner cmbOpciones = (android.widget.Spinner)findViewById(R.id.CmbOpciones);
		adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cmbOpciones.setAdapter(adaptador);

		cmbOpciones.setOnItemSelectedListener(
				new AdapterView.OnItemSelectedListener() {
				public void onItemSelected(AdapterView<?> a,
				android.view.View v, int position, long id) {
				Intent intent =new Intent(Spinner.this, OtraPantallaSpinenr.class);
				
				String nombre=((PokemonIniciales)a.getAdapter().getItem(position)).getNombre();
				String tipo =((PokemonIniciales)a.getAdapter().getItem(position)).getTipo();
				int imagen= ((PokemonIniciales)a.getAdapter().getItem(position)).getImagen();
				Bundle b = new Bundle();
				b.putString("NOMBRE", nombre);
				b.putString("TIPO", tipo);
				b.putInt("FOTO", imagen);
				
				intent.putExtras(b);
				if (position > 0) {
		        startActivity(intent);
				}
				}
				public void onNothingSelected(AdapterView<?> parent) {
				
				}
				});	
		}
	}