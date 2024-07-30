package com.psa.flight_reservation_app_5.service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.psa.flight_reservation_app_5.dataTransferObj.ReservationRequest;
import com.psa.flight_reservation_app_5.entity.Flight;
import com.psa.flight_reservation_app_5.entity.Passenger;
import com.psa.flight_reservation_app_5.entity.Reservation;
import com.psa.flight_reservation_app_5.repository.FlightRepository;
import com.psa.flight_reservation_app_5.repository.PassengerRepository;
import com.psa.flight_reservation_app_5.repository.ReservationRepository;

@Service
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private PassengerRepository passengerRepo;
	
	@Autowired
	private FlightRepository flightRepo;
	
	@Autowired
	private ReservationRepository reservationRepo;

	@Override
	public Reservation bookFlight(ReservationRequest request) {
		
		Passenger passenger = new Passenger();
		passenger.setFIRST_NAME(request.getFIRST_NAME());
		passenger.setLAST_NAME(request.getLAST_NAME());
		passenger.setMIDDLE_NAME(request.getMIDDLE_NAME());
		passenger.setEMAIL(request.getEMAIL());
		passenger.setPHONE(request.getPHONE());
		passengerRepo.save(passenger);
		
		long flightId = request.getFlightId();
		Optional<Flight> findById = flightRepo.findById(flightId );
		Flight flight = findById.get();
		
		Reservation reservation = new Reservation();
		reservation.setFlight(flight);
		reservation.setPassenger(passenger);
		reservation.setCHECKED_IN(false);
		reservation.setNUMBER_OF_BAGS(0);
		reservationRepo.save(reservation);
		return reservation;
	}
}