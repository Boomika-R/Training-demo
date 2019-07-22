<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
</style>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set value="${requestScope.prod}" var="p"></c:set>
<form action="AddproductServlet">
Product id:
<input type="text" name="p_id" readonly="readonly" value="${p.p_id}" ><br/>
<br/>
Product name:
<input type="text" name="p_name" value="${p.p_name}"><br/>
<br/>
Product cost:
<input type="text" name="cost" value="${p.cost}"><br/>
<br/>
Product quantity:
<input type="text" name="quantity" value="${p.quantity}"><br/>
<br/>
<input type="submit" value="add product">
<input type="reset" value="cancel">
</form>

</body>
</html>