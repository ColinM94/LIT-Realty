<%@ include file="includes/header.jsp" %>

<shiro:user>
<!-- Slideshow container -->
    <div class="slideshow-container">

      <!-- Full-width images with number and caption text -->
      <div class="mySlides fade">
        <div class="numbertext">1 / 3</div>
        <img src="images/properties/large/${property.photo}/${property.photo}.jpg" style="width:100%">
      </div>

      <div class="mySlides fade">
        <div class="numbertext">2 / 3</div>
        <img src="images/properties/large/${property.photo}/${property.photo}${"-1"}.jpg" style="width:100%">
      </div>

      <div class="mySlides fade">
        <div class="numbertext">3 / 3</div>
        <img src="images/properties/large/${property.photo}/${property.photo}${"-2"}.jpg" style="width:100%">
      </div>

      <!-- Next and previous buttons -->
      <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
      <a class="next" onclick="plusSlides(1)">&#10095;</a>
    </div>
    <br>

    <!-- The dots/circles -->
    <div style="text-align:center">
      <span class="dot" onclick="currentSlide(1)"></span> 
      <span class="dot" onclick="currentSlide(2)"></span> 
      <span class="dot" onclick="currentSlide(3)"></span> 
    </div>  

<div class="center">   
         
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
        
</shiro:user>
    
<shiro:guest>
    <c:redirect url="index.jsp"/>
</shiro:guest>
<%@ include file="includes/footer.jsp" %>