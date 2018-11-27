<%@page import="org.apache.shiro.subject.Subject"%>
<%@page import="org.apache.shiro.SecurityUtils"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Subject currentUser = SecurityUtils.getSubject();
    String a = (String)currentUser.getPrincipal();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Titillium+Web">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        
	<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script>
            $(document).ready(function() {$('#dataTable').DataTable({
                // Disables ordering on selected columns. 
                "aoColumnDefs": [ { "bSortable": false, "aTargets": [ 9, 10, 11 ] } ] } );
            });

            // Handles property images slideshow.
            var slideIndex = 1;
            showSlides(slideIndex);

            // Next/previous controls
            function plusSlides(n) {
              showSlides(slideIndex += n);
            }

            // Thumbnail image controls
            function currentSlide(n) {
              showSlides(slideIndex = n);
            }

            function showSlides(n) {
              var i;
              var slides = document.getElementsByClassName("mySlides");
              var dots = document.getElementsByClassName("dot");
              if (n > slides.length) {slideIndex = 1} 
              if (n < 1) {slideIndex = slides.length}
              for (i = 0; i < slides.length; i++) {
                  slides[i].style.display = "none"; 
              }
              for (i = 0; i < dots.length; i++) {
                  dots[i].className = dots[i].className.replace(" active", "");
              }
              slides[slideIndex-1].style.display = "block"; 
              dots[slideIndex-1].className += " active";
            }
        </script>
   
        <title>LIT Realty</title>     
    </head>
    
    <body>
        <header>
            <div class="container">            
                <div class="logo">
                    <a href="index.jsp">
                        <img src="images/logo.png" width="200">
                    </a>
                </div>
                
                <nav>
                    <shiro:user>
                        <a class="headerBtn" href="logout.jsp"><li>Log Out</li></a>
                    </shiro:user>

                    <shiro:guest>
                        <a class="headerBtn" href="login.jsp"><li>Login</li></a>
                    </shiro:guest>
                </nav>
                <shiro:user>
                <nav>
                    <img id="headerPic" src="images/agents/1.jpg">
                </nav>
                </shiro:user>
            </div>
        </header>
        
        <div class="container">
            <div class="content">
            
            