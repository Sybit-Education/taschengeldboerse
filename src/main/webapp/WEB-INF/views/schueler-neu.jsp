<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Schueler anmelden :: Taschengeldbörse</title>

    </head>
    <body>

        <c:import url="inc/navigation.jsp" />

        <div class="container">
            <h1>Die Taschengeldbörse</h1>
            <h2>Anmeldung Schüler</h2>
    
 
            <form class="form-horizontal" action="<c:url value="/schueler/neu" />" method="post">
        <div class="row">
            <div class="form-group col-sm-12">
                <label for="anrede" class="col-sm-2 control-label">Anrede</label>
                <div class="col-sm-2">
                    <select name="anrede" class="form-control col-sm-2">
                        <option>Herr</option>
                        <option>Frau</option>
                    </select>
                </div>
            </div>
        </div>
            <div class="form-group col-sm-6">
                <label for="vorname" class="col-sm-4 control-label">Vorname</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="vorname" placeholder="Vorname">
                </div>
            </div>
            <div class="form-group col-sm-6">
                <label for="name" class="col-sm-4 control-label">Name</label>
                <div class="col-sm-6">
                <input type="text" class="form-control" name="name" placeholder="Name">
                </div>
            </div>
        <div class="form-group">
            <label for="date" class="col-sm-2 control-label">Geburtsdatum</label>
            <div class="col-sm-2">
            <input type="date" class="form-control" name="date" placeholder="TT.MM.JJJJ">
            </div>
        </div>
        <div class="form-group">
            <label for="email" class="col-sm-2 control-label">e-Mail</label>
            <div class="col-sm-4">
            <input type="text" class="form-control" name="email" placeholder="e-Mail">
            </div>
        </div>
        <div class="form-group">
            <label for="tel" class="col-sm-2 control-label">Telefon-Nr.</label>
            <div class="col-sm-2">
            <input type="text" class="form-control" name="tel" placeholder="Telefon-Nr.">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="street" class="col-sm-4 control-label">Straße</label>
            <div class="col-sm-6">
            <input type="text" class="form-control" name="street" placeholder="Straße">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="houseNumber" class="col-sm-4 control-label">Hausnummer</label>
            <div class="col-sm-3">
            <input type="text" class="form-control" name="houseNumber" placeholder="Haus-Nr.">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="postalCode" class="col-sm-4 control-label">PLZ</label>
            <div class="col-sm-3">
            <input type="text" class="form-control" name="postalCode" placeholder="PLZ">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="city" class="col-sm-4 control-label">Wohnort</label>
            <div class="col-sm-6">
            <input type="text" class="form-control" name="city" placeholder="Wohnort">
            </div>
        </div>
        
        <div class="form-group">
            <label for="job" class="col-sm-2 control-label">Jobvorstellungen</label>
            <div class="col-sm-10">
            <input type="text" class="form-control" name="job" placeholder="Welche Jobs stellst du dir vor?">
            </div>
        </div>
        <div class="form-group">
            <label for="time" class="col-sm-2 control-label">mögliche Einsatz-Zeiten</label>
            <div class="col-sm-10">
            <input type="time" class="form-control" name="time" placeholder="Wann hast du Zeit?">
            </div>
        </div>
            
        <div class="checkbox disabled">
            <div class="col-sm-2"></div>
            <label>
                <input type="checkbox" value="guarantee1">
                Ich besitze eine Haftpflichtversicherung.
            </label>
        </div>
        <div class="checkbox disabled">
            <div class="col-sm-2"></div>
            <label>
                <input type="checkbox" value="guarantee2">
                Ich besitze eine Unfallversicherung.
            </label>
        </div>
            <br/>
        <div class="checkbox disabled">
            <div class="col-sm-2"></div>
            <label>
                <input type="checkbox" value="dataSheet1">
                Ich habe das Merkblatt gelesen.
            </label>
        </div>
        <div class="checkbox disabled">
            <div class="col-sm-2"></div>
            <label>
                <input type="checkbox" value="dataSheet2">
                Ich bin mit den Datenschutz-Richtlinien einverstanden.
            </label>
        </div>
            <input class="btn btn-primary pull-right" type="submit" value="Speichern" />
                  <input type="hidden"	name="${_csrf.parameterName}"	value="${_csrf.token}"/>
            
    </form>
            
        </div>


        
       
        
        <c:import url="inc/footer.jsp" />
    </body>
</html>