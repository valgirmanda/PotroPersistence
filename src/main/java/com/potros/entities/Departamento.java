package com.potros.entities;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


public class Departamento extends ElementoConId implements Serializable {
    
	private static final long serialVersionUID = 1L;
    
	
	 private ArrayList <Articulo> articulos ;
   
    public Departamento(String descripcion, Integer id) {
		super(id, descripcion);
	}
 
    public void agregarArticulo(Articulo a){
    	articulos.add(a);
    }
    
    public void eliminaArticulo(Articulo a){
    	articulos.remove(a);
    }

}
