<%@ include file="includes/header.jsp" %>

<shiro:guest>
    <div class="center">
        <h1> Welcome to LIT Realty</h1>
        <p>Please login to access our site</p>
    </div>
</shiro:guest>

<shiro:user>
    <div class="center">
            <p>Welcome to LIT Realty Home Page</p>
    </div>
</shiro:user>

<jsp:include page="includes/footer.jsp" />
