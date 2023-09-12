<!DOCTYPE html>
<html>
<head>
    <title>Signup</title>
    <style>
        .error {
            color: red;
        }
    </style>
    <script>
        function validateForm() {
            let name = document.getElementById('username').value;
            let phone = document.getElementById('phone').value;
            let email = document.getElementById('email').value;
            let password = document.getElementById('password').value;
            let rePassword = document.getElementById('rePassword').value;

            let nameError = document.getElementById('userNameError');
            let phoneError = document.getElementById('phoneError');
            let emailError = document.getElementById('emailError');
            let passwordError = document.getElementById('passwordError');
            let rePasswordError = document.getElementById('rePasswordError');

            let phonePattern = /^\d{10}$/;
            let emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
            let passwordPattern = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,}$/;

            if (name) {
                nameError.textContent = '';
            } else {
                nameError.textContent = 'Please enter your username.';
            }

            if (phone) {
                if (phonePattern.test(phone)) {
                    phoneError.textContent = '';
                } else {
                    phoneError.textContent = 'Please enter a valid 10-digit phone number.';
                }
            } else {
                phoneError.textContent = 'Please enter your phone number.';
            }

            if (email) {
                if (emailPattern.test(email)) {
                    emailError.textContent = '';
                } else {
                    emailError.textContent = 'Please enter a valid email address.';
                }
            } else {
                emailError.textContent = 'Please enter your email address.';
            }

            if (password) {
                if (passwordPattern.test(password)) {
                    passwordError.textContent = '';
                } else {
                    passwordError.textContent = 'Password must have at least one uppercase letter, one lowercase letter, one digit, and be at least 6 characters long.';
                }
            } else {
                passwordError.textContent = 'Please enter a password.';
            }

            if (rePassword) {
                if (password === rePassword) {
                    rePasswordError.textContent = '';
                } else {
                    rePasswordError.textContent = 'Passwords do not match.';
                }
            } else {
                rePasswordError.textContent = 'Please re-enter your password.';
            }


            return !(nameError.textContent || phoneError.textContent || emailError.textContent || passwordError.textContent || rePasswordError.textContent);
        }
    </script>
</head>
<body>
    <h2>Signup</h2>
    <form action="signup.php" method="post" onsubmit="return validateForm()">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username">
        <span class="error" id="userNameError"></span><br><br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password">
        <span class="error" id="passwordError"></span><br><br>

        <label for="rePassword">Re-enter Password:</label>
        <input type="password" id="rePassword" name="rePassword">
        <span class="error" id="rePasswordError"></span><br><br>

        <label for="phone">Phone:</label>
        <input type="tel" id="phone" name="phone">
        <span class="error" id="phoneError"></span><br><br>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        <span class="error" id="emailError"></span><br><br>
        
        <input type="submit" value="Signup">
    </form>
</body>
</html>
