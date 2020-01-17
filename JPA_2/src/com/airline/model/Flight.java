package com.airline.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.airline.enums.Cities;

/**
 * Entity implementation class for Entity: Flight
 *
 */
@Entity
@Table(name = "FLIGHT")
public class Flight implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	public Flight() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name="FLIGHT_ORIGIN")
	@Enumerated(EnumType.STRING)
	private Cities fo;
	
	@Column(name="FLIGHT_DESTINATION")
	@Enumerated(EnumType.STRING)
	private Cities fd;
   
	@Column(name="PRICE")
	private Integer price;
	
	@Column(name="FLIGHT_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date flightTime;
	
	@OneToOne
	@JoinColumn(name = "AIRPLANE_ID")
	private Airplane airplane;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cities getFo() {
		return fo;
	}

	public void setFo(Cities fo) {
		this.fo = fo;
	}

	public Cities getFd() {
		return fd;
	}

	public void setFd(Cities fd) {
		this.fd = fd;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Date getFlightTime() {
		return flightTime;
	}

	public void setFlightTime(Date flightTime) {
		this.flightTime = flightTime;
	}

	public Airplane getAirplane() {
		return airplane;
	}

	public void setAirplane(Airplane airplane) {
		this.airplane = airplane;
	}
	
	
}
