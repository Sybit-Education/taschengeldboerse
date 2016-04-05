<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Job Detail :: Taschengeldbörse</title>

    </head>
    <body>

        <c:import url="inc/navigation.jsp" />


        <div class="container">
            <h1>Die Taschengeldbörse</h1>
            <h2>Job-Details</h2>
            <br/>
            <c:if test="${not empty error}">
                ${error}
            </c:if>
            
            
             <div class="col-md-9">
                 <div class="panel panel-default">
                    <div class="panel-heading">Job-Details</div>

                    <table class="table">
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-ok" aria-hidden="true"></span> Job: ${job.bezeichnung}
                        </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-user" aria-hidden="true"></span> Anbieter: ${anbieterName} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-map-marker" aria-hidden="true"></span> Ort: ${job.ort} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-calendar" aria-hidden="true"></span> Datum: ${job.datum} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-time" aria-hidden="true"></span> Uhrzeit: ${job.uhrzeit} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-hourglass" aria-hidden="true"></span> Zeitaufwand: ${job.zeitaufwand} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-eur" aria-hidden="true"></span> Entlohnung: ${job.entlohnung} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Info: ${job.zusaetzlicheInfos} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-envelope" aria-hidden="true"></span> Anbieter-Email: ${anbieter.email} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-phone" aria-hidden="true"></span> Telefonnummer: ${anbieter.telefonnummer} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-road" aria-hidden="true"></span> Straße: ${anbieter.strasse} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-globe" aria-hidden="true"></span> Postleitzahl: ${anbieter.plz} </div>
                        <div class="col-md-6">
                            <span class="glyphicon glyphicon-home" aria-hidden="true"></span> Wohnort: ${anbieter.wohnort} </div>
                        </div>
                    </table>
                  </div>   
            </div> 
            <c:url var = "action" value="/schueler/jobs/zuordnen?id=${job.id}" />
            <a class= "form-horizontal" href="${action}" >
                <input class="btn btn-primary pull-right" type="submit" value="Job Annehmen" ${disabled}/>
            </a>
        <c:import url="inc/footer.jsp" />
    </body>
</html>
