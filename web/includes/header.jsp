<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Titillium+Web">
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.10.19/css/jquery.dataTables.min.css">
        
	<script type="text/javascript" language="javascript" src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<script type="text/javascript" language="javascript" src="https://cdn.datatables.net/1.10.19/js/jquery.dataTables.min.js"></script>
	<script>
            $(document).ready(function() {$('#example').DataTable();} );
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
            </div>
        </header>
        
        <div class="container">
            <div class="content">
            
            