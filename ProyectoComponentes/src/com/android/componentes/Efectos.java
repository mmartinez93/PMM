package com.android.componentes;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class Efectos extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_efectos);
		
		final TextView mensaje = (TextView)findViewById(R.id.textoDondeMostrar);
       //distintos radio button aqui
		final RadioButton paralisis = (RadioButton)findViewById(R.id.opcionParalisis);
		final RadioButton quemadura = (RadioButton)findViewById(R.id.opcionQuemadura);
		final RadioButton envenenamiento = (RadioButton)findViewById(R.id.opcionEnvenenamiento);
		final RadioButton dormido = (RadioButton)findViewById(R.id.opcionDormido);
		final RadioButton congelamiento = (RadioButton)findViewById(R.id.opcionCongelamiento);
		final RadioButton debilitado = (RadioButton)findViewById(R.id.opcionDebilitado);
        paralisis.setOnClickListener(new RadioButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                mensaje.setText("La velocidad del Pokémon se reduce y existe la posibilidad de que no ataque en su turno.");
            }
        });
        quemadura.setOnClickListener(new RadioButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                mensaje.setText("Su ataque se reduce y recibe daño todos los turnos.");
            }
        });
        envenenamiento.setOnClickListener(new RadioButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                mensaje.setText("Recibe daño por turno, y cada turno consecutivo aumenta el daño recibido.");
            }
        });
        dormido.setOnClickListener(new RadioButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                mensaje.setText("El pokémon no puede realizar acciones y dura 3 turnos.");
            }
        });
        congelamiento.setOnClickListener(new RadioButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                mensaje.setText("El pokémon no puede realizar acciones. Cada turno tiene un 20% de probabilidad de descongelarse.");
            }
        });
        debilitado.setOnClickListener(new RadioButton.OnClickListener(){
            @Override
            public void onClick(View v) {
                mensaje.setText("El pokémon no puede combatir hasta que sea curado.");
            }
        });

	}
}
