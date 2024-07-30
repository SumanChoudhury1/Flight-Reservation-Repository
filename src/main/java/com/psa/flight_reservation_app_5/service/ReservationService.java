package com.psa.flight_reservation_app_5.service;

import com.psa.flight_reservation_app_5.dataTransferObj.ReservationRequest;
import com.psa.flight_reservation_app_5.entity.Reservation;

public interface ReservationService {
	
Reservation bookFlight(ReservationRequest request);

}
