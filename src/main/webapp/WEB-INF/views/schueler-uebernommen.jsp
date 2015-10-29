<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Meine Jobs :: Taschengeldbörse</title>
    </head>
    <body>

        <c:import url="inc/navigation.jsp" />

        <div class="container">
          
            <div class="page-header">
                <h1>Meine übernommenen Jobs</h1>
                
            </div>
           
                
            <div class="row" id="gff">

                <table>   
                     <tr>
                         <th>Bezeichnung</th><th>Datum</th><th>Ort</th>
                     </tr>
                    <c:forEach var="job" items="${jobList}">
                        
                   
                        <tr>
                            <td><a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> <c:out value="${job.bezeichnung}" /> </a></td>
                            <td><a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> <c:out value="${job.datum}" /> </a></td>
                            <td><a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> <c:out value="${job.ort}" /> </a></td>
                        </tr>
                   
                       

                    </c:forEach>
                </table>
            </div>
        </div>
       <%--<a href="<c:url value='/schueler/jobs/detail?id=${job.id}'/>"> </a> --%>
        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
