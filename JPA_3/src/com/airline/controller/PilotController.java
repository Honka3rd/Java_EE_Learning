package com.airline.controller;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.airline.enums.PilotRank;
import com.airline.model.Pilot;
import com.airline.service.PilotService;

/**
 * Servlet implementation class PilotController
 */
@WebServlet("/PilotController")
public class PilotController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PilotController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    @EJB
    PilotService ps;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Pilot p1 = new Pilot();
		p1.setFirstName("UU");
		p1.setLastName("VVV");
		p1.setLicense(1502);
		p1.setRank(PilotRank.Captain);
		
		Pilot p2 = new Pilot();
		p2.setFirstName("GG");
		p2.setLastName("MMM");
		p2.setLicense(1786);
		p2.setRank(PilotRank.First_officer);
		
		ps.addPilot(p1);
		ps.addPilot(p2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
