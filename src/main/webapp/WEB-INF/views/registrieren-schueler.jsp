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


            <form:form class="form-horizontal" action="/registrieren/schueler" method="post"  modelAttribute="schueler">
                <div class="row">
                    <div class="form-group col-sm-12">
                        <form:label path="anrede" class="col-sm-2 control-form:label">Anrede</form:label>
                            <div class="col-sm-2">
                            <form:select path="anrede" class="form-control col-sm-2">
                                <form:option value="Herr">Herr</form:option>
                                <form:option value="Frau">Frau</form:option>
                            </form:select>
                        </div>
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="vorname" class="col-sm-4 control-form:label">Vorname</form:label>
                        <div class="col-sm-6">
                        <form:input type="text" class="form-control" path="vorname" placeholder="Vorname" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="name" class="col-sm-4 control-form:label">Name</form:label>
                        <div class="col-sm-6">
                        <form:input type="text" class="form-control" path="name" placeholder="Name" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="geburtsdatum" class="col-sm-2 control-form:label">Geburtsdatum</form:label>
                        <div class="col-sm-2">
                        <form:input type="date" class="form-control" path="geburtsdatum" placeholder="TT.MM.JJJJ" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="email" class="col-sm-2 control-form:label">e-Mail</form:label>
                        <div class="col-sm-4">
                        <form:input type="text" class="form-control" path="email" placeholder="e-Mail" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="tel" class="col-sm-2 control-form:label">Telefon-Nr.</form:label>
                        <div class="col-sm-2">
                        <form:input type="text" class="form-control" path="tel" placeholder="Telefon-Nr." />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="street" class="col-sm-4 control-form:label">Straße</form:label>
                        <div class="col-sm-6">
                        <form:input type="text" class="form-control" path="street" placeholder="Straße" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="houseNumber" class="col-sm-4 control-form:label">Hausnummer</form:label>
                        <div class="col-sm-3">
                        <form:input type="text" class="form-control" path="houseNumber" placeholder="Haus-Nr." />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="postalCode" class="col-sm-4 control-form:label">PLZ</form:label>
                        <div class="col-sm-3">
                        <form:input type="text" class="form-control" path="postalCode" placeholder="PLZ" />
                    </div>
                </div>
                <div class="form-group col-sm-6">
                    <form:label path="city" class="col-sm-4 control-form:label">Wohnort</form:label>
                        <div class="col-sm-6">
                        <form:input type="text" class="form-control" path="city" placeholder="Wohnort" />
                    </div>
                </div>

                <div class="form-group">
                    <form:label path="job" class="col-sm-2 control-form:label">Jobvorstellungen</form:label>
                        <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="job" placeholder="Welche Jobs stellst du dir vor?" />
                    </div>
                </div>
                <div class="form-group">
                    <form:label path="time" class="col-sm-2 control-form:label">mögliche Einsatz-Zeiten</form:label>
                        <div class="col-sm-10">
                        <form:input type="time" class="form-control" path="time" placeholder="Wann hast du Zeit?" />
                    </div>
                </div>

                <div class="checkbox disabled">
                    <div class="col-sm-2"></div>
                    <form:label path="hatHaftpflichtVers">
                        <form:input type="checkbox" path="hatHaftpflichtVers" />
                        Ich besitze eine Haftpflichtversicherung.
                    </form:label>
                </div>
                <div class="checkbox disabled">
                    <div class="col-sm-2"></div>
                    <form:label path="hatUnfallVers">
                        <form:input type="checkbox" path="hatUnfallVers" />
                        Ich besitze eine Unfallversicherung.
                    </form:label>
                </div>
                <br/>
                <div class="checkbox disabled">
                    <div class="col-sm-2"></div>
                    <form:label path="hatMerkblattGelesen">
                        <form:input type="checkbox" path="hatMerkblattGelesen" />
                        Ich habe das Merkblatt gelesen.
                    </form:label>
                </div>
                <div class="checkbox disabled">
                    <div class="col-sm-2"></div>
                    <form:label path="hatDatenschutzGelesen">
                        <form:input type="checkbox" path="hatDatenschutzGelesen" />
                        Ich bin mit den Datenschutz-Richtlinien einverstanden.
                    </form:label>
                </div>
                <input class="btn btn-primary pull-right" type="submit" value="Speichern" />
                <input type="hidden"	path="${_csrf.parameterName}"	value="${_csrf.token}"/>

            </form:form>

        </div>





        <c:import url="inc/footer.jsp" />
    </body>
</html>