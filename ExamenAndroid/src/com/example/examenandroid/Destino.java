package com.example.examenandroid;

public class Destino {

	private String zona;
	private String continente;
	private String precio;
	

	public Destino(String zon, String con, String pre){
		zona = zon;
		continente = con;
		precio = pre;
	}
	
	public String getZona(){
		return zona;
	}
	
	public String getContinente(){
		return continente;
	}
	
	public String getPrecio(){
		return precio;
	}
	
}
