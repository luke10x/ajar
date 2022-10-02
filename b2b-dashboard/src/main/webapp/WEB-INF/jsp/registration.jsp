<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<t:genericpage>
  <jsp:attribute name="header"><%@ include file="_header.jsp" %></jsp:attribute>
  <jsp:attribute name="footer"><%@ include file="_footer.jsp" %></jsp:attribute>
  <jsp:body>
    <form:form method="POST" modelAttribute="user">
      <form:label path="email">Email: </form:label>
      <form:input path="email" type="text"/>
      <form:label path="password">Password: </form:label>
      <form:input path="password" type="password" />
      <input type="submit" value="Submit" />
    </form:form>
    <a href="/">Back</a>
  </jsp:body>
</t:genericpage>