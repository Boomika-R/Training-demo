<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="salary" value="5474"/>
<c:if test="${salary>15000 }">
salary is good<c:out value="${salary}"/>
</c:if>
<c:if test="${salary<15000 }">
<c:choose>
<c:when test="${salary>15000 }">
salary is good<c:out value="${salary}"/>
</c:when>
<c:when test="${salary<15000 }">
salary is not good <c:out value="${salary}"/>
</c:when>
</c:choose>
</c:if>
<c:catch var="catchExample">
<% int x=2/0; %>
</c:catch>
<c:if test="${catchExample!=null }">
<p> The exception occured ${catchExample}</p>
</c:if>
<c:forEach var="j" begin="3" end="69" step="6">${j}</c:forEach>


</body>
</html>