<%-- 
    Document   : anbieter-detail
    Created on : 05.04.2016, 15:09:34
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
        <title>Bewerten</title>
    </head>
    
    
    <body>
        
        <c:import url="inc/navigation.jsp" />
        
        <h1 style="text-align: center">Ist ${anbieter.vorname} ${anbieter.name} ein/e gute/r Arbeitgeber/in?</h1>
        
        <p style="text-align: center; font-size: 20px">
            Beachte bei deiner Bewertung alles was zu einem guten Arbeitgeber gehört. <br> Ist er fair bzw. freundlich? Nutzt er dich aus? 
            Stimmt der Lohn?<br> Die Bewertung geht von 1 <span class="glyphicon glyphicon-thumbs-down" aria-hidden="true"></span> bis 5
            <span class="glyphicon glyphicon-thumbs-up" aria-hidden="true"></span>. <br>
            Wenn du ihm 5 punkte gibst bekommt er 5 punkte zu seiner aktuellen punktzahl dazu.<br>
            Das sind die Punkte die du auch unter "Schueler/Alle Anbieter" unter dem Tabellenpunkt "Bewertungspunkte" siehst.
        </p>
        <br>
        
        
        
<%--    <form action="#" style="text-align: center; font-size: 18px; margin: 40px"> 
            <select name="1_5" > 
                <option>1 sehr schlecht!</option> 
                <option>2 schlecht</option> 
                <option>3 geht so</option> 
                <option>4 gut</option> 
                <option>5 sehr gut!</option> 
            </select> 
</form> --%>

        <c:url var="bewertenUrl" value='/schueler/danksagungFuerBewertung?id=${anbieter.id}'/>
        <form:form name="Bewertungspunkte_auswahl" class="form-horizontal" action="${bewertenUrl}" method="post"  modelAttribute="bewertung">
            <center>
                <select name="Auswahl" size="1" onchange="speicherWerte()" style="font-size: 18px">
                    <option>1 sehr schlecht!</option>
                    <option>2 schlecht</option>
                    <option>3 mittel</option>
                    <option>4 gut</option>
                    <option>5 sehr gut!</option>
                </select>
            </center>
                
           <br>
           <form:input id="bewertungsInput" type="hidden" value="1" class="form-control" path="bewertungsZahl"/>   
           <center>
                <input type="submit" value="Bewertung abschicken"/>
            </center>
            
        </form:form>
        
        <script>
            
            function speicherWerte () {
                var ausgewaehlterIndex = document.Bewertungspunkte_auswahl.Auswahl.selectedIndex;
                ausgewaehlterIndex = ausgewaehlterIndex+1;
                
                var inputFeld = document.getElementById("bewertungsInput");
                inputFeld.value = ausgewaehlterIndex;
                
            }
            
        </script>
       
        
        
        <c:import url="inc/footer.jsp" />
        
    </body>
</html>
