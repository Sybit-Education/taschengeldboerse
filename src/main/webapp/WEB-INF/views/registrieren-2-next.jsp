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

            <h2>Registrieren: Schüler oder Anbieter?</h2>

            <div class="row">
                <div class="col-sm-6">
                    <c:url var = "action" value="/registrieren-2-next" />
                    <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="user">

                        <input type="hidden" name="email" value="${user.email}" />
                        <input type="hidden" name="authority" value="ROLE_SCHUELER" />
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                        <input type="submit"class="btn btn-primary pull-left"  value="Schüler" />
                    </form:form>                    
                </div>
                <div class="col-sm-6">
                    <c:url var = "action" value="/registrieren-2-next" />
                    <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="user">

                        <input type="hidden" name="email" value="${user.email}" />
                        <input type="hidden" name="authority" value="ROLE_ANBIETER" />
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

                        <input type="submit"class="btn btn-primary pull-left"  value="Anbieter" />
                    </form:form>                    
                </div>                
            </div>
                    
        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>