<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Taschengeldboerse</title>
    </head>
    <body>
        <c:import url="inc/navigation.jsp" />
        
        <div id="myCarousel" class="carousel slide" data-ride="carousel">
          <!-- Indicators -->
            <ol class="carousel-indicators">
              <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
              <li data-target="#myCarousel" data-slide-to="1"></li>
              <li data-target="#myCarousel" data-slide-to="2"></li>
              <li data-target="#myCarousel" data-slide-to="3"></li>
              <li data-target="#myCarousel" data-slide-to="4"></li>
            </ol>

          <!-- Wrapper for slides -->
            <div class="carousel-inner" role="listbox">
                <%--<div class="item active">
                    <iframe width="100%" height="100%" src="https://goanimate.com/player/embed/0RVNfApDj9Gk" frameborder="0" allowfullscreen=""></iframe>
                </div>--%>
                
                <div class="item active">
                    <img src="<c:url value="/resources/img/WirSlider.jpg" />" alt="Wir über uns">
                    <div class="carousel-caption">
                    </div>
                </div>
                <div class="item">
                    <img src="<c:url value="/resources/img/DogSlider.jpg" />" alt="DogWalk">
                </div>
                <div class="item">
                    <img src="<c:url value="/resources/img/MoneySlider.jpg" />" alt="Money">
                </div>
                <div class="item">
                    <img src="<c:url value="/resources/img/GardenSlider.jpg" />" alt="Garden">
                </div>
                <div class="item">
                    <img src="<c:url value="/resources/img/SupermarktSlider.jpg" />" alt="Supermarkt">
                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>
              
        <div class="container" id="thumbnailContainer">
            <div class="row">
                <div class="col-sm-6 col-md-4">
                  <div class="thumbnail">
                    <img src="<c:url value="/resources/img/Flo.JPG" />" alt="Flo">
                    <div class="caption">
                      <h3>Schüler</h3>
                      <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
                         sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
                         sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
                         Stet clita kasd gubergren, no sea takimata sanctus est Lorem 
                         ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, 
                         sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
                         sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
                         Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 col-md-4">
                  <div class="thumbnail">
                    <div class="caption">
                      <h3>Starte Jetzt!</h3>
                       <p>Registriere Dich heute noch!</p>
                      <p><a href="#" class="btn btn-primary" role="button" >Jetzt registrieren</a></p>
                    </div>
                  </div>
                </div>
                <div class="col-sm-6 col-md-4">
                  <div class="thumbnail">
                    <img src="<c:url value="/resources/img/Elfriede.JPG" />" alt="Elfried">
                    <div class="caption">
                      <h3>Anbieter</h3>
                      <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr,
                         sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
                         sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
                         Stet clita kasd gubergren, no sea takimata sanctus est Lorem 
                         ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, 
                         sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, 
                         sed diam voluptua. At vero eos et accusam et justo duo dolores et ea rebum. 
                         Stet clita kasd gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.</p>
                    </div>
                  </div>
                </div>
            </div>
        </div>
        <c:import url="inc/footer.jsp" />
    </body>
</html>
