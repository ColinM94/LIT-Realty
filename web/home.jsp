<%@ include file="includes/header.jsp" %>

<a href="newProperty.jsp">Add New Property</a>
<div class="center">       
    <table id="dataTable" class="display" style="width:100%;">
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
                <th></th>
                <th></th>
                <th></th>
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
                    <td><a href="<%=request.getContextPath()%>/PropertyServlet?id=${property.id}&type=edit">Edit</a></td>
                    <td><a href="<%=request.getContextPath()%>/PropertyServlet?id=${property.id}&type=delete">X</a></td>
                    <td><a href="<%=request.getContextPath()%>/PropertyServlet?id=${property.id}&type=property"><img src="images/properties/thumbs/${property.photo}.jpg" height="50" width="75"></a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>
                
<%@ include file="includes/footer.jsp" %>