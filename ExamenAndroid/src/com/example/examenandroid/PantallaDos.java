package com.example.examenandroid;


import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class PantallaDos extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantallados);

		 TextView tarifa = (TextView)findViewById(R.id.LblTarifa);
    	 TextView cambio = (TextView)findViewById(R.id.LblCambio);
    	 
    	 // recuperamos informacion del intent
    	 Bundle b = this.getIntent().getExtras();
    	 
    	 tarifa.setText(b.getString("Tarifa"));
    	 
    	 double precio = b.getDouble("Precio");
    	 
    	 int ent=(int)precio;
    	 double decima = precio - ent;
    	 
    	 int b500, b200, b100, b50, b20, b10, b5, m2, m1;
    	 
    	 //Calculo los billetes y monedas de la parte entera
    	 
    	 b500 = ent / 500; //billetes de 500
    	 ent = ent % 500; //el resto
    	 b200 = ent / 200; //billetes de 200
    	 ent = ent % 200; //el resto
    	 b100 = ent / 100; //billetes de 100
    	 ent = ent % 100; //el resto
    	 b50 = ent / 50; //billetes de 50
    	 ent = ent % 50; //el resto
    	 b20 = ent / 20; //billetes de 20
    	 ent = ent % 20; //el resto
    	 b10 = ent / 10; //billetes de 10
    	 ent = ent % 10; //el resto
    	 b5 = ent / 5; //billetes de 5
    	 ent = ent % 5; //el resto
    	 m2 = ent / 2; //monedas de 2
    	 ent = ent % 2; //el resto
    	 m1 = ent / 1; //monedas de 1
    	 ent = ent % 1; //el resto

    	 String totalCambio = "";
    	 if (b500 != 0){ totalCambio += "Billetes de 500 euros: " + b500;} 
    	 if (b200 != 0){ totalCambio += "\nBilletes de 200 euros: " + b200;} 
    	 if (b100 != 0){ totalCambio += "\nBilletes de 100 euros: " + b100;} 
    	 if (b50 != 0){ totalCambio += "\nBilletes de 50 euros: " + b50;} 
    	 if (b20 != 0){ totalCambio += "\nBilletes de 20 euros: " + b20;} 
    	 if (b10 != 0){ totalCambio += "\nBilletes de 10 euros: " + b10;} 
    	 if (b5 != 0){ totalCambio += "\nBilletes de 5 euros: " + b5;} 
    	 if (m2 != 0){ totalCambio += "\nMonedas de 2 euros: " + m2;} 
    	 if (m1 != 0){ totalCambio += "\nMondeas de 1 euro: " + m1;} 
    	 
    	 cambio.setText(totalCambio);
    	 

	}

}