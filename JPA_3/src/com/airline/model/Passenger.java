package com.airline.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

import com.airline.enums.FlightClass;
import com.airline.enums.Gender;

@Entity
@Table(name="Passenger")
public class Passenger implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	public Passenger() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	@Column(name="FIRSTNAME")
	private String firstName;

	@Column(name="LASTNAME")
	private String lastName;

	@Column(name="GENDER")
	@Enumerated(EnumType.STRING)
	private Gender gender;

	@Column(name="DATE_OF_BIRTH")
	@Temporal(TemporalType.DATE)
	private Date dob;

	@Column(name="FLIGHT_CLASS")
	@Enumerated(EnumType.STRING)
	private FlightClass fs;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public FlightClass getFs() {
		return fs;
	}

	public void setFs(FlightClass fs) {
		this.fs = fs;
	}

}
