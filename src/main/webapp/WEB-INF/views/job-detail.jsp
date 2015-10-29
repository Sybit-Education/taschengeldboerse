<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Job anlegen :: Taschengeldbörse</title>

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

            <div class="col-md-6">
            <div class="row">
                <div class="col-md-6">
                    <b>Bezeichnung:</b>
                </div>
                <div class="col-md-6">
                    <c:out  value=" ${job.bezeichnung} "/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <b>Anbieter: </b>
                </div>
                <div class="col-md-6">
                    <c:out  value=" ${anbieterName} "/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <b>Ort:</b>
                </div>
                <div class="col-md-6">
                    <c:out  value=" ${job.ort} "/>
                </div>
            </div>                    
            <div class="row">
                <div class="col-md-6">
                    <b>Datum:</b>
                </div>
                <div class="col-md-6">
                    <c:out value="${job.datum}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <b>Uhrzeit:</b>
                </div>
                <div class="col-md-6">
                    <c:out value="${job.uhrzeit}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <b>Zeitaufwand:</b>
                </div>
                <div class="col-md-6">
                    <c:out value="${job.zeitaufwand}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <b>Entlohnung:</b>
                </div>
                <div class="col-md-6">
                    <c:out value="${job.entlohnung}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-6">
                    <b>Zusatz-Informationen:</b>
                </div>
                <div class="col-md-6">
                    <c:out value="${job.zusaetzlicheInfos}"/>
                </div>
            </div>
            </div>    
            <div class="col-md-6">    
            <c:if test="${not empty anbieter}">
                <div class="col-md-6">
                    <b>E-Mail:</b>
                </div>
                <div class="col-md-6">
                <c:out value="${anbieter.email}"/>
                </div>
            </c:if>
                
            <c:if test="${not empty anbieter}">
                <div class="col-md-6">
                    <b>Telefonnummer:</b>
                </div>
                <div class="col-md-6">
                <c:out value="${anbieter.telefonnummer}"/>
                </div>
            </c:if>
                
            <c:if test="${not empty anbieter}">
                <div class="col-md-6">
                    <b>Straße:</b>
                </div>
                <div class="col-md-6">
                <c:out value="${anbieter.strasse}"/>
                </div>
            </c:if>
                
                <c:if test="${not empty anbieter}">
                <div class="col-md-6">
                    <b>Postleitzahl:</b>
                </div>
                <div class="col-md-6">
                <c:out value="${anbieter.plz}"/>
                </div>
            </c:if>
                
            <c:if test="${not empty anbieter}">
                <div class="col-md-6">
                    <b>Wohnort:</b>
                </div>
                <div class="col-md-6">
                <c:out value="${anbieter.wohnort}"/>
                </div>
            </c:if>
            </div>    
                
            <c:url var = "action" value="/schueler/jobs/zuordnen?id=${job.id}" />
            <a class= "form-horizontal" href="${action}" >
                <input class="btn btn-primary pull-right" type="submit" value="Job Annehmen" />
            </a>

        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
