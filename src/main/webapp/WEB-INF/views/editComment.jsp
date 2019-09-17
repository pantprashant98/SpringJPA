<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Prashant Pant
  Date: 3/17/2019
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Edit Comment</h1>
<spring:form action="${pageContext.request.contextPath}/update" method="post" modelAttribute="userDto">


    <table>

        <tr>
            <td><spring:label path="username">UserName</spring:label>
            <td><spring:input path="username"/>
            <td><spring:errors path="username" cssClass="errors" ></spring:errors></td>

        <tr>
            <td><spring:label path="comment">Comment</spring:label>
            <td><spring:input path="comment"/>
            <td><spring:errors path="comment" cssClass="errors" ></spring:errors></td>


        <tr>
            <td><input type="submit" value="Update"/></td>
        </tr>

    </table>
    <spring:hidden path="id"/>
</spring:form>

</body>
</html>