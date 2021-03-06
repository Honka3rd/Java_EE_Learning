package com.airline.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.enums.FlightClass;
import com.airline.enums.Gender;
import com.airline.model.Passenger;
import com.airline.service.PassengerService;

/**
 * Servlet implementation class PassengerController
 */
@WebServlet("/PassengerController")
public class PassengerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	PassengerService ps;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PassengerController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Passenger p = new Passenger();
		p.setFirstName("zeli");
		p.setLastName("Wang");
		p.setGender(Gender.male);
		p.setFs(FlightClass.Business);
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, 1992);
		int month = 6;
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		
		Date dob = cal.getTime();
		
		p.setDob(dob);
		
		ps.addPassenger(p);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
