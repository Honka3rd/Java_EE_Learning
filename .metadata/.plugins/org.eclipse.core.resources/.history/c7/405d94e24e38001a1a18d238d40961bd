package com.airline.service;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.airline.model.Passenger;

/**
 * Session Bean implementation class PassengerService
 */
@Stateless
@LocalBean
public class PassengerService {

    public PassengerService() {
       
    }
    
    @PersistenceContext(unitName="JPA_2")
    private EntityManager em;

    public void addPassenger(Passenger p){
    	em.persist(p);
    }
}
