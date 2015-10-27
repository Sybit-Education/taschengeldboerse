<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Registrieren :: Taschengeldbörse</title>

    </head>
    <body>

        <c:import url="inc/navigation.jsp" />

        <div class="container">

            <h2>Neu registrieren</h2>
            
            <c:if test='${not empty error}'>
                <div>${error}</div>
            </c:if>

            <c:url var = "action" value="/registrieren" />
            <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="user">

                <div class="form-group">
                    <form:label path="email" class="control-label col-sm-2">e-Mail</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="email" placeholder="e-Mail" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="password" class="control-label col-sm-2">Passwort</form:label>
                        <div class="col-sm-10">
                        <form:password class="form-control" path="password" />
                    </div>
                </div>

                <input class="btn btn-primary pull-right" type="submit" value="Registrieren..." />
                <input type="hidden"	path="${_csrf.parameterName}"	value="${_csrf.token}"/>
            </form:form>

        </div>


        <c:import url="inc/footer.jsp" />
    </body>
</html>