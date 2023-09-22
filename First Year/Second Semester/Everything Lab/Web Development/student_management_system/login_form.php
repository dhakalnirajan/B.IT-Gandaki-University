<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <h2>Student Management System</h2>
    <form action="login.php" method="post">
        <fieldset>
            <legend>Sign In</legend>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br><br>
            
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br><br>
            
            <input type="submit" value="Login">
        </fieldset>
        <br>
        <fieldset>
            <!-- <legend>Register New Account</legend> -->
            Doesn't have account. Sign up <a href="sign_up_form.php">here</a>
        </fieldset>

        
    </form>
</body>
</html>
