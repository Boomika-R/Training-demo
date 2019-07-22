<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fm" uri="http://java.sun.com/jsp/jstl/fmt" %>
<h1>Formatting Number</h1>
<c:set value="23332419.76786787" var="salary" />
<fm:formatNumber value="${salary}" type="currency"></fm:formatNumber><br/>
<fm:formatNumber value="${salary}" type="percent"></fm:formatNumber><br/>
<fm:formatNumber value="${salary}" type="number" groupingUsed="false"></fm:formatNumber><br/>
<c:set var="date"  value="<%=new java.util.Date()%>"></c:set>
<fm:formatDate value="${date}" type="date" timeStyle="long" dateStyle="medium"/><br/>
<fm:formatDate value="${date}" type="time" timeStyle="long" dateStyle="short"/><br/>
<fm:formatDate value="${date}" type="both" timeStyle="short" dateStyle="long"/><br/>
<fm:formatDate value="${date}" type="date" pattern="MMM/dd/yyyy"/>
</body>
</html>