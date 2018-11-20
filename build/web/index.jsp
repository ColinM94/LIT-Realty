<%@ include file="includes/header.jsp" %>

<shiro:guest>
    <c:redirect url="/login.jsp"/>
</shiro:guest>

<shiro:user>
    <%      
        RequestDispatcher rd = request.getRequestDispatcher("/PropertyServlet");
        request.setAttribute("type", "allProperties");
        rd.forward(request, response);
    %>
</shiro:user>    

<%@ include file="includes/footer.jsp" %>















