<%@ include file="includes/header.jsp" %>

<shiro:guest>
    <c:redirect url="/login.jsp"/>
</shiro:guest>

<shiro:user>
    <div class="center">
        <p>Welcome to LIT Realty Home Page</p>
        
        <form action="PropertyServlet">
            <tr>
                <td>ID</td>
                <td><input type="text" name="id"</td>
            </tr>
            <tr>
                <td><input type="submit" value="Search" /></td>
            </tr>         
        </form>
        <br>
        
        <table>
            <tr><td>City: ${city}</td></tr>
            <tr><td>ID: ${id}</td></tr>
        </table>
    </div>
    
    
</shiro:user>

<jsp:include page="includes/footer.jsp" />
