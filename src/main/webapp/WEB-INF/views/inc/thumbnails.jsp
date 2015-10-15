<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<div class="col-xs-12 col-md-12 col-lg-12" style="margin-bottom: 15px;">
      <div class="col-xs-4 col-sm-4">
         <a href="<c:url value='/jobs?id=${job.id}'/>">
         </a>
      </div>
      <div class="col-xs-8 col-sm-8">
         <h4><a href="<c:url value='/jobs?id=${job.id}'/>">${job.bezeichnung}</a></h4>
      </div>
</div>
