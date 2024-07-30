package com.psa.flight_reservation_app_5.entity;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;

@Entity
public class Flight extends Abstractentity  {
	
	private String FLIGHT_NUMBER;
	private String OPERATING_AIRLINES ;
	private String DEPARTURE_CITY ;
	private String ARRIVAL_CITY;
	private Date DATE_OF_DEPARTURE; 
	private Timestamp ESTIMATED_DEPARTURE_TIME;
	public String getFLIGHT_NUMBER() {
		return FLIGHT_NUMBER;
	}
	public void setFLIGHT_NUMBER(String fLIGHT_NUMBER) {
		FLIGHT_NUMBER = fLIGHT_NUMBER;
	}
	public String getOPERATING_AIRLINES() {
		return OPERATING_AIRLINES;
	}
	public void setOPERATING_AIRLINES(String oPERATING_AIRLINES) {
		OPERATING_AIRLINES = oPERATING_AIRLINES;
	}
	public String getDEPARTURE_CITY() {
		return DEPARTURE_CITY;
	}
	public void setDEPARTURE_CITY(String dEPARTURE_CITY) {
		DEPARTURE_CITY = dEPARTURE_CITY;
	}
	public String getARRIVAL_CITY() {
		return ARRIVAL_CITY;
	}
	public void setARRIVAL_CITY(String aRRIVAL_CITY) {
		ARRIVAL_CITY = aRRIVAL_CITY;
	}
	public Date getDATE_OF_DEPARTURE() {
		return DATE_OF_DEPARTURE;
	}
	public void setDATE_OF_DEPARTURE(Date dATE_OF_DEPARTURE) {
		DATE_OF_DEPARTURE = dATE_OF_DEPARTURE;
	}
	public Timestamp getESTIMATED_DEPARTURE_TIME() {
		return ESTIMATED_DEPARTURE_TIME;
	}
	public void setESTIMATED_DEPARTURE_TIME(Timestamp eSTIMATED_DEPARTURE_TIME) {
		ESTIMATED_DEPARTURE_TIME = eSTIMATED_DEPARTURE_TIME;
	}

}
