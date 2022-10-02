<%@ taglib prefix="t" tagdir="/WEB-INF/tags" %>

<%@page import="dev.luke10x.ajar.b2b.dashboard.rest.view.SiteMap"%>

<t:genericpage>
    <jsp:attribute name="header">
      <h1>Welcome</h1>
    </jsp:attribute>
    <jsp:attribute name="footer">
      <p id="copyright">Copyright 1927, Future Bits When There Be Bits Inc.</p>
    </jsp:attribute>
    <jsp:body>
        <p>Message : ${message}</p>	
        <a href="/${SiteMap.JSP_REGISTRATION}">Registration</a>
    </jsp:body>
</t:genericpage>