<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	現在時刻:<%=new Date()%>
	<hr />
	<ol>
		<li><a href="./servlet/bmi?h=170&w=60">BmiServlet</a></li>
		<li><a href="./servlet/circle?r=10">CircleServlet</a></li>
		<li><a href="./servlet/random?n=10">CircleServlet</a></li>
		<li><A href="./servlet/lotto">LottoHttpServlet</A></li>
		<li><A href="./form/bmi_form.jsp">bmi_form.jsp</A></li>
		<li><A href="./servlet/circlecalc">CircleCalcHttpServlet</A></li>
		<li><A href="./servlet/drink">DrinkHttpServlet</A></li>
		<li><A href="./servlet/car">CarServlet</A></li>
		<%-- //點的意思就是當下路徑 //點點斜線就是往前移一個資料夾 //點點斜點點斜就是往前跳兩格--%>

	</ol>

</body>
</html>