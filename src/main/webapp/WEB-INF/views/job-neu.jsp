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
            <h2>Neuen Job anlegen</h2>
         
            <c:url var = "action" value="/jobs/neu" />
            <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="job">
            
                <div class="form-group">
                    <form:label path="bezeichnung" class="col-sm-2 control-form:label">Jobbezeichnung</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="bezeichnung" placeholder="Welche Art von Job wollen Sie anbieten?" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="datum" class="col-sm-4 control-form:label">Erledigungsdatum</form:label>
                        <div class="col-sm-4">
                        <form:input type="date" class="form-control" path="datum" placeholder="TT.MM.JJJJ" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="uhrzeit" class="col-sm-4 control-form:label">Uhrzeit</form:label>
                        <div class="col-sm-4">
                        <form:input type="date" class="form-control" path="uhrzeit" placeholder="HH:MM" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="zeitaufwand" class="col-sm-4 control-form:label">Zeitaufwand</form:label>
                        <div class="col-sm-4">
                        <form:input type="date" class="form-control" path="zeitaufwand" placeholder="HH:MM" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="entlohnung" class="col-sm-4 control-form:label">Entlohnung</form:label>
                        <div class="col-sm-4">
                        <form:input type="text" class="form-control" path="entlohnung" placeholder="__€" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="zusaetzlicheInfos" class="col-sm-2 control-form:label">Zusatz-Informationen</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="zusaetzlicheInfos" placeholder="z.B. Regenkleidung, etc." />
                    </div>
                </div>
                <input class="btn btn-primary pull-right" type="submit" value="Speichern" />
                <input type="hidden"	path="${_csrf.parameterName}"	value="${_csrf.token}"/>
                <form:hidden path="id" />
            </form:form>
        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
