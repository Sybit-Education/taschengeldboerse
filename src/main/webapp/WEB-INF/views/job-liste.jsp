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

                <div class="panel panel-default">
                  <!-- Default panel contents -->
                  <div class="panel-heading" style="color : green">Jobuebersicht</div>

                  <!-- Table -->
                  <table class="table">
                      <tr id="tabelle">
                          <th>Bezeichnung</th>
                          <th>Ort</th>
                          <th>Datum</th>
                      </tr>
                      <c:forEach var="job" items="${jobList}"> 
                        <tr onclick="location.href = '<c:url value='/job/detail?id=${job.id}'/>'" style="cursor: pointer">
                                <td>${job.bezeichnung}</td>
                                <td>${job.ort}</td>
                                <td>${job.datum}</td>
                        </tr>
                      </c:forEach>
                  </table>
                </div>
               </div>
        
        <c:import url="inc/footer.jsp" />
    </body>
</html>
