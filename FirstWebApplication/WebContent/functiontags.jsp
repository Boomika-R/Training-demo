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
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<c:set value="i love my family" var="fam"/>
<c:set value="good girl" var="g"/>
<c:if test="${fn:containsIgnoreCase(fam,'my')}"/>
<p> the string contains ""my"</p>
the string starts with "i":${fn:startsWith(fam,'i')}<br/>
the string ends with "z":${fn:endsWith(fam,'z')}<br/>

</body>
</html>