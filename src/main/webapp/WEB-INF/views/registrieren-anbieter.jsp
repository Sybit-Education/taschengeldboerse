<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Jobübersicht :: Taschengeldbörse</title>

    </head>
    <body>

        <c:import url="inc/navigation.jsp" />

        <div class="container">

            <h2>Neuer Job-Anbieter kann sich anmelden</h2>

            <c:url var = "action" value="/registrieren/anbieter" />
            <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="anbieter">
                <div class="row">
                    <div class="form-group col-sm-12">
                        <form:label path="anrede" class="col-sm-2 control-label">Anrede</form:label>
                            <div class="col-sm-2">
                            <form:select path="anrede" class="form-control col-sm-2">
                                <form:option value="Herr">Herr</form:option>
                                <form:option value="Frau">Frau</form:option>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="vorname" class="col-sm-4 control-form:label">Vorname</form:label>
                        <div class="col-sm-6">
                        <form:input type="text" class="form-control" path="vorname" placeholder="Vorname" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="name" class="col-sm-4 control-form:label">Name</form:label>
                        <div class="col-sm-6">
                        <form:input type="text" class="form-control" path="name" placeholder="Name" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="email" class="col-sm-2 control-label">e-Mail</form:label>
                        <div class="col-sm-4">
                        <form:input type="text" class="form-control" path="email" placeholder="e-Mail" />
                    </div>
                </div>
                <input class="btn btn-primary pull-right" type="submit" value="Speichern" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <form:hidden path="id" />
            </form:form>

        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>