package com.basico;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Fecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Trabajando con fechas.....");
		
		Date now= new Date();
		System.out.println("Fecha Date:"+ now);
		
		System.out.println("Fecha Date con to String: "+ now.toString());
		
		//System.out.println("Trabajando con fechas formateadas.....");
		
		SimpleDateFormat formato=new SimpleDateFormat("Y/MMMM/D- EEEE - h:m:s");
		System.out.println("Fecha con formato: "+ formato.format(now));
		
		System.out.println("Trabajando con calendario.....");
		//al ser estatitico ya esta guardado en memoria y no hace falta istanciarlo con new
	
		Calendar calendario= Calendar.getInstance();
		System.out.println("Fecha Calendar: "+ calendario);
		System.out.println("Fecha calendar: " + calendario.getTimeInMillis());
		System.out.println("Fecha calendar: " + calendario.getTimeInMillis());
		
		calendario.set(2018, 8, 15);
		System.out.println("Fecha Calendar: "+calendario.getTime());
		
		
		
		
	}

}
