<%-- 
    Document   : anbieterListe
    Created on : 05.04.2016, 10:16:13
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
        <title>Anbieter Liste</title>
    </head>
    
    
    <body>
        
        <c:import url="inc/navigation.jsp" />
        
        <div class="container">
            
            <div class="page-header">
                <h1>Die Taschengeldbörse</h1>
            </div>
        
            <div class="panel panel-default">
                <table class="table">

                <div class="panel-heading" style="color : green">Anbieterliste</div>   
                
                <tr id="tabelle">
                        <th>Name</th>
                        <th>Bewertungen</th>
                        <th>Bewertungspunkte</th>
                        <th>Bewerten ?</th>
                </tr>  
                

                    <c:forEach var="anbieter" items="${anbieterListe}">


                        <tr>
                            <td>
                                ${anbieter.name}
                            </td>

                            <td>
                                ${anbieter.anzahlBewertungen}
                            </td>

                            <td>
                                ${anbieter.bewertungspunkteInsgesammt}
                            </td>

                            <td>
                                <button onclick="location.href = '<c:url value='/schueler/anbieterBewertung?id=${anbieter.id}'/>'" style="font-size: 12px">Bewerten</button>
                            </td>

                        </tr>


                    </c:forEach>


            </table>
            </div>
            
        
            <p>Nur Schueler können Anbieter bewerten.</p>
                
        
        </div>
         
        
        
        
        <c:import url="inc/footer.jsp" />
    </body>
</html>