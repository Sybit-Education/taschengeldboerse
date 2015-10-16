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
                <label for="salutation" class="col-sm-2 control-label">Anrede</label>
                <div class="col-sm-2">
                    <select id="salutation" class="form-control col-sm-2">
                        <option>Herr</option>
                        <option>Frau</option>
                    </select>
                </div>
            </div>
        </div>
            <div class="form-group col-sm-6">
                <label for="inputFirstName" class="col-sm-4 control-label">Vorname</label>
                <div class="col-sm-6">
                    <input type="name1" class="form-control" id="inputFirstName" placeholder="Vorname">
                </div>
            </div>
            <div class="form-group col-sm-6">
                <label for="inputName" class="col-sm-4 control-label">Name</label>
                <div class="col-sm-6">
                <input type="name2" class="form-control" id="inputName" placeholder="Name">
                </div>
            </div>
        <div class="form-group">
            <label for="inputDate" class="col-sm-2 control-label">Geburtsdatum</label>
            <div class="col-sm-2">
            <input type="date" class="form-control" id="inputDate" placeholder="TT.MM.JJJJ">
            </div>
        </div>
        <div class="form-group">
            <label for="inputEmail" class="col-sm-2 control-label">e-Mail</label>
            <div class="col-sm-4">
            <input type="email" class="form-control" id="inputEmail" placeholder="e-Mail">
            </div>
        </div>
        <div class="form-group">
            <label for="inputTel" class="col-sm-2 control-label">Telefon-Nr.</label>
            <div class="col-sm-2">
            <input type="tel" class="form-control" id="inputTel" placeholder="Telefon-Nr.">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="inputStreet" class="col-sm-4 control-label">Straße</label>
            <div class="col-sm-6">
            <input type="adresse1" class="form-control" id="inputStreet" placeholder="Straße">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="inputHouseNumber" class="col-sm-4 control-label">Hausnummer</label>
            <div class="col-sm-3">
            <input type="adresse1" class="form-control" id="inputHouseNumber" placeholder="Haus-Nr.">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="inputPostalCode" class="col-sm-4 control-label">PLZ</label>
            <div class="col-sm-3">
            <input type="adresse2" class="form-control" id="inputPostalCode" placeholder="PLZ">
            </div>
        </div>
        <div class="form-group col-sm-6">
            <label for="inputCity" class="col-sm-4 control-label">Wohnort</label>
            <div class="col-sm-6">
            <input type="adresse3" class="form-control" id="inputCity" placeholder="Wohnort">
            </div>
        </div>
        
        <div class="form-group">
            <label for="inputJob" class="col-sm-2 control-label">Jobvorstellungen</label>
            <div class="col-sm-10">
            <input type="jobs" class="form-control" id="inputJob" placeholder="Welche Jobs stellst du dir vor?">
            </div>
        </div>
        <div class="form-group">
            <label for="inputTime" class="col-sm-2 control-label">mögliche Einsatz-Zeiten</label>
            <div class="col-sm-10">
            <input type="time" class="form-control" id="inputTime" placeholder="Wann hast du Zeit?">
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