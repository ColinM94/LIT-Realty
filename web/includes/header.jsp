<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <link href="https://fonts.googleapis.com/css?family=Titillium+Web" rel="stylesheet">
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
            
            