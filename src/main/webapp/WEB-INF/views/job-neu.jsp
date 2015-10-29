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
            <br>
            <h2>Neuen Job anlegen</h2>
            <p>&nbsp;</p>
            <c:url var = "action" value="/anbieter/jobs/neu" />
            <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="job">
                
                
                <c:if test="${not empty success}">
                    <div class="container col-sm-3">
                        <p><i><b><font color="green">${success}</font></b></i></p>
                    </div>
                </c:if>
                
                <div class="form-group">
                    <form:label path="bezeichnung" class="col-sm-2 control-label">Jobbezeichnung</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="bezeichnung" placeholder="Welche Art von Job wollen Sie anbieten?" />
                        <form:errors class="col-sm-12 error" path="bezeichnung" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="datum" class="col-sm-4 control-label">Erledigungsdatum</form:label>
                        <div class="col-sm-4">
                        <form:input type="date" class="form-control" path="datum" placeholder="TT.MM.JJJJ" />
                        <form:errors class="col-sm-12 error" path="datum" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="uhrzeit" class="col-sm-4 control-label">Uhrzeit</form:label>
                        <div class="col-sm-4">
                        <form:input type="text" class="form-control" path="uhrzeit" placeholder="HH:MM" />
                        <form:errors class="col-sm-12 error" path="uhrzeit" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="zeitaufwand" class="col-sm-4 control-label">Zeitaufwand</form:label>
                        <div class="col-sm-4"text>
                        <form:input type="text" class="form-control" path="zeitaufwand" placeholder="HH:MM" />
                        <form:errors class="col-sm-12 error" path="zeitaufwand" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="entlohnung" class="col-sm-4 control-label">Entlohnung</form:label>
                        <div class="col-sm-4">                     
                        <form:input type="text" class="form-control" path="entlohnung" placeholder="in €" />
                        <form:errors class="col-sm-12 error" path="entlohnung" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="zusaetzlicheInfos" class="col-sm-2 control-label">Zusatz-Informationen</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="zusaetzlicheInfos" placeholder="z.B. Regenkleidung, etc." />
                        <form:errors class="col-sm-12 error" path="zusaetzlicheInfos" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="ort" class="col-sm-2 control-label">Ort</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="ort" placeholder="Wo soll der Job ausgeführt werden?" />
                        <form:errors class="col-sm-12 error" path="ort" />
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
