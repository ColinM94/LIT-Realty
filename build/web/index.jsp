<%@ include file="includes/header.jsp" %>

<shiro:guest>
<form name="searchForm" class="center" id="propertyForm" action="${pageContext.request.contextPath}/PropertyServlet" method="post">
    <h1>Property Search</h1>
    <table cellspacing="1" cellpadding="2">
        <tr>
            <td><label for="minPrice">Minimum Price</label></td>
            <td><input class="propertyField" id="minPrice" type="text" name="minPrice"/></td>
        </tr>
        <tr>
            <td><label for="maxPrice">Maximum Price</label></td>
            <td><input class="propertyField" id="price" type="text" name="maxPrice"/></td>
        </tr>
        <tr>
            <td><label for="city">City</label></td>
            <td><input class="propertyField" id="city" type="text" name="city"/></td>
        </tr>
        <tr>
            <td></td>
        </tr>
        <input type="hidden" name="requestType" value="search"/>
        <tr>
            <td colspan="2">
                <input type="submit" id="submitBtn" value="Search"/>
            </td>
        </tr> 
    </table>
</form>
    <br><br><br>
<form name="searchForm" class="center" id="propertyForm" action="${pageContext.request.contextPath}/PropertyServlet" method="post">
    <input type="hidden" name="requestType" value="properties"/>
    <input type="submit" id="submitBtn" value="View All Properties"/>
</form>
</shiro:guest>

<shiro:user>
    <%      
        RequestDispatcher rd = request.getRequestDispatcher("/PropertyServlet");
        request.setAttribute("requestType", "allProperties");
        rd.forward(request, response);
    %>
</shiro:user>    

<%@ include file="includes/footer.jsp" %>















