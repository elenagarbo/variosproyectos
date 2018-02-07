package com.jstl.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jstl.model.Productos;

/**
 * Servlet implementation class Prueba
 */
@WebServlet("/Prueba")
public class Prueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prueba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		List<Productos> listado= new ArrayList<Productos>(); //creamos array para guardar los productos
		Productos producto1= new Productos();
		producto1.setCodigo("1");producto1.setNombre("Arroz de sushi");producto1.setPrecio(3);producto1.setUnidades(10);
		Productos producto2=new Productos();
		producto2.setCodigo("2");producto2.setNombre("Algas nori");producto2.setPrecio(2);producto2.setUnidades(10);
		Productos producto3= new Productos();
		producto3.setCodigo("3");producto3.setNombre("Salmon marinado");producto3.setPrecio(5);producto3.setUnidades(5);
		listado.add(producto1);listado.add(producto2);listado.add(producto3); //productos añadidos
		request.setAttribute("carritocompra", listado); //valor (le damos el nombre nosotros sin espacio) - atributo
		
		//requestdispacher es una interfaz de tipo clase abstracta y no se puede istanciar. 
		//Contexto de servlet es el proyecto donde estas, donde esta el servlet. Despues.. ir a la raiz y a home.
		
		RequestDispatcher rd= getServletContext().getRequestDispatcher("/home.jsp");
		//metodo forward permite llevar request y respone a la vez
		rd.forward(request,response);
		System.out.println(listado); // con este comprobamos si se llena el array y lo enseña en consola
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
