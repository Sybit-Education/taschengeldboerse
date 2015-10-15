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
            
            <div class="page-header">
                <h1>Die Taschengeldbörse</h1>
                <h2>Jobs</h2>
            </div>
            
            <div class="row">
                <c:forEach var="job" items="${jobList}">
                    
                    <c:out value="${job.bezeichnung}" />
                </c:forEach>
            </div>

        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
