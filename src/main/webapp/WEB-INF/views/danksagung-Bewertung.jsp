<%-- 
    Document   : DanksagungFürBewertung
    Created on : 06.04.2016, 11:30:42
    Author     : Schulungsnb01
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <c:import url="inc/header.jsp" />
        <title>Danke</title>
    </head>
    
    <body>
        
        <c:import url="inc/navigation.jsp" />
        
        <h1 style="text-align: center">Vielen Dank für die Bewertung von ${anbieter.vorname} ${anbieter.name}</h1>
    
        <p style="font-size: 500px; text-align: center"> <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span> </p>
        
    <center>
        <a href="http://localhost:8084/taschengeldboerse/" style="font-size: 50px"><span class="glyphicon glyphicon-home" ></span> Home</a>
    </center>

        <c:import url="inc/footer.jsp" />
    </body>
    
</html>