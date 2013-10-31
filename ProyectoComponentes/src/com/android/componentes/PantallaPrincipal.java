package com.android.componentes;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class PantallaPrincipal extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_pantalla_principal);
	}

	

    //IMPLEMENTACI�N DEL MEN�
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.pantalla_principal, menu);
		return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
		Intent i;
		switch (item.getItemId()) {	
			case R.id.menuAcercaDe:
        		i = new Intent(this, AcercaDe.class );
                startActivity(i);
            return true;
            
            case R.id.menuOpcionUno:
            	i = new Intent(this, TiposYEfectos.class);
            	startActivity(i);
            return true;
            
            case R.id.menuOpcionDos:
            	i = new Intent(this, ListaYSpinner.class);
            	startActivity(i);
            return true;
            
        default:
            return super.onOptionsItemSelected(item);
    }
    }


}
