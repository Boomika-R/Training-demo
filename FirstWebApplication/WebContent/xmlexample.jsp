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
<%@taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<c:set var="chocolates">
<chocolates>
<chocolate>
<name>gone mad</name>
<flavor>strawberry</flavor>
</chocolate>
<chocolate>
<name>dairy milk</name>
<flavor>chocolate</flavor>
</chocolate>
<chocolate>
<name>milky bar</name>
<flavor>vanilla</flavor>
</chocolate>
</chocolates>
</c:set>
<x:parse xml="${chocolates}" var="out"/>
 <b>name of the chocolate</b>
<x:out select="$out/chocolates/chocolate[1]/name"/><br/>
<b>name of the flavor</b>
<x:out select="$out/chocolates/chocolate[2]/flavor"/><br/>
<x:choose>
<x:when select="$out//chocolate/name='gone mad'">
the chocolate is gone mad
</x:when>
<x:when select="$out//chocolate/name='milky bar'">
the chocolate is milky bar
</x:when>
<x:otherwise>
there is no chocolate
</x:otherwise>
</x:choose>
 
</body>
</html>