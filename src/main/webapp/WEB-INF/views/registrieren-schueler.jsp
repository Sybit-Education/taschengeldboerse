<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>

<html>
    <head>
        <c:import url="inc/header.jsp" />
        <title>Schueler registrieren :: Taschengeldbörse</title>
    </head>
    <body>

        <c:import url="inc/navigation.jsp" />

        <div class="container">

            <h2>Anmeldung Schüler</h2>

            <c:url var = "action" value="/registrieren/schueler" />
            <form:form class="form-horizontal" action="${action}" method="post"  modelAttribute="schueler">
               
                <div class="form-group col-sm-6">
                    <form:label path="anrede" class="col-sm-4 control-label">Anrede</form:label>
                    <div class="col-sm-8">
                        <form:select path="anrede" class="form-control col-sm-8">
                            <form:option value="Herr">Herr</form:option>
                            <form:option value="Frau">Frau</form:option>
                        </form:select>
                    </div>
                </div>
                    
                <div class="form-group col-sm-6">
                    <form:label path="geburtsdatum" class="col-sm-4 control-label">Geburtsdatum*</form:label>
                    <div class="col-sm-8">
                        <form:input type="date" class="form-control" path="geburtsdatum" placeholder="TT.MM.JJJJ" />
                        <small><form:errors class="col-sm-12 error" path="geburtsdatum" /></small>
                    </div>
                </div>
                
                <div class="form-group col-sm-6">
                    <form:label path="vorname" class="col-sm-4 control-label">Vorname*</form:label>
                    <div class="col-sm-8">
                        <form:input type="text" class="form-control" path="vorname" placeholder="Vorname" />
                        <small><form:errors class="col-sm-12 error" path="vorname" /></small>
                    </div>
                </div>
                    
                <div class="form-group col-sm-6">
                    <form:label path="name" class="col-sm-4 control-label">Name*</form:label>
                    <div class="col-sm-8">
                        <form:input type="text" class="form-control" path="name" placeholder="Name" />
                        <small><form:errors class="col-sm-12 error" path="name" /></small>
                    </div>
                </div>
                    
                <div class="form-group col-sm-6">
                    <form:label path="email" class="col-sm-4 control-label">e-Mail*</form:label>
                    <div class="col-sm-8">
                        <form:input type="text" disabled="true" class="form-control" path="email" placeholder="e-Mail" />
                        <small><form:errors class="col-sm-12 error" path="email" /></small>
                    </div>
                </div>
                    
                <div class="form-group col-sm-6">
                    <form:label path="telefon" class="col-sm-4 control-label">Telefon-Nr.</form:label>
                    <div class="col-sm-8">
                        <form:input type="text" class="form-control" path="telefon" placeholder="Telefon-Nr." />
                    </div>
                </div>
                    
                <div class="form-group col-sm-12">
                    <form:label path="strasse" class="col-sm-2 control-label">Straße, Nr.*</form:label>
                    <div class="col-sm-10">
                        <form:input type="text" class="form-control" path="strasse" placeholder="Straße, Nr." />
                        <small><form:errors class="col-sm-12 error" path="strasse" /></small>
                    </div>
                </div>

                <div class="form-group">
                    <form:label path="plz" class="col-sm-2 control-label">PLZ, Wohnort*</form:label>
                    <div class="col-sm-2">
                        <form:input type="text" class="form-control" path="plz" placeholder="PLZ" />
                        <small><form:errors class="col-sm-12 error " path="plz" /></small> 
                    </div>
                    <div class="col-sm-8">
                        <form:input type="text" class="form-control" path="wohnort" placeholder="Wohnort" />
                        <small><form:errors class="col-sm-12 error" path="wohnort" /></small>
                    </div>
                </div>

                <div class="form-group">
                    <form:label path="jobBeschreibung" class="col-sm-2 control-label">Jobvorstellungen</form:label>
                    <div class="col-sm-10">
                        <textarea type="text" class="form-control" rows="3" path="jobBeschreibung" placeholder="Welche Jobs stellst du dir vor?" ></textarea>
                    </div>
                </div>
                    
                <div class="form-group">
                    <form:label path="jobZeit" class="col-sm-2 control-label">mögliche Einsatz-Zeiten</form:label>
                    <div class="col-sm-5">
                        <textarea type="time" class="form-control" rows="2" path="jobZeit" placeholder="Wann hast du Zeit?" ></textarea>
                    </div>
                </div>
                        
                <div class="checkbox">
                    <div class="col-sm-2"></div>
                    <form:label path="hatHaftpflichtVers">
                        <form:checkbox path="hatHaftpflichtVers" />
                        Ich besitze eine Haftpflichtversicherung.
                    </form:label>
                </div>
                        
                <div class="checkbox">
                    <div class="col-sm-2"></div>
                    <form:label path="hatUnfallVers">
                        <form:checkbox  path="hatUnfallVers" />
                        Ich besitze eine Unfallversicherung.
                    </form:label>
                </div>
                <br/>
                <div class="checkbox">
                    <div class="col-sm-2"></div>
                    <form:label path="hatMerkblattGelesen">
                        <form:checkbox path="hatMerkblattGelesen" />
                        Ich habe das Merkblatt gelesen.*
                    </form:label>
                </div>
                
                <div class="checkbox">
                    <div class="col-sm-2"></div>
                    <form:label path="hatDatenschutzGelesen">
                        <form:checkbox  path="hatDatenschutzGelesen" />
                        Ich bin mit den Datenschutz-Richtlinien einverstanden.*
                    </form:label>
                </div>
                
                <input class="btn btn-primary pull-right" type="submit" value="Speichern" />
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                <form:hidden path="id" />
            </form:form>

        </div>

        <c:import url="inc/footer.jsp" />
    </body>
</html>
