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
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="s" %>
<s:setDataSource var="db" driver="oracle.jdbc.OracleDriver" url="jdbc:oracle:thin:@localhost:1521:xe" user="boomika" password="boomika"/>
<%-- <s:update dataSource="${db}" var="u">
insert into product values(100,'pen',20,6)
</s:update> 
--%>

<s:update dataSource="${db}" >
<c:set var="p_id" value="333"/>
<c:set var="p_name" value="chain"/>
<c:set var="cost" value="90"/>
<c:set var="quantity" value="3"/>

insert into product values(?,?,?,?)
<s:param value="${p_id}"></s:param>
<s:param value="${p_name}"></s:param>
<s:param value="${cost}"></s:param>
<s:param value="${quantity}"></s:param>
</s:update>
<%-- 
<s:update>
 product set quantity=123 where p_id=100
</s:update>
--%>

<s:query dataSource="${db}" var="rs">
select * from product
</s:query>
<table>
<tr>
<th>p_id</th>
<th>p_name</th>
<th>cost</th>
<th>quantity</th>
</tr>
<c:forEach var="pd" items="${rs.rows}">
<tr>
<td>${pd.p_id}</td>
<td>${pd.p_name}</td>
<td>${pd.cost}</td>
<td>${pd.quantity}</td>
</tr>
</c:forEach>
</table>

</body>
</html>