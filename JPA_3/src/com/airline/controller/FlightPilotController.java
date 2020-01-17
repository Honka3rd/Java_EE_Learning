package com.airline.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.service.FlightService;

/**
 * Servlet implementation class FlightPilotController
 */
@WebServlet("/FlightPilotController")
public class FlightPilotController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@EJB
	private FlightService fs;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightPilotController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ?pid=[ID]&fid=[ID]
		//String pid = request.getParameter("pid");
		String fid = request.getParameter("fid");
		
		//fs.addPilotToFlight(pid, fid);
		
		fs.addPilotToFlightAnother(fid);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
