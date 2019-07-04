<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test</title>
</head>
<%
    String contextPath = request.getContextPath();
%>
<body>
<a href="<%=contextPath%>/test/save.html">save</a><br/>
<a href="<%=contextPath%>/test/saveTxTest.html">saveTxTest</a><br/>
<a href="<%=contextPath%>/test/redis.html">redis</a><br/>
</body>
</html>