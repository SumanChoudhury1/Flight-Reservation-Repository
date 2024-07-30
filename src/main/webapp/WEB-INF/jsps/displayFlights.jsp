<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Flight</title>
</head>
<body>
<h2>Flight Search Result</h2>

<h2>List of Flight</h2>

<table border="1">
  <tr>
  <th>Airlines</th>
  <th>Departure City</th>
  <th>Arrival City</th>
  <th>Departure Time</th>
  <th>Select Flight</th>
  </tr>
  <c:forEach items="${findFlights}" var="findFlights">
  
  <tr>
  
  <td>${findFlights.OPERATING_AIRLINES}</td>
  <td>${findFlights.DEPARTURE_CITY }</td>
  <td>${findFlights.ARRIVAL_CITY }</td>
  <td>${findFlights.ESTIMATED_DEPARTURE_TIME}</td>
  <td><a href="showCompleteReservation?FlightId=${findFlights.ID}">Select</a></td>
  
  </tr>
  
  </c:forEach>
  

</table>
</body>
</html>