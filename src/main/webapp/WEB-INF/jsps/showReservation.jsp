<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reservation Flight</title>
</head>
<body>
<h2>Flight Details</h2>
FLIGHT-NUMBER :- ${flight.FLIGHT_NUMBER }<br>
OPERATING-AIRLINES :- ${flight.OPERATING_AIRLINES}<br>
DEPARTURE-CITY :- ${flight.DEPARTURE_CITY }<br>
ARRIVAL-CITY :- ${flight.ARRIVAL_CITY}<br>
DEPARTURE-DATE :- ${flight.DATE_OF_DEPARTURE}<br>
<h2>Enter Passenger Details</h2>
<form action="confirmReservation" method="post">
	<pre>
		FIRST_NAME : <input type="text" name="FIRST_NAME"/><br>
		LAST_NAME : <input type="text" name="LAST_NAME"/><br>
		MIDDLE_NAME : <input type="text" name="MIDDLE_NAME"/><br>
		EMAIL : <input type="text" name="EMAIL"/><br>
		PHONE : <input type="text" name="PHONE"/><br>
		<input type="hidden" name="FlightId" value="${flight.ID}"/>
	</pre>
<h2>Enter Payment Details</h2>
	<pre>
		Card-Number : <input type="text" name="cardNumber"/><br>
		Card-Holder : <input type="text" name="cardHolderName"/><br>
		CVV-Number : <input type="text" name="cvvCode"/><br>
		Expiry-Date : <input type="text" name="expiryDate"/><br>
		<input type="submit" value="Complete Reservation"/>
	</pre>
</form>
</body>
</html>