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

            </div>


            <div class="row" id="gff">

                <div class="col-xs-4 col-md-4 col-lg-4">
                    <b>Bezeichnung:</b>
                    <c:forEach var="job" items="${jobList}"> 
                        <div class="row">
                            <a href="<c:url value='/job/detail?id=${job.id}'/>"> <c:out value="${job.bezeichnung}" /> </a>
                        </div>
                    </c:forEach>
                </div>

                <div class="col-xs-4 col-md-4 col-lg-4 hidden-xs">
                    <b>Ort:</b>
                    <c:forEach var="job" items="${jobList}">
                        <div class="row">
                            <a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> <c:out value="${job.ort}" /> </a>
                        </div>
                    </c:forEach>
                </div>

                <div class="col-xs-4 col-md-4 col-lg-4 hidden-xs">
                    <b>Datum:</b>
                    <c:forEach var="job" items="${jobList}">
                        <div class="row">
                            <a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> <c:out value="${job.datum}" /> </a>
                        </div>
                    </c:forEach>
                </div>



            </div>
            <%--<a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> </a> --%>
        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
