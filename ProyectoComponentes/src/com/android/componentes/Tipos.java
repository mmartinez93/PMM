package com.android.componentes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class Tipos extends Activity {

    CheckBox acero, agua, bicho, dragon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            // TODO Auto-generated method stub
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_tipos);
            initialUISetup();
    }

    public void initialUISetup() {
            acero = (CheckBox) findViewById(R.id.tipoAcero);
            agua = (CheckBox)findViewById(R.id.tipoAgua);
            bicho = (CheckBox)findViewById(R.id.tipoBicho);
            dragon = (CheckBox)findViewById(R.id.tipoDragon);
    }

    public void getTypeSelected(View v) {
    	int checked = 0 ;
    	boolean aceroSeleccionado = false;
    	boolean aguaSeleccionado = false;
    	boolean bichoSeleccionado = false;
    	boolean dragonSeleccionado = false;
        //COMPROBAR QUE HAY MARCADO
    	String strMessage = "";
            if(acero.isChecked()) {
            	aceroSeleccionado = true;
            	checked += 1;
            }
            if(agua.isChecked()) {
            	aguaSeleccionado = true;
            	checked+=1;
            }
            if(bicho.isChecked()) {
            	bichoSeleccionado = true;
            	checked += 1;
            }
            if(dragon.isChecked()) {
            	dragonSeleccionado = true;
            	checked +=1;
            }
           //MOSTRAR MENSAJES SEG�N LO SELECCIONADO 
           //TIPOS SOLOS
            if (aceroSeleccionado) 
            	strMessage="Has seleccionado el tipo ACERO. \n"
                		+ "Es d�bil a: TIERRA, LUCHA y FUEGO. \n"
                		+ "Resistente a: PLANTA, BICHO, ROCA, VOLADOR, NORMAL, PS�QUICO, DRAG�N, ACERO, HIELO y HADA. \n"
                		+ "Inmune a: VENENO.";
            if (aguaSeleccionado)
            	strMessage="Has seleccionado el tipo AGUA. \n"
                		+ "Es d�bil a: EL�CTRICO y PLANTA. \n"
                		+ "Resistente a: AGUA, HIELO, FUEGO y ACERO.\n"
                		+ "Inmune a: NADA.";
            if(bichoSeleccionado)
            	strMessage="Has seleccionado el tipo BICHO. \n"
            			+ "Es d�bil a: ROCA, VOLADOR y FUEGO. \n"
            			+ "Resistente a: LUCHA, TIERRA y PLANTA. \n"
            			+ "Inmune a: NADA.";
            if(dragonSeleccionado)
            	strMessage="Has seleccionado el tipo DRAG�N. \n"
            			+ "Es d�bil a: DRAG�N, HIELO y HADA. \n"
            			+ "Resistente a: PLANTA, AGUA, FUEGO, EL�CTRICO y VENENO.\n"
            			+ "Inmune a: NADA.";
            //TIPOS DOBLES
            //ACERO Y OTRO
            if (aceroSeleccionado && aguaSeleccionado)
            	strMessage="Has seleccionado el tipo ACERO-AGUA \n"
            			+ "Es d�bil a: FUEGO, LUCHA y TIERRA.\n"
            			+ "Resistente a: ACERO, AGUA, BICHO, DRAG�N, HADA, HIELO, NORMAL, PS�QUICO, ROCA y VOLADOR. \n"
            			+ "Inmune a: VENENO";

            if (aceroSeleccionado && bichoSeleccionado)
            	strMessage="Has seleccionado el tipo ACERO-BICHO \n"
            			+ "Es d�bil a: FUEGO \n"
            			+ "Resistente a: ACERO, BICHO, DRAG�N, HADA, HIELO, NORMAL, PLANTA y PS�QUICO. \n"
            			+ "Inmune a: VENENO. \n";
            if(aceroSeleccionado && dragonSeleccionado)
            	strMessage="Has seleccionado el tipo ACERO-DRAG�N \n"
            			+ "Es d�bil a: LUCHA y TIERRA. \n"
            			+ "Resistente a: ACERO, AGUA, BICHO, EL�CTRICO, NORMAL, PS�QUICO, ROCA y VOLADOR. \n"
            			+ "Inmune a: VENENO.\n";
            //AGUA Y OTRO
            if (aguaSeleccionado && bichoSeleccionado){
            	strMessage="Has seleccionado el tipo AGUA-BICHO \n"
            			+ "Es d�bil a: EL�CTRICO, ROCA y VOLADOR. \n"
            			+ "Resistente a: ACERO, AGUA, HIELO, LUCHA y TIERRA.\n"
            			+ "Inmune a: NADA.";
            }
            if (aguaSeleccionado && dragonSeleccionado){
            	strMessage="Has seleccionado el tipo AGUA-DRAG�N \n"
            			+ "Es d�bil a: DRAG�N y HADA. \n"
            			+ "Resistente a: ACERO, AGUA y FUEGO. \n"
            			+ "Inmune a: NADA.";
            }
            //BICHO Y OTRO
            if (bichoSeleccionado && dragonSeleccionado){
            	strMessage="Has seleccionado el tipo BICHO-DRAG�N \n"
            			+ "No existe el tipo BICHO-DRAG�N.";
            }
            //EN CASO DE SELECCIONAR M�S DE DOS O CERO
            if (checked > 2) {
            	strMessage="No se puede seleccionar m�s de dos tipos a la vez.";
            }
            if (checked == 0) {
            	strMessage="Tienes que seleccionar alg�n tipo.";
            }

            TextView texto = (TextView)findViewById(R.id.textoParaMostrar);
            texto.setText(strMessage);
        
    }

}