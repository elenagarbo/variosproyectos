package com.curso.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curso.espectaculo.Obras;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		List<Obras> listaObras= new ArrayList<Obras>();
		Obras obra1= new Obras();
		
		obra1.setId("1");obra1.setDescripcion("terror");
		
		Calendar fecha1= Calendar.getInstance();
		fecha1.set(2018, 05, 13);;
		obra1.setFecha(fecha1);
		
		obra1.setPrecio(12);
		obra1.setWeb("https://www.atrapalo.com");
		
		Obras obra2= new Obras();
		obra2.setId("2");
		obra2.setDescripcion("comedia");
		Calendar fecha2=Calendar.getInstance();
		fecha2.set(2018, 05, 14);
		obra2.setFecha(fecha2);
		obra2.setPrecio(13);
		obra2.setWeb("https://www.atrapalo.com");
		
		
		Obras obra3= new Obras();
		obra3.setId("3");
		obra3.setDescripcion("suspense");
		
		Calendar fecha3=Calendar.getInstance();
		fecha3.set(2018, 05, 15);
		obra3.setFecha(fecha3);
	
		obra3.setPrecio(14);
		obra3.setWeb("https://www.atrapalo.com");
		
		Obras obra4= new Obras();
		obra4.setId("4");obra4.setDescripcion("terror");
		
		Calendar fecha4=Calendar.getInstance();
		fecha4.set(2018, 05, 16);
		obra4.setFecha(fecha4);
		obra4.setPrecio(12);obra4.setWeb("https://www.atrapalo.com");
		
		Obras obra5= new Obras();
		obra5.setId("5");obra5.setDescripcion("comedia");
		
		
		Calendar fecha5=Calendar.getInstance();
		fecha5.set(2018, 05, 15);
		obra5.setFecha(fecha5);
		obra5.setPrecio(13);obra5.setWeb("https://www.atrapalo.com");
		
		Obras obra6= new Obras();
		obra6.setId("6");obra6.setDescripcion("suspense");
		Calendar fecha6=Calendar.getInstance();
		fecha6.set(2018, 05, 15);
		obra6.setFecha(fecha6);
		obra6.setPrecio(14);obra6.setWeb("https://www.atrapalo.com");
		
		Obras obra7= new Obras();
		obra7.setId("7");obra7.setDescripcion("suspense");
		
		Calendar fecha7=Calendar.getInstance();
		fecha7.set(2018, 05, 15);
		obra7.setFecha(fecha7);
		obra7.setPrecio(14);obra7.setWeb("https://www.atrapalo.com");
		
		listaObras.add(obra1);listaObras.add(obra2);listaObras.add(obra3);listaObras.add(obra4);listaObras.add(obra5);listaObras.add(obra6);listaObras.add(obra7);
		
		request.setAttribute("listadobras",listaObras);
		
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
