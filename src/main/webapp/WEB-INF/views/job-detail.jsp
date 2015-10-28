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



            <div class="row">
                <div class="col-md-3">
                    <b>Bezeichnung:</b>
                </div>
                <div class="col-md-9">
                    <c:out  value=" ${job.bezeichnung} "/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <b>Anbieter: </b>
                </div>
                <div class="col-md-9">
                    <c:out  value=" ${anbieter} "/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <b>Ort:</b>
                </div>
                <div class="col-md-9">
                    <c:out  value=" ${job.ort} "/>
                </div>
            </div>                    
            <div class="row">
                <div class="col-md-3">
                    <b>Datum:</b>
                </div>
                <div class="col-md-9">
                    <c:out value="${job.datum}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <b>Uhrzeit:</b>
                </div>
                <div class="col-md-9">
                    <c:out value="${job.uhrzeit}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <b>Zeitaufwand:</b>
                </div>
                <div class="col-md-9">
                    <c:out value="${job.zeitaufwand}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <b>Entlohnung:</b>
                </div>
                <div class="col-md-9">
                    <c:out value="${job.entlohnung}"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-3">
                    <b>Zusatz-Informationen:</b>
                </div>
                <div class="col-md-9">
                    <c:out value="${job.zusaetzlicheInfos}"/>
                </div>
            </div>
            <c:url var = "action" value="/jobs/zuordnen" />
            <form:form class= "form-horizontal" action="${action}" method="post" modelAttribute="job">

                <input class="btn btn-primary pull-right" type="submit" value="Job Annehmen" />
                <form:hidden path="id" />
                <input type="hidden"	path="${_csrf.parameterName}"	value="${_csrf.token}"/>

            </form:form>

        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
