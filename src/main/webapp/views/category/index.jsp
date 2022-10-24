<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    .error {
        color: red;
    }
</style>
<spring:url value=""/>
<spring:message
<form:form action="/categories" method="post" modelAttribute="category">
    <form:label path="title">Title: </form:label>
    <form:input path="title"/>
    <form:errors path="title" cssClass="error"/>
    <form:label path="slug">Slug: </form:label>
    <form:input path="slug"/>
    <input type="submit" value="Submit">
</form:form>