<%@ include file="includes/header.jsp" %>

<shiro:guest>
      
</shiro:guest>

<shiro:user>
    <%      
        RequestDispatcher rd = request.getRequestDispatcher("/PropertyServlet");
        request.setAttribute("requestType", "allProperties");
        rd.forward(request, response);
    %>
</shiro:user>    

<%@ include file="includes/footer.jsp" %>















