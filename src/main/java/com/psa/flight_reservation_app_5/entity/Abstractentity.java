package com.psa.flight_reservation_app_5.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Abstractentity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long ID;

	public long getID() {
		return ID;
	}

	public void setID(long iD) {
		ID = iD;
	}

}
