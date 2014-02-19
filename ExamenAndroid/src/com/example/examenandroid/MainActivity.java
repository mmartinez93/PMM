package com.example.examenandroid;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

	private Destino[] destinos = new Destino[]{
	    		new Destino("Zona A", "Asia", "30"),
	    		new Destino("Zona A", "Oceania", "30"),
	    		new Destino("Zona B", "America", "20"),
	    		new Destino("Zona B", "Africa", "20"),
	    		new Destino("Zona C", "Europa", "10")};
	
	
	RadioButton rnormal, rurgente;
	static double tarifa;
	int peso = 0;
	int precio;
	String zona, continente, resultado, clase, decoracion;
	CheckBox tarjeta, regalo;
	
	
class AdaptadorDestino extends ArrayAdapter<Destino> {
    	
    	Activity a;
    	AdaptadorDestino(Activity b) {
    	super(b, R.layout.activity_spinner, destinos);
    	this.a = b;
    	}
    	
    	public View getDropDownView ( int position, View convertView, ViewGroup parent){
    		return getView (position, convertView, parent);
    	}
    	
    	public View getView(int position, View convertView, ViewGroup parent) {
			LayoutInflater inflater = a.getLayoutInflater();
			View item = inflater.inflate(R.layout.activity_spinner, null);
			
			final TextView lblZona = (TextView)item.findViewById(R.id.LblZona);
			lblZona.setText(destinos[position].getZona());
			
			final TextView lblContinente = (TextView)item.findViewById(R.id.LblContinente);
			lblContinente.setText(destinos[position].getContinente());
			
			final TextView lblPrecio = (TextView)item.findViewById(R.id.LblPrecio);
			lblPrecio.setText(destinos[position].getPrecio());	
			
			return(item);
		}
    }
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		 	
	        final Spinner cmbOpciones = (Spinner)findViewById(R.id.CmbOpciones);
	        
	        AdaptadorDestino adaptador = new AdaptadorDestino(this);
	        
	        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	         
	        cmbOpciones.setAdapter(adaptador);
	        	        
	        cmbOpciones.setOnItemSelectedListener(
	        	new AdapterView.OnItemSelectedListener() {
	                public void onItemSelected(AdapterView<?> parent,
	                    android.view.View v, int position, long id) {
	                	zona = destinos[position].getZona();
	                	continente = destinos[position].getContinente();
	                	precio = Integer.parseInt(destinos[position].getPrecio());      
	                }
	                public void onNothingSelected(AdapterView<?> parent) {
	                    
	                }
	        });
	    
	
		final Button btnBoton1 = (Button)findViewById(R.id.BtnCalcula);
		rurgente=(RadioButton)findViewById(R.id.radiourgente);
	    rnormal=(RadioButton)findViewById(R.id.radionormal);
	    tarjeta = (CheckBox) findViewById(R.id.checktarjeta);
		regalo = (CheckBox) findViewById(R.id.checkregalo);
		
	  	final RadioGroup rg = (RadioGroup)findViewById(R.id.radiogroup1);
	    final EditText txtpeso = (EditText)findViewById(R.id.textpeso);

			btnBoton1.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					String pes = txtpeso.getText().toString();
					peso = Integer.parseInt(pes);
	
					if (peso <= 5){
						tarifa = precio + (peso * 1);
					}else {
						if (peso >= 6 && peso <= 10){
							tarifa = precio + (peso * 1.5);
						}else {
							if (peso > 10){
								tarifa = precio + (peso * 2);
							}
						}
					}
					
					if (regalo.isChecked() && !(tarjeta.isChecked())){
						decoracion = "Con caja regalo";
					}else {
						if (tarjeta.isChecked() && !(regalo.isChecked())){
							decoracion = "Con tarjeta dedicada";
						}else {
							if (regalo.isChecked() && tarjeta.isChecked()){
								decoracion = " Con caja regalo y dedicatoria";
							}else {
								decoracion = "Sin decoracion";
							}
						}
					}
					
					
					if (rurgente.isChecked()){
		                tarifa = tarifa + (tarifa * 0.3);
		                clase = "urgente";
		            }else {
		            	tarifa = tarifa;
		            	clase = "normal";
		            }
					
					
					resultado = ("Zona: " + zona + " ," + continente + "\nTarifa: " + clase + "\nPeso: " + peso +
							" Kg" + "\n\nDecoracion: " + decoracion + "\nCoste total: " + tarifa + " euros");
					
					
					Intent intent = new Intent(MainActivity.this, PantallaDos.class);

  					Bundle b = new Bundle();
  					b.putString("Tarifa", resultado);
  					b.putDouble("Precio", tarifa);

  					intent.putExtras(b);
  					  					
  					startActivity(intent);				
					  				
				}
			});	
	
	}
	
}


