<%@ include file="includes/header.jsp" %>

<div class="center">   
    <img src="images/properties/large/${property.photo}/${property.photo}.jpg">    
        <br>    
        <br>    
    <table>
            <tr><td>Street: ${property.street}<td></tr>
            <tr><td>City: ${property.city}<td></tr>
            <tr><td>Bedrooms: ${property.bedrooms}<td></tr>
            <tr><td>Bathrooms: ${property.bathrooms}<td></tr>
            <tr><td>Square Feet: ${property.squareFeet}<td></tr>
            <tr><td>BER: ${property.berRating}<td></tr>
            <tr><td>Lot Size: ${property.lotSize}<td></tr>
            <tr><td>Price: &euro;${property.price}<td></tr>
    </table>                            
</div>
                
<%@ include file="includes/footer.jsp" %>