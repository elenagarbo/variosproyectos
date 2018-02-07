package com.curso.espectaculo;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Obras {
	
	private String id;
	private String descripcion;
	private float precio;
	private String fecha;
	
	
	public void setFecha(Calendar fecha) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat dateFormat= new SimpleDateFormat("d/mm/yyyy");
		Date parseCal= fecha.getTime();
		this.fecha= dateFormat.format(parseCal);
	}
	

	
	private String web;

	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getFecha() {
		return fecha;
	}
	
	public String getWeb() {
		return web;
	}
	public void setWeb(String web) {
		this.web = web;
	}
	
	

}
