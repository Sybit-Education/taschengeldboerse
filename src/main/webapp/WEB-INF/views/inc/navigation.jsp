<%-- 
    Document   : navigation
    Created on : 21.09.2015, 18:04:12
    Author     : ssr
    DIe navigationsleiste
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<nav class="navbar navbar-inverse hidden-print">


    <div class="container">
        <div class="navbar-header">
            <a class="navbar-brand" href="<c:url value="/"/>"> 
                <img alt="Taschengeldbörse" src="<c:url value="/resources/img/app.png" />" />
            </a>
            <a class="navbar-brand" href="<c:url value="/" />">Taschengeldbörse</a>

            <button type="button" class="navbar-toggle collapsed"
                    data-toggle="collapse" data-target="#navbar" aria-expanded="false"
                    aria-controls="navbar">
                <span class="sr-only">Toggle navigation</span> 
                <span class="icon-bar"></span> 
                <span class="icon-bar"></span> 
                <span class="icon-bar"></span>
            </button>

        </div>

        <div id="navbar" class="collapse navbar-collapse">
            <ul class="nav navbar-nav">
                <li class="dropdown">
                    <a href="<c:url value="/schueler"/>" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Schüler<span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<c:url value="/schueler" />">Bewerber</a></li>
                        <li><a href="<c:url value="/registrieren/schueler" />">Anmeldung</a></li>
                    </ul>
                </li> 
                <li class="dropdown">
                    <a href="<c:url value="/jobs"/>" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-expanded="false">Job-Anbieter <span class="caret"></span></a>
                    <ul class="dropdown-menu" role="menu">
                        <li><a href="<c:url value="/jobs" />">Job-Übersicht</a></li>
                        <li><a href="<c:url value="/registrieren/anbieter" />">Anmeldung</a></li>
                        <li><a href="<c:url value="/jobs/neu" />">Neuen Job anbieten</a></li>
                    </ul>
                </li>
                <li><a href="<c:url value="/about" />">Wir über uns</a></li>
            </ul>

        </div>
        <!--/.nav-collapse -->

    </div>
    <!-- closing container  -->
</nav>
<!-- closing navbar  -->


