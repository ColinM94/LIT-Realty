<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>LIT Realty Login</title>
    </head>
    <body>
        <shiro:guest>
        <form name="loginForm" method="post">
            <c:if test="${shiroLoginFailure != null}">
                Username or password incorrect
            </c:if>
            <table cellspacing="2" cellpadding="2">
                <tr>
                    <td><label for="username">Username:</label></td>
                    <td><input type="text" name="username"/><td>
                </tr>
                <tr>
                    <td><label for="password">Password:</label></td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Login"/></td>
                    <td><input type="reset" value="Reset"/></td>
                </tr>
            </table>
            <br/>
            <label for="rememberMe">Remember me:</label>
            <input type="checkbox" name="rememberMe" value="true" />
            <br/>
        </form>
        </shiro:guest>

        <shiro:user>
            You are already logged in.
            <br>
            <a href="/ShiroSoln/logout">Log Out</a>
        </shiro:user>
    </body>
</html>
