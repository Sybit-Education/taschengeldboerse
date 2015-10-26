<%-- 
    Document   : login
    Created on : 20.02.2015, 17:07:46
    Author     : ssr
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Login :: Taschengeldbörse</title>
        <meta name="_csrf" content="${_csrf.token}"/>
        <meta name="_csrf_header" content="${_csrf.headerName}"/>
    </head>
    <body>
        <c:import url="inc/navigation.jsp" />
        <div class="container">
            &nbsp;<br>&nbsp;
            <form id="form" action="<c:url value='login' />" method="post">
                <div id="loginModal" class="modal-dialog modal-sm">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4 class="text-center" id="myModalLabel">Login</h4>
                        </div>
                        <div class="modal-body">
                            <div>
                                <c:if test="${not empty param.err}">
                                    <p class="bg-danger"> <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}" /> </p>
                                </c:if>
                                <c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION}">
                                    <p class="bg-danger">Die Zugangsdaten waren nicht korrekt.</p>
                                </c:if>
                                <c:if test="${not empty param.out}">
                                    <p class="bg-success">Erfolgreich abgemeldet.</p>
                                </c:if>
                                <c:if test="${not empty param.time}">
                                    <p class="bg-info">Die Sitzung ist leider abgelaufen.</p>
                                </c:if>
                            </div>

                            <div class="control-group">
                                <div class="controls">
                                    <input class="input-block-level" name="username" type="text" placeholder="E-Mail">
                                </div>
                            </div>
                            <div class="control-group">
                                <div class="controls">
                                    <input class="input-block-level" name="password" type="password" placeholder="Passwort">
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            Kein Zugang? <a href="<c:url value='registrieren' />" class="btn btn-large">Registrieren</a>
                            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                            <button class="btn btn-large btn-primary">Login</button>
                        </div>
                    </div>
                </div>

                <div class="row">
                    Benutzer Schüler: schueler/schueler<br /> 
                    Benutzer Anbieter: anbieter/anbieter <br />
                </div>
            </form>
        </div>

        <c:import url="inc/footer.jsp" />                            
    </body>
</html>