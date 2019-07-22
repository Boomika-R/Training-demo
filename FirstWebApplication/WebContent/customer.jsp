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
<%@include file="buyer.html" %>
Logged in as ${sessionScope.sname}
<table>
<tr>
<th>p_id</th>
<th>p_name</th>
<th>cost</th>
<th>quantity</th>
<th colspan='2'></th>
</tr>
<c:forEach items="${sessionScope.products}" var="p">
<tr>
<td>${p.p_id}</td>
<td>${p.p_name}</td>
<td>${p.cost}</td>
<td>${p.quantity}</td>
<td><a href="buy?p_id=${p.p_id}">buy</a></td>
</tr>
</c:forEach>
</table>
<body>
</html>