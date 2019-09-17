<%--
  Created by IntelliJ IDEA.
  User: Prashant Pant
  Date: 3/14/2019
  Time: 11:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="resources/css/style.css" media="screen" type="text/css" />
  <style type="text/css">
    a:link, a:visited {
    background-color: #f44336;
    color: white;
    padding: 14px 25px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    }
  </style>
</head>
<body>

<div class="login-card">
<spring:form class="login-form" modelAttribute="adminDto" action="login" method="post">
    <h2>Admin Login</h2>
    <p style="color: blue"> ${commentSaved}</p>
    <p style="color: red"> ${errors}</p>

    <table align="center">
        <tr>
            <td><spring:label path="adminName">Username</spring:label></td>
            <td><spring:input id="login" path="adminName" class="fadeIn second" placeholder="Enter Username."/></td>
            <td><spring:errors path="adminName" cssClass="errors"/></td>
        </tr>
        <tr>
            <td><spring:label path="password">Password</spring:label></td>
            <td><spring:input type="password" id="password" class="fadeIn third" path="password"
                              placeholder="Enter Password."/></td>
            <td><spring:errors path="password" cssClass="errors"/></td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="Log In"/></td>
        </tr>
    </table>
    <a href="comment">WriteComment</a>
</spring:form>
</div>
<%--<form action="login" method="post">--%>
    <%--UserName<input type="text" name="adminName"/>--%>
    <%--Password<input type="password" name="password" />--%>
 <%--<input type="submit" value="login">--%>
<%--</form>--%>

</body>
</html>
