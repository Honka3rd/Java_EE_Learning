package com.airline.model;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Airplane
 *
 */
@Entity
@Table(name = "AIRPLANE")
public class Airplane implements Serializable {

	@Transient
	private static final long serialVersionUID = 1L;

	public Airplane() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(name = "MODEL_NAME")
	private String modelName;
   
	@Column(name = "PLANE_MAKE")
	private String planeMake;
	
	@Column(name = "SEATING_CAPACITY")
	private Integer seatingCapacity;
	
	@OneToOne(mappedBy = "airplane")
	private Flight f;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getPlaneMake() {
		return planeMake;
	}

	public void setPlaneMake(String planeMake) {
		this.planeMake = planeMake;
	}

	public Integer getSeatingCapacity() {
		return seatingCapacity;
	}

	public void setSeatingCapacity(Integer seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public Flight getF() {
		return f;
	}

	public void setF(Flight f) {
		this.f = f;
	}
	
}
