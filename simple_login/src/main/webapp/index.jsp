<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<style type="text/css">
    .login {
        height: 180px;
        width: 230px;
        margin: 0;
        padding: 10px;
        border: 1px solid #ccc;
    }
    .login input {
        padding: 5px;
        margin: 5px;
    }
</style>
<body>
    <form action="/login" method="post">
        <div class = "login">
            <h2>Login</h2>
            <input type="text" placeholder="username" name="username" />
            <input type="password" placeholder="password" name="password" />
            <input type="submit" value="Sign-in">
        </div>
    </form>
</body>
</html>