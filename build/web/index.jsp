<%@ include file="includes/header.jsp" %>

<shiro:guest>
    <c:redirect url="/login.jsp"/>
</shiro:guest>

<shiro:user>
    <div class="center">
        <form action="PropertyServlet">
            <tr>
                <td><input type="submit" value="Update" /></td>
            </tr>         
        </form>
        <br>
        
        <table id="example" class="display" style="width:100%">
        <thead>
            <tr>
                <th>ID</th>
                <th>Street</th>
                <th>City</th>
                <th>Bedrooms</th>
                <th>Bathrooms</th>
                <th>Square Feet</th>
                <th>BER</th>
                <th>Lot Size</th>
                <th>Price</th>
                <th>Image</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${properties}" var="property">
                <tr>
                    <td>${property.id}</td>
                    <td>${property.street}</td>
                    <td>${property.city}</td>
                    <td>${property.bedrooms}</td>
                    <td>${property.bathrooms}</td>
                    <td>${property.squareFeet}</td>
                    <td>${property.berRating}</td>
                    <td>${property.lotSize}</td>
                    <td>&euro;${property.price}</td>
                    <td><img src="images/properties/thumbs/${property.photo}" height="50" width="75"></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    </div>
    
    
</shiro:user>

<jsp:include page="includes/footer.jsp" />
