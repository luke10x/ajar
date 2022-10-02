<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@page import="dev.luke10x.ajar.b2b.dashboard.rest.view.SiteMap"%>

<html>
    <head>
        <meta http-equiv="Content-Type" 
          content="text/html; charset=ISO-8859-1">
        <title>User Registration</title>
    </head>
    <body>

        <p>Message : ${message}</p>	
        <a href="/${SiteMap.JSP_REGISTRATION}">Registration</a>
    </body>
</html>