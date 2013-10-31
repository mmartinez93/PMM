package com.android.componentes;

public class PokemonIniciales {
	
	private int imagen;
    private String nombre;
    private String tipo;

    public PokemonIniciales(int imagen, String nombre, String tipo){
            this.imagen = imagen;
            this.nombre = nombre;
            this.tipo = tipo;
    }
    
    public int getImagen(){
    	return imagen;
    }
    public String getNombre(){
    	return nombre;
    }
    public String getTipo(){
    	return tipo;
    }
}