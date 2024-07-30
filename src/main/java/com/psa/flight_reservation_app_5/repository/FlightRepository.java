package com.psa.flight_reservation_app_5.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.psa.flight_reservation_app_5.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
      @Query("from Flight where DEPARTURE_CITY=:DEPARTURE_CITY and ARRIVAL_CITY=:ARRIVAL_CITY and DATE_OF_DEPARTURE=:DATE_OF_DEPARTURE")
      List<Flight> findFlights(@Param("DEPARTURE_CITY") String from,@Param("ARRIVAL_CITY") String to,@Param("DATE_OF_DEPARTURE") Date departureDate);

}
