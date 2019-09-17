<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Prashant Pant
  Date: 3/15/2019
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="resources/css/style.css" media="screen" type="text/css" />
    <title>Title</title>
    <style type="text/css">

        .errors {
            color: red;
        }

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
<spring:form action="comment" method="post" modelAttribute="userDto">


    <table>

        <tr>
            <td><spring:label path="username">UserName</spring:label></td>
            <td><spring:input path="username"/></td>
            <td><spring:errors path="username" cssClass="errors" ></spring:errors></td>
        </tr>

        <tr>
            <td><spring:label path="comment">Comment</spring:label></td>
            <td><spring:textarea path="comment" rows="5" cols="25"/></td>
            <td><spring:errors path="comment" cssClass="errors" ></spring:errors></td>
        </tr>


        <tr>
            <td><input type="submit" value="Save"/></td>
        </tr>

        <tr>
            <td><a href="/login">AdminLogin</a></td>
        </tr>
    </table>
    <p style="color: green"> ${commentSaved}</p>

</spring:form>
</div>

</body>
</html>
