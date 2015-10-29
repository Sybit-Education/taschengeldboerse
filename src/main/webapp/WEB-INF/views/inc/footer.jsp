<%-- 
    Document   : footer
    Created on : 12.10.2015, 12.10.2015 14:58:39
    Author     : ssr
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<script>
    function formSubmit() {
        document.getElementById("logoutForm").submit();
    }
</script>

<c:url value="/logout" var="logoutUrl" />

<!-- csrt for log out-->
<form action="${logoutUrl}" method="post" id="logoutForm">
    <input type="hidden" 
           name="${_csrf.parameterName}"
           value="${_csrf.token}" />
</form>


<div class="row">

    <p>&nbsp;</p>
    
    <div class="col-sm-1"></div>
    <div class="col-md-11">

        &copy; 2015 Sybit | 
        <a href="<c:url value="/impressum" />">Impressum</a> |
        <c:if test="${pageContext.request.userPrincipal.name != null}">
            Benutzer: ${pageContext.request.userPrincipal.name} | 
            <a href="javascript:formSubmit()"> Logout</a>	
        </c:if>
    </div>
</div>


